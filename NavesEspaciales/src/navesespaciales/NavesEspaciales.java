/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navesespaciales;

/**
 *
 * @author tobby
 */
public class NavesEspaciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nave saturnoV = new VehiculosLanzadera(110.6);
        Nave atv = new NavesEspacialesNoTripuladas(9.97);
        Nave apolo = new NavesEspacialesTripuladas(5);
        Nave moduloLunar = new NavesEspacialesTripuladas(5);
        
        boolean isVehiculosLanzadera = true;
        boolean isNavesEspacialesNoTripuladas = true;
        boolean isNavesEspacialesTripuladas = true;
        
        while(isVehiculosLanzadera){
            if (isVehiculosLanzadera){
              saturnoV.aterrizo();
            }else if(isNavesEspacialesNoTripuladas){
              atv.gravedadNave();
            }else if(isNavesEspacialesTripuladas){
              apolo.masaTotalDelCohete();
            }else{
                moduloLunar.aceleracionCohete();
            }
        }
    }
    
}
