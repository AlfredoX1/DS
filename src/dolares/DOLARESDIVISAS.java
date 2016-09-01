
package dolares;

/**
 *
 * @author Vongola V1
 */
public class DOLARESDIVISAS {
    
    double dx;
    double px;
    
public void dolarespesos(){
    double dp;
    
    dp= Double.parseDouble(DIVISAS.DOLARESTXT.getText());
    dx=15.81*dp;
    
    String dol= String.valueOf(dx);
    DIVISAS.méxico.setText("$"+dol);
    
    
}   
public void dolarescolones(){
    double dp;
    
    dp= Double.parseDouble(DIVISAS.DOLARESTXT.getText());
    dx=8.74*dp;
    
    String dol= String.valueOf(dx);
    DIVISAS.elsalvador.setText("$"+dol);   
    
}
public void dolareseuros(){
     double dp;
    
    dp= Double.parseDouble(DIVISAS.DOLARESTXT.getText());
    dx=0.89*dp;
    
    String dol= String.valueOf(dx);
    DIVISAS.europa.setText("€"+dol);   
        
}
public void dolareslibras(){
     double dp;
    
    dp= Double.parseDouble(DIVISAS.DOLARESTXT.getText());
    dx=0.651*dp;
    
    String dol= String.valueOf(dx);
    DIVISAS.reinounido.setText("$"+dol); 
    
}


public void limpiar(){
    
   DIVISAS.DOLARESTXT.setText(null);
   DIVISAS.méxico.setText(null);
   DIVISAS.elsalvador.setText(null);
   DIVISAS.reinounido.setText(null);
   DIVISAS.europa.setText(null);
}
}
