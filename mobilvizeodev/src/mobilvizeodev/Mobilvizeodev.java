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
public class Mobilvizeodev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AkıllıTv_Kumandasi aa=new AkıllıTv_Kumandasi("Toshina", 30, 500, "Kalem", 5, 500, 2, false);
        NormalTv_Kumandasi ntv = new NormalTv_Kumandasi("Arçelik", 30, 50, "Büyük", 5, 200, 3, false);
        ntv.c_Ac();
        System.out.println(ntv.getTv_id());
        System.out.println(ntv.tv_adet);
        System.out.println(ntv.getPil());
        
       //Tv_Kumandasi tv =new Tv_Kumandasi("Toshiba", 30, 50,"Kalem",5,500, 2, false);
      
       //System.out.println(tv.getPil());
      
       aa.c_Ac();
       aa.k_geri();
       aa.ses_Azalt();
       aa.ses_Azalt();
       aa.ses_Azalt();
       System.out.println(aa.getSes_Seviyesi());
       System.out.println(aa.getKanal());

       System.out.println(aa.getTv_id());
       System.out.println(aa.getF_ISIM());
       System.out.println("Klima İle İlgili İşlemler Aşağıdadır...");
       Klima_Kumandasi kk = new Klima_Kumandasi("Arçelik", 30,"Küçük",5, 50, 2, false);
       kk.c_Ac();
       kk.sıcak_Azalt();
       kk.sıcak_Azalt();
       kk.sıcak_Azalt();
       kk.sıcak_Arttir();
       System.out.println(kk.getGirilen_Sıcaklik());
       System.out.println(kk.getPil());
       System.out.println(kk.getKl_id());
       System.out.println(kk.getF_ISIM());     
       
       
    }
    
}
