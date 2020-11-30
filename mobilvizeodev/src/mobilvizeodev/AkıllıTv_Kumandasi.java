/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilvizeodev;

/**
 *
 * @author kocak
 */
public class AkıllıTv_Kumandasi extends Tv_Kumandasi implements Akilli_Ozellik{
    
    public AkıllıTv_Kumandasi(final String URETILEN_MARKA, int ses_Seviyesi, int kanal, String pil_Tur, int voltaj, int k_Tussayi, int pil_Sayi, Boolean c_Durum) {
        super(URETILEN_MARKA, ses_Seviyesi, kanal, pil_Tur, voltaj, k_Tussayi, pil_Sayi, c_Durum);
    }

    @Override
    public void internete_Gir() {
       //Yapılacaklar yazılabilir...
    }

    @Override
    public void uygulama_Yukle() {
       //Yapılacaklar yazılabilir...
    }

    @Override
    public void wifi_Baglan() {
        //Yapılacaklar yazılabilir...
    }
    
}
