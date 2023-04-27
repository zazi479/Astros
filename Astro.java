/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.astros;

/**
 *
 * @author zazi1
 */
public abstract class Astro {
    //atributos
    private double radioEcuatorial;
    private double rotacionSobreSuEje;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    
    //no constructor con parametro porque es una clase abstracta
        public Astro(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreSuEje = rotacionSobreSuEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }
    
    
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotacionSobreSuEje() {
        return rotacionSobreSuEje;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public void setRotacionSobreSuEje(double rotacionSobreSuEje) {
        this.rotacionSobreSuEje = rotacionSobreSuEje;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    
    

    public void muestra() {
    System.out.println("Radio ecuatorial: " + this.radioEcuatorial);
    System.out.println("Rotación sobre su eje: " + this.rotacionSobreSuEje);
    System.out.println("Masa: " + this.masa);
    System.out.println("Temperatura media: " + this.temperaturaMedia);
    System.out.println("Gravedad: " + this.gravedad);
}


    

}

   