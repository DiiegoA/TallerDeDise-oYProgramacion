/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navesespaciales;

/**
 *
 * @author tobby
 */
public class VehiculosLanzadera extends Nave{
    
    private boolean estaMovimiento;

    public VehiculosLanzadera( double altura) {
        super(altura);
        this. estaMovimiento = true;
        this.cargaUtil = 118;
        this.empuje = 3500;
        this.combustible = 20;
        
    }       
    
    public void masaTotalDelCohete() {
        
        this.masa = this.cargaUtil + this.combustible;
    }

    
    public void aceleracionCohete() {
        
        this.aceleracion = this.empuje / this.masa;
    }

    @Override
    public void aterrizo() {
        velocidad = 0;
        this. estaMovimiento = false;
    }

   public boolean isEstaMovimiento() {
        return estaMovimiento;
    } 
   
    
    
    
}
