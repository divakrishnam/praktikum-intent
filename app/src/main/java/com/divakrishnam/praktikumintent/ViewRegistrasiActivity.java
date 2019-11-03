package com.divakrishnam.praktikumintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ViewRegistrasiActivity extends AppCompatActivity {

    TextView tvNama, tvAlamat, tvEmail, tvTelpon, tvJenisKelamin, tvHobi, tvProdi;

    public static final String REGISTRASI = "registrasi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_registrasi);

        tvNama = findViewById(R.id.tvNama);
        tvAlamat = findViewById(R.id.tvAlamat);
        tvEmail = findViewById(R.id.tvEmail);
        tvTelpon = findViewById(R.id.tvTelpon);
        tvJenisKelamin = findViewById(R.id.tvJenisKelamin);
        tvHobi = findViewById(R.id.tvHobi);
        tvProdi = findViewById(R.id.tvProdi);

        Intent intent = getIntent();
        Registrasi reg = intent.getParcelableExtra(REGISTRASI);

        tvNama.setText("Nama : "+reg.getNama());
        tvAlamat.setText("Alamat : "+reg.getAlamat());
        tvEmail.setText("E-mail : "+reg.getEmail());
        tvTelpon.setText("No. Telepon : "+reg.getTelpon());
        tvJenisKelamin.setText("Jenis Kelamin : "+reg.getJenisKelamin());
        tvHobi.setText("Hobi : "+reg.getHobi());
        tvProdi.setText("Program Studi : "+reg.getProdi());
    }
}
