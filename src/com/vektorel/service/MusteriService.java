package com.vektorel.service;

import com.vektorel.repository.MusteriRepsitory;
import com.vektorel.repository.entity.Musteri;

import java.util.List;
import java.util.Scanner;

public class MusteriService {

    public Musteri musteriSec(){
        MusteriRepsitory musteriRepsitory = new MusteriRepsitory();
        musteriRepsitory.RastGeleMusteriListesiOlustur();
        List<Musteri> mlist = musteriRepsitory.getMusteriList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Müşteri Listesi");
        /**
         * Müşteri listesi kader dönecek bir for döngüsü oluşturup müşteri
         * listesini yazdırıyoruz.
         */
        for (int i=0;i<mlist.size();i++){
            /**
             * DİKKAT! her seferinde müşteri listesinden veri çekmek yerine
             * bir defa çekerek işlem yapınız.
             */
            Musteri mst = mlist.get(i);
            System.out.print("SNo: "+(i+1));
            System.out.print(", Ad: "+mst.getAd());
            System.out.print(", Soyad: "+mst.getSoyad());
            System.out.print(", Telefon: "+mst.getTelefon());
            System.out.println();
        }
        System.out.print("Müşteri Seç....: ");
        int musterisirano = scanner.nextInt() - 1;
        Musteri secilenMusteri = mlist.get(musterisirano);
        System.out.println("Seçilen Müşteri..: "+ secilenMusteri.getAd());
        return secilenMusteri;
    }
}
