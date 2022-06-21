/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navesespaciales;

/**
 *
 * @author tobby
 */
public abstract class Nave {

    public double altura;
    public int cargaUtil;
    public int empuje;
    public int combustible;
    public double aceleracion;
    public int masa;
    public int velocidad;
    public double gravedad;

    public Nave( double altura) {
        this.altura = altura;
        this.cargaUtil = 0;
        this.empuje = 0;
        this.combustible = 0;
        this.gravedad = 9.8;
        this.velocidad = 0;
    }

    public abstract void masaTotalDelCohete();

    public abstract void aceleracionCohete();

    public void aterrizo() {
        velocidad = 0;
    }    
    
    public void gravedadNave (){        
        gravedad = 9.8;
    }

}
