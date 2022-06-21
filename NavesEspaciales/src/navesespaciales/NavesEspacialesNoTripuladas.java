/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navesespaciales;

/**
 *
 * @author tobby
 */
public class NavesEspacialesNoTripuladas extends Nave{
    
    public boolean tieneGravedad = false;

    public NavesEspacialesNoTripuladas( double altura) {
        super(altura);
        this.cargaUtil = 7;
        this.empuje = 1;
        this.combustible = 1;
    }
    
    

    public void masaTotalDelCohete() {
        this.masa = this.cargaUtil + this.combustible;
    }

    
    public void aceleracionCohete() {
        this.aceleracion = this.empuje / this.masa;
    }

    @Override
    public void gravedadNave (){        
        gravedad = 9.8;
        this.tieneGravedad = true;
    }

    public boolean isTieneGravedad() {
        return tieneGravedad;
    }
}
