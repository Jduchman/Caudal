/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Duchman
 */
public class Circular {
    private float caudal; //Q
    private float diametro; //D
    private float rugosidad; //n
    private float pendiente; //S
    private float angulo;
    private float tiranteA; //Y
    private float tiranteB; //Y
    private float area; //A
    private float perimetroMojado; //P
    private float radioHidraulico; //R
    private float espejoDeAgua; //T
    private float velocidad;

    public Circular() {}
    
        public Circular(float caudal, float diametro, float rugosidad, float pendiente) {
        this.caudal = caudal;           
        this.diametro = diametro;
        this.rugosidad = rugosidad;
        this.pendiente = pendiente;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getCaudal() {
        return caudal;
    }

    public void setCaudal(float caudal) {
        this.caudal = caudal;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
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

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getTiranteA() {
        return tiranteA;
    }

    public void setTiranteA(float tirante) {
        this.tiranteA = tirante;
    }
    public float getTiranteB() {
        return tiranteB;
    }

    public void setTiranteB(float tirante) {
        this.tiranteB = tirante;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetroMojado() {
        return perimetroMojado;
    }

    public void setPerimetroMojado(float perimetroMojado) {
        this.perimetroMojado = perimetroMojado;
    }

    public float getRadioHidraulico() {
        return radioHidraulico;
    }

    public void setRadioHidraulico(float radioHidraulico) {
        this.radioHidraulico = radioHidraulico;
    }

    public float getEspejoDeAgua() {
        return espejoDeAgua;
    }

    public void setEspejoDeAgua(float EspejoDeAgua) {
        this.espejoDeAgua = EspejoDeAgua;
    }


    
        
    //Funciones Calcular-------------------------------------------------------
    
    public void calcularArea(){
        area = (angulo - (float) Math.sin(angulo))*(float) Math.pow(diametro, 2)/8;
        velocidad = caudal/area;
    }
    public void calcularPerimetroMojado(){
        perimetroMojado = angulo*diametro/2;
    }
    
    public void calcularRadioHidraulico(){
        radioHidraulico = (1-(float) Math.sin(angulo)/angulo)*diametro/4;
    }
    
    
    public void calcularAngulo(){
        
        float anguloAux = 1;
        float caudalAux = 0;
        
        while((int) (caudalAux*100000) != (int) (caudal*100000)){
            float A = (anguloAux - (float) Math.sin(anguloAux))*(float) Math.pow(diametro, 2)/8;
            float R = (1-(float) Math.sin(anguloAux)/anguloAux)*diametro/4;
            float S = pendiente;

            caudalAux = (1/rugosidad)*A*(float)Math.pow(R,0.6666666666666667)*(float)Math.pow(S,0.5); //Here is the problem
            
            if((int) (caudalAux*100000) < (int) (caudal*100000)){
                anguloAux += 1;
                
            }
            else if((int) (caudalAux*100000) == (int) (caudal*100000)){
                break;
            }
            else{
                anguloAux -= 0.0001;
            }
            
        }
        angulo = anguloAux;
    }
    
    public void calcularTirante(){
        
        espejoDeAgua = (float) Math.sin(angulo/2)*diametro;
        float espejoAux = (float)Math.pow((espejoDeAgua/2),2);
        float a = (float)Math.pow(diametro,2);
        float b = 4*1*espejoAux;
        float c = a-b;
        tiranteA = (diametro - (float)Math.pow(c,0.5))/(2*1);
        tiranteB = (diametro + (float)Math.pow(c,0.5))/(2*1);
    }   
}