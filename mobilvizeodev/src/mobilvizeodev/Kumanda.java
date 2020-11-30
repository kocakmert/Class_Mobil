/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilvizeodev;

import java.util.Date;
/**
 *
 * @author kocak
 */
public abstract class Kumanda {
    private final String F_ISIM;
    private int k_Tussayi;
    private int pil_Sayi;
    private Date u_Tarih;
    private Boolean c_Durum;
    public Kumanda(int k_Tussayi, int pil_Sayi, Boolean c_Durum) {
        this.F_ISIM="KGF";
        this.k_Tussayi = k_Tussayi;
        this.pil_Sayi = pil_Sayi;
        u_Tarih=new Date();
        this.c_Durum = c_Durum;
    }
    public int getK_Tussayi() {
        return k_Tussayi;
    }
    public void setK_Tussayi(int k_Tussayi) {
        this.k_Tussayi = k_Tussayi;
    }
    public int getPil_Sayi() {
        return pil_Sayi;
    }
    public void setPil_Sayi(int pil_Sayi) {
        this.pil_Sayi = pil_Sayi;
    }
    public Date getU_Tarih() {
        return u_Tarih;
    }
    public void setU_Tarih(Date u_Tarih) {
        this.u_Tarih = u_Tarih;
    }
    public Boolean getC_Durum() {
        return c_Durum;
    }
    public void setC_Durum(Boolean c_Durum) {
        this.c_Durum = c_Durum;
    }
    public String getF_ISIM() {
        return F_ISIM;
    }
    public abstract Boolean c_Ac();
    public abstract Boolean c_Kapat();
    public abstract void p_Bitiyor();
             
    
}
