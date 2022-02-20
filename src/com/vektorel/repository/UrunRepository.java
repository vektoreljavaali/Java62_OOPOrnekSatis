package com.vektorel.repository;

import com.vektorel.repository.entity.Urun;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrunRepository {
    private List<Urun> urunList = new ArrayList<>();
    Random random = new Random();
    public void RestGelenUrunOlustur(){
        for (long i=1;i<8;i++){
            Urun urun =
                    new Urun(i,"Ürün-"+i,
                            "A Marka",
                            "C Model",
                            "Adet",
                            random.nextInt(100),
                            2800,
                            3680,
                            18
                            );
            urunList.add(urun);
        }
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }
}
