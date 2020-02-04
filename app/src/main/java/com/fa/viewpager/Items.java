package com.fa.viewpager;

import java.util.ArrayList;

public class Items {
    private String namaMenu;
    public static ArrayList<Makanan> data;

    public static class Makanan{
        private String nama;
        private String harga;

        public Makanan(String menu, String price){
            this.nama = menu;
            this.harga = price;
        }
    }
    public Items(String namamenu, ArrayList<Makanan> Data){
        this.namaMenu = namamenu;
        this.data = Data;
    }
    public String getNamaMenu(){
        return namaMenu;
    }
    public ArrayList<Makanan> getData(){
        return data;
    }
}
