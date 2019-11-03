package com.divakrishnam.praktikumintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class RegistrasiActivity extends AppCompatActivity {

    private EditText etNama, etAlamat, etEmail, etTelpon;
    private RadioButton rbLaki, rbPerempuan;
    private CheckBox cbMakan, cbMinum, cbTidur;
    private Spinner spProdi;
    private String[] listProdi = {
            "Teknik Informatika",
            "Manajemen Informatika",
            "Logistik Bisnis",
            "Akuntasi",
            "Manajemen Bisnis"
    };

    String prodi = "";

    ArrayAdapter<String> prodiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        etNama = findViewById(R.id.etNama);
        etAlamat = findViewById(R.id.etAlamat);
        etEmail = findViewById(R.id.etEmail);
        etTelpon = findViewById(R.id.etTelpon);
        rbLaki = findViewById(R.id.rbLaki);
        rbPerempuan = findViewById(R.id.rbPerempuan);
        cbMakan = findViewById(R.id.cbMakan);
        cbMinum = findViewById(R.id.cbMinum);
        cbTidur = findViewById(R.id.cbTidur);
        spProdi = findViewById(R.id.spProdi);

        prodiAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, listProdi);

        spProdi.setAdapter(prodiAdapter);

        spProdi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                prodi = prodiAdapter.getItem(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void kirim(View view) {

        boolean status = false;
        StringBuilder hobi = new StringBuilder();
        String jenisKelamin;

        String nama = etNama.getText().toString();
        String alamat = etAlamat.getText().toString();
        String email = etEmail.getText().toString();
        String telpon = etTelpon.getText().toString();

        if(nama.isEmpty()){
            status = true;
            etNama.setError("Harap isi Nama!");
        }

        if(alamat.isEmpty()){
            status = true;
            etAlamat.setError("Harap isi Alamat!");
        }

        if(email.isEmpty()){
            status = true;
            etEmail.setError("Harap isi Email!");
        }

        if(telpon.isEmpty()){
            status = true;
            etTelpon.setError("Harap isi No. Telpon!");
        }

        if (rbLaki.isChecked()){
            jenisKelamin = rbLaki.getText().toString();
        }else {
            jenisKelamin = rbPerempuan.getText().toString();
        }

        if (cbTidur.isChecked()){
            hobi.append("\n- ").append(cbTidur.getText().toString());
        }

        if (cbMinum.isChecked()){
            hobi.append("\n- ").append(cbMinum.getText().toString());
        }

        if (cbMakan.isChecked()){
            hobi.append("\n- ").append(cbMakan.getText().toString());
        }

        if (!status){
            Registrasi reg = new Registrasi(nama, alamat, email, telpon, jenisKelamin, hobi.toString(), prodi);
            Intent kirim = new Intent(this, ViewRegistrasiActivity.class);
            kirim.putExtra(ViewRegistrasiActivity.REGISTRASI, reg);
            startActivity(kirim);
        }
    }
}
