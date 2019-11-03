package com.divakrishnam.praktikumintent;

import android.os.Parcel;
import android.os.Parcelable;

public class Registrasi implements Parcelable {
    private String nama;
    private String alamat;
    private String email;
    private String telpon;
    private String jenisKelamin;
    private String hobi;
    private String prodi;

    public Registrasi(String nama, String alamat, String email, String telpon, String jenisKelamin, String hobi, String prodi) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.telpon = telpon;
        this.jenisKelamin = jenisKelamin;
        this.hobi = hobi;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Registrasi() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.email);
        dest.writeString(this.telpon);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.hobi);
        dest.writeString(this.prodi);
    }

    protected Registrasi(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.email = in.readString();
        this.telpon = in.readString();
        this.jenisKelamin = in.readString();
        this.hobi = in.readString();
        this.prodi = in.readString();
    }

    public static final Creator<Registrasi> CREATOR = new Creator<Registrasi>() {
        @Override
        public Registrasi createFromParcel(Parcel source) {
            return new Registrasi(source);
        }

        @Override
        public Registrasi[] newArray(int size) {
            return new Registrasi[size];
        }
    };
}
