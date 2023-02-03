/*

 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Fbn
 */
public class Poligono {
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
    private float espejoAgua;
    


    public Poligono(float caudal, float rugosidad, float pendiente, float ancho_solera, float talud) {
        this.caudal = caudal;
        this.rugosidad = rugosidad;
        this.pendiente = pendiente;
        this.ancho_solera = ancho_solera;
        this.talud = talud;
    }
    
    public Poligono(){}
    

    public float getEspejoAgua() {
        return espejoAgua;
    }

    public void setEspejoAgua(float espejoAgua) {
        this.espejoAgua = espejoAgua;
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
    
    public void calcularCanalTrapezoidal(){
        float primerDato = caudal*rugosidad;
        primerDato =(float) Math.pow(primerDato / (float) (Math.sqrt(pendiente)),(float) 3/5);
        float tiranteAux = 1;
        System.out.println(primerDato);
        //CALCULO DE TIRANTE NORMAL   
        while(true){
            
            tirante = primerDato * (float) Math.pow((ancho_solera + ((2*tiranteAux))*((float) Math.pow(1+(talud*talud), (float) 1/2))), (float) 2/5 )/(ancho_solera + (talud*tiranteAux));
            System.out.println(tirante);
            if(tirante == tiranteAux){
                break;
            }
            else{
                tiranteAux = tirante;
            }
        }
        //FORMULA PARA AREA
        area = tirante*(ancho_solera + (talud*tirante));
        
        //FORMULA PARA PERIMETRO MOJADO
        perimetro = ancho_solera + ((2)*(float) Math.pow(1+(talud*talud), (float) 1/2)*tirante);
        
        
        //FORMULA PARA RADIO HIDRAULICO
        radioHidraulico = area/perimetro;
        
        //FORMULA PARA VELOCIDAD
        velocidad = caudal/area;
        
        //CALCULAR ESPEJO DE AGUA
        espejoAgua = ancho_solera + (2*talud*tirante);
    }
    
    public void calcularCanalRectangular(){
        float primerDato = caudal*rugosidad;
        primerDato = primerDato / (float) (Math.sqrt(pendiente));
        float tiranteAux = 1;
        //CALCULO DE TIRANTE NORMAL   
        while(true){
            
            tirante =(float) Math.pow(primerDato * (float) (Math.pow(ancho_solera+ (2*tiranteAux), (float) 2/3)), (float) 3/5 )/ancho_solera;
            if(tirante == tiranteAux){
                break;
            }
            else{
                tiranteAux = tirante;
            }
        }
        //FORMULA PARA AREA
        area = tirante*ancho_solera;
        
        //FORMULA PARA PERIMETRO MOJADO
        perimetro = ancho_solera + (2*tirante);
        
        
        //FORMULA PARA RADIO HIDRAULICO
        radioHidraulico = area/perimetro;
        
        //FORMULA PARA VELOCIDAD
        velocidad = caudal/area;
        
        //CALCULAR ESPEJO DE AGUA
        espejoAgua = ancho_solera;
        
    }
    
    //TRIANGULAR
    public void calcularCanalTriangular(){
        float primerDato = caudal*rugosidad;
        primerDato = primerDato / (float) (Math.sqrt(pendiente));
        primerDato = (float) Math.pow(primerDato,(float) 3/8);
        
        //CALCULO DE TIRANTE NORMAL
        
        tirante = (float) (Math.pow(2, (float) 1/4)) * ((float)Math.pow(talud, (float) -5/8))*((float)Math.pow((talud*talud) +1 ,(float) 1/8)) * primerDato;
    
        //FORMULA PARA AREA
        area = tirante*tirante*talud;
        
        //FORMULA PARA PERIMETRO MOJADO
        perimetro = (2 * (float) Math.pow(1 + (talud*talud), (float) 1/2))*tirante;
        
        
        //FORMULA PARA RADIO HIDRAULICO
        radioHidraulico = area/perimetro;
        
        //FORMULA PARA VELOCIDAD
        velocidad = caudal/area;
        
        //CALCULAR ESPEJO DE AGUA
        espejoAgua = 2*talud*tirante;
        
    }
}
