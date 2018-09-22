package com.example.eunra.myapplication;

public class country {
    private String ten;
    private int loca;
    private int hinh;

    public country(String ten, int loca, int hinh) {
        this.ten = ten;
        this.loca = loca;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLoca() {
        return loca;
    }

    public void setLoca(int loca) {
        this.loca = loca;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
