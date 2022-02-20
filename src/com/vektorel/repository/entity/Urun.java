package com.vektorel.repository.entity;

public class Urun {
    /**
     * Benzersiz bir sıra numarası, kmilik veririz.
     * id -> Identifier
     */
    long id;
    String  ad;
    String marka;
    String model;
    String birim;
    int stokmiktari;
    double alisfiyati;
    double satisfiyati;
    int kdv;

    public Urun() {
    }

    public Urun(long id, String ad, String marka, String model, String birim, int stokmiktari, double alisfiyati, double satisfiyati, int kdv) {
        this.id = id;
        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.birim = birim;
        this.stokmiktari = stokmiktari;
        this.alisfiyati = alisfiyati;
        this.satisfiyati = satisfiyati;
        this.kdv = kdv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getStokmiktari() {
        return stokmiktari;
    }

    public void setStokmiktari(int stokmiktari) {
        this.stokmiktari = stokmiktari;
    }

    public double getAlisfiyati() {
        return alisfiyati;
    }

    public void setAlisfiyati(double alisfiyati) {
        this.alisfiyati = alisfiyati;
    }

    public double getSatisfiyati() {
        return satisfiyati;
    }

    public void setSatisfiyati(double satisfiyati) {
        this.satisfiyati = satisfiyati;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }
}
