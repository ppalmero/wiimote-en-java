/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocursomaestria;

/**
 *
 * @author pablo
 */
public class ControlaTiempos {
    long tComerInicia = 0l;
    long tComerTotal;
    long tCaminarInicia = 0l;
    long tCaminarTotal;
    
    public void inciarComer(){
        tComerInicia = System.currentTimeMillis();
    }
    
    public void finComer(){
        if (tComerInicia != 0l){
            tComerTotal += System.currentTimeMillis() - tComerInicia;
            tComerInicia = 0l;
        }
    }
    
    public void inciarCaminar(){
        tCaminarInicia = System.currentTimeMillis();
    }
    
    public void finCaminar(){
        if (tCaminarInicia != 0l){
            tCaminarTotal += System.currentTimeMillis() - tCaminarInicia;
            tCaminarInicia = 0l;
        }
    }

    public String gettComerTotal() {
        String mje = "";
        if (tComerTotal > 359999) {
            mje = tComerTotal / 360000 + " horas ";
        }
        
        if (tComerTotal > 59999) {
            mje += (tComerTotal % 360000) / 60000 + " minutos ";
        }
        
        mje += (tComerTotal % 60000) / 1000 + " segundos";
        return mje;
    }

    public String gettCaminarTotal() {
        String mje = "";
        if (tCaminarTotal > 359999) {
            mje = tCaminarTotal / 360000 + " horas ";
        }
        
        if (tCaminarTotal > 59999) {
            mje += (tCaminarTotal % 360000) / 60000 + " minutos ";
        }
        
        mje += (tCaminarTotal % 60000) / 1000 + " segundos";
        return mje;
    }
    
}
