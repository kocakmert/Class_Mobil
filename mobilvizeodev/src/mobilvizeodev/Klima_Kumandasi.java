/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilvizeodev;

import java.util.Random;

/**
 *
 * @author kocak
 */
public class Klima_Kumandasi extends Kumanda {
    private final String URETILEN_MARKA;
    private int girilen_Sıcaklik;
    private String kl_id="KL-";
    public static  int kl_adet;
    private Pil pil;
    public Klima_Kumandasi( final String  URETILEN_MARKA, int girilen_Sıcaklik,String pil_Tur,int voltaj ,int k_Tussayi, int pil_Sayi, Boolean c_Durum) {
        super(k_Tussayi, pil_Sayi, c_Durum);
        this.URETILEN_MARKA = URETILEN_MARKA;
        this.girilen_Sıcaklik = girilen_Sıcaklik;
        this.kl_id = setKl_id();
        pil = new Pil(pil_Tur,voltaj); //pil turunden nesne
        kl_adet++;
    }
    
    public String getURETILEN_MARKA() {
        return URETILEN_MARKA;
    }

    public int getGirilen_Sıcaklik() {
        return girilen_Sıcaklik;
    }

    public void setGirilen_Sıcaklik(int girilen_Sıcaklik) {
        this.girilen_Sıcaklik = girilen_Sıcaklik;
    }

    public String getKl_id() {
        return kl_id;
    }

    public String setKl_id() {
        Random rand = new Random(); 
        int i=0;
        while(i<7){
            int value = rand.nextInt(9);
            this.kl_id +=String.valueOf(value);
            i++;
        }
        return this.kl_id;
    }

    public static int getKl_adet() {
        return kl_adet;
    }

    public static void setKl_adet(int kl_adet) {
        Klima_Kumandasi.kl_adet = kl_adet;
    }
    
    public void sıcak_Arttir(){
        if(getGirilen_Sıcaklik()<43){
            girilen_Sıcaklik++;
            setGirilen_Sıcaklik(girilen_Sıcaklik);
        }
    }
    public void sıcak_Azalt(){
        if(getGirilen_Sıcaklik()>10){
            girilen_Sıcaklik--;
            setGirilen_Sıcaklik(girilen_Sıcaklik);
        }
    }
    public void istenen_Sicak(int i_sıcaklik){
        if(getC_Durum()== true && i_sıcaklik <43 && i_sıcaklik >10  ){
            setGirilen_Sıcaklik(i_sıcaklik);
        }
    }

    public String getPil() {
        return pil.getPil_Tur();
    }

    public void setPil(Pil pil) {
        this.pil = pil;
    }
    
    @Override
    public Boolean c_Ac() {
        if(getC_Durum() ==false){
            setC_Durum(true);
            System.out.println("Klima Açılıyor...");
        }
        return getC_Durum();
    }
    @Override
    public Boolean c_Kapat() {
        if(getC_Durum() ==true){
            setC_Durum(false);
            System.out.println("Klima Kapanıyor...");
        }
        return getC_Durum();
    }
    @Override
    public void p_Bitiyor() {
       System.out.println("!!! Klima Kumandasının Pili Bitiyor !!!");
    } 
}
