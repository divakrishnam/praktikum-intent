package com.divakrishnam.praktikumintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callCenter(View view) {
        String phone = "0222009562";
        Uri uri = Uri.parse("tel:"+phone);
        Intent call = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(call);
    }

    public void webPoltekpos(View view) {
        String url = "http://poltekpos.ac.id/";
        Uri uri = Uri.parse(url);
        Intent web = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(web);
    }

    public void registrasi(View view) {
        Intent reg = new Intent(this, RegistrasiActivity.class);
        startActivity(reg);
    }
}
