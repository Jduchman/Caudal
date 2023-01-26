/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author Fbn
 */
public class Trapezoide {
    private float caudal;
    private float rugosidad;
    private float pendiente;
    private float ancho_solera;
    private float talud;
    private float tirante;
    private float area;
    private float perimetro;
    private float radioHidraulico;
    private float velocidad;

    public Trapezoide(float caudal, float rugosidad, float pendiente, float ancho_solera, float talud) {
        this.caudal = caudal;
        this.rugosidad = rugosidad;
        this.pendiente = pendiente;
        this.ancho_solera = ancho_solera;
        this.talud = talud;
    }

    public float getCaudal() {
        return caudal;
    }

    public void setCaudal(float caudal) {
        this.caudal = caudal;
    }

    public float getRugosidad() {
        return rugosidad;
    }

    public void setRugosidad(float rugosidad) {
        this.rugosidad = rugosidad;
    }

    public float getPendiente() {
        return pendiente;
    }

    public void setPendiente(float pendiente) {
        this.pendiente = pendiente;
    }

    public float getAncho_solera() {
        return ancho_solera;
    }

    public void setAncho_solera(float ancho_solera) {
        this.ancho_solera = ancho_solera;
    }

    public float getTalud() {
        return talud;
    }

    public void setTalud(float talud) {
        this.talud = talud;
    }

    public float getTirante() {
        return tirante;
    }

    public void setTirante(float tirante) {
        this.tirante = tirante;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getRadioHidraulico() {
        return radioHidraulico;
    }

    public void setRadioHidraulico(float radioHidraulico) {
        this.radioHidraulico = radioHidraulico;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    //funciones Calcular
    
    public void calcularArea(){
        area = ancho_solera + talud*(tirante);
        area = area*tirante;
    }
    
    public void calcularPerimetro(){
        perimetro = ancho_solera + ((2*tirante)* (float)(Math.sqrt(1+ Math.pow(talud, 2))));
    }
    
    public void calcularRadioHidraulico(){
        radioHidraulico = area/perimetro;
    }
    
    public void calcularVelocidad(){
        velocidad = caudal/area;
    }
    
    public void calcularTirante(){
        DecimalFormat formato = new DecimalFormat("#.####");
        tirante = (float) 0.000;
        float primerDato = caudal*rugosidad;
        primerDato = primerDato / (float) (Math.sqrt(pendiente));
        primerDato = (float) Math.pow(primerDato, 3);
        
        float A = 0;
        float p = 0;
        float contador = (float) 0.01;
        
        
        
       while ((int) (primerDato*10000) != (int) (tirante*10000) ){
           if((int) (primerDato*10000) >= (int) (tirante*10000)){
                contador += 0.1;
                
            }
            else if((int) (primerDato*10000) == (int) (tirante*10000)){
                break;
            }
            else{
                contador -= 0.01;
            }
           
            A = ancho_solera + talud*(contador);
            A = A*contador;
            A = (float) Math.pow(A, 5);
            p = ancho_solera + ((2*contador)* (float)(Math.sqrt(1+ Math.pow(talud, 2))));
            p = (float) Math.pow(p, 2);
            
            tirante = A/p;
            
            
            //System.out.println("tirante : " + tirante +"\n y:" + contador);
       }
        
        
        tirante = (float) (contador);
    }
    
}
