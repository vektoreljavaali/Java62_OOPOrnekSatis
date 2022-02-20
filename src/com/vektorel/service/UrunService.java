package com.vektorel.service;

import com.vektorel.repository.UrunRepository;
import com.vektorel.repository.entity.Urun;

import java.util.List;
import java.util.Scanner;

public class UrunService {

    public Urun urunSec(){
        Scanner scanner = new Scanner(System.in);
        UrunRepository urunRepository = new UrunRepository();
        urunRepository.RestGelenUrunOlustur();
        List<Urun> uList = urunRepository.getUrunList();

        System.out.println("**** ÜRÜN SEÇ  *****");
        for (int i=0;i<uList.size();i++){
            Urun urun = uList.get(i);
            System.out.print("SNo: "+(i+1));
            System.out.print(", UrunAdı: "+urun.getAd());
            System.out.print(", Marka: "+urun.getMarka());
            System.out.print(", Model: "+urun.getModel());
            System.out.println();
        }
        System.out.print("Ürün Seç...: ");
        int secilenurunsirano = scanner.nextInt()-1;
        Urun secilenUrun = uList.get(secilenurunsirano);
        System.out.println("Seçilen Ürün...: "+secilenUrun.getAd());
        return secilenUrun;
    }

}
