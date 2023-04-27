/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astros;

/**
 *
 * @author zazi1
 */
public class Satelites extends Astro{
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planetas planetaAlQuePerteneces;
    private String nombre;

    
   
    public Satelites(double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planetaAlQuePertenece, double radioEcuatorial, double masa, double gravedad, double temperaturaMedia, double rotacionSobreSuEje) {
        super(radioEcuatorial,rotacionSobreSuEje,masa,temperaturaMedia,gravedad);
        this.setdistanciaAlPlaneta(distanciaAlPlaneta);
        this.setorbitaPlanetaria(orbitaPlanetaria);
        this.setPlanetaAlQuePertenece(planetaAlQuePertenece);
    }

    public double getdistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setdistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getorbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setorbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planetas getPlanetaAlQuePerteneces() {
        return planetaAlQuePerteneces;
    }

    public void setPlanetaAlQuePerteneces(Planetas planetaAlQuePerteneces) {
        this.planetaAlQuePerteneces = planetaAlQuePerteneces;
    }
    
    public void setPlanetaAlQuePertenece(Planetas planetaAlQuePertenece) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public void muestra(){
     
        System.out.println("Info del Satelite("+this.nombre+")");
        System.out.println("-----");
        super.muestra();
        System.out.println("Tiene uns distancia con respectoca " + this.planetaAlQuePerteneces.getNombre()+
                "de:" + this.distanciaAlPlaneta + "\nSu orbita planetarian es: " + this.orbitaPlanetaria);
        
        
    }

   
    
}  
    


