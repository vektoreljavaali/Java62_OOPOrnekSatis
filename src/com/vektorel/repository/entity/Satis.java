package com.vektorel.repository.entity;

import java.util.Date;

public class Satis {
    long id;
    long musteriid;
    long urunid;
    Date satistarihi;
    Date islemtarihi;
    double birimfiyat;
    int adet;
    double toplamfiyat;

    public Satis(long id, long musteriid, long urunid, Date satistarihi, Date islemtarihi, double birimfiyat, int adet, double toplamfiyat) {
        this.id = id;
        this.musteriid = musteriid;
        this.urunid = urunid;
        this.satistarihi = satistarihi;
        this.islemtarihi = islemtarihi;
        this.birimfiyat = birimfiyat;
        this.adet = adet;
        this.toplamfiyat = toplamfiyat;
    }

    public Satis() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(long musteriid) {
        this.musteriid = musteriid;
    }

    public long getUrunid() {
        return urunid;
    }

    public void setUrunid(long urunid) {
        this.urunid = urunid;
    }

    public Date getSatistarihi() {
        return satistarihi;
    }

    public void setSatistarihi(Date satistarihi) {
        this.satistarihi = satistarihi;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }
}
