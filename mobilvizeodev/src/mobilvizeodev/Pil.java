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
public class Pil {
    public String pil_Tur;
    private int pil_Voltaj;
    public String getPil_Tur() {
        return pil_Tur;
    }
    public Pil(String pil_Tur, int pil_Voltaj) {
        this.pil_Tur = pil_Tur;
        this.pil_Voltaj = pil_Voltaj;
    }
    public void setPil_Tur(String pil_Tur) {
        this.pil_Tur = pil_Tur;
    }
    public int getPil_Voltaj() {
        return pil_Voltaj;
    }
    public void setPil_Voltaj(int pil_Voltaj) {
        this.pil_Voltaj = pil_Voltaj;
    }
}
