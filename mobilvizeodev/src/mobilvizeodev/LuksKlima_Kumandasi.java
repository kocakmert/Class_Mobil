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
public class LuksKlima_Kumandasi extends Klima_Kumandasi implements Luks_Ozellik{
    
    public LuksKlima_Kumandasi(final String URETILEN_MARKA, int girilen_Sıcaklik, String pil_Tur, int voltaj, int k_Tussayi, int pil_Sayi, Boolean c_Durum) {
        super(URETILEN_MARKA, girilen_Sıcaklik, pil_Tur, voltaj, k_Tussayi, pil_Sayi, c_Durum);
    }

    @Override
    public void turbo_sogutma() {
        //Yapılacak İşlemler...
    }

    @Override
    public void ısıtma() {
        //Yapılacak İşlemler...
    }
    
}
