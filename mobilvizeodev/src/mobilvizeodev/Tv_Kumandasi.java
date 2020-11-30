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
public class Tv_Kumandasi extends Kumanda {
    private final String URETILEN_MARKA;
    private int ses_Seviyesi;
    private int kanal;
    private String tv_id="TV-";
    private Pil pil;
    public static  int tv_adet;
    
    public Tv_Kumandasi(final String URETILEN_MARKA, int ses_Seviyesi, int kanal,String pil_Tur,int voltaj,int k_Tussayi, int pil_Sayi, Boolean c_Durum) {
        super(k_Tussayi, pil_Sayi, c_Durum);
        this.URETILEN_MARKA = URETILEN_MARKA;
        this.ses_Seviyesi = ses_Seviyesi;
        this.kanal = kanal;
        this.tv_id =setTv_id();
        pil = new Pil(pil_Tur,voltaj);  //Pil türünden nesne.
        tv_adet++;
    }
    
    public String getURETILEN_MARKA() {
        return URETILEN_MARKA;
    }

    public String getTv_id() {
        return tv_id;
    }

    public String setTv_id() {
        Random rand = new Random(); 
        int i=0;
        while(i<7){
            int value = rand.nextInt(9);
            this.tv_id +=String.valueOf(value);
            i++;
        }
        return this.tv_id;
    }
    public int getSes_Seviyesi() {
        return ses_Seviyesi;
    }

    public void setSes_Seviyesi(int ses_Seviyesi) {
        this.ses_Seviyesi = ses_Seviyesi;
    }

    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        this.kanal = kanal;
    }
     public int getTv_adet() {
        return tv_adet;
    }

    public void setTv_adet(int tv_adet) {
        Tv_Kumandasi.tv_adet = tv_adet;
    }

    public String getPil() {
        return pil.getPil_Tur();
    }

    public void setPil(Pil pil) {
        this.pil = pil;
    }

    @Override
    public Boolean c_Ac() {
       if(getC_Durum() == false){
           setC_Durum(true);
           System.out.println("Tv Açılıyor...");
       }
       return getC_Durum();
    }

    @Override
    public Boolean c_Kapat() {
        if(getC_Durum() ==true){
           setC_Durum(false);
           System.out.println("TV Kapanıyor...");
       }
       return getC_Durum();
    }
    @Override
    public void p_Bitiyor() {
         System.out.println("Pil Seviyeniz Azaldı.");
    }  
    public void  ses_Arttır(){
        if(getSes_Seviyesi()<30){
            setSes_Seviyesi(ses_Seviyesi++);
        }
    }
    public void ses_Azalt(){
        if(getSes_Seviyesi()>0){
            ses_Seviyesi--;
            setSes_Seviyesi(ses_Seviyesi);
        }
    }
    public void k_ileri(){
        if(getKanal()<500){
            kanal++;
            setKanal(kanal);
        }
    }
    public void k_geri(){
        if(getKanal()>0){
            kanal--;
            setKanal(kanal);
        }
    }
    public void istenen_kanal(int i_kanal){
        if(getC_Durum() == true && i_kanal>0 && i_kanal<500){
            setKanal(i_kanal);
        }
    } 
}
