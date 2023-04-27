package com.mycompany.astros;

import java.util.ArrayList;

/**
 *
 * @author zazi1
 */
public class Planetas extends Astro {
    private double distanciaAlSol;
    private double orbitaAlSol;
    private boolean  satelites = false;
    private String nombre;
    private boolean tieneSatelites;
    private ArrayList<Satelites>listaSatelites;

    
    
     public Planetas(String nombre ,double distanciaAlSol, double orbitaAlSol, boolean tieneSatelites , double radioEcuatorial, double masa, double gravedad, double temperaturaMedia, double rotacionSobreSuEje) {
        super(radioEcuatorial,rotacionSobreSuEje,masa,temperaturaMedia,gravedad);
        this.setNombre(nombre);
        this.setDistanciaAlSol(distanciaAlSol);
        this.setOrbitaAlSol(orbitaAlSol);
        this.settieneSatelites(tieneSatelites);
        this.listaSatelites = new ArrayList<>();
    }

    
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return satelites;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Satelites> getListaSatelites() {
        return listaSatelites;
    }

  
    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public void setOrbitaAlSol(double orbitaAlSol) {
        this.orbitaAlSol = orbitaAlSol;
    }

    
    public void settieneSatelites(boolean satelites) {
        this.satelites = satelites;
    }
 
    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaSatelites(Satelites sat) {
        this.listaSatelites.add(sat);
        this.settieneSatelites(true);
    }
    

  
    @Override
    
    public void muestra(){
        super.muestra();
        if (this.tieneSatelites){
             System.out.println("Tiene satelites");
        }else{
            System.out.println("No tiene satelites");
        }
        System.out.println("tiene una distancia con respecto al sol de:"+ this.distanciaAlSol );
        if(listaSatelites.size()!=0){
            for (Satelites sat: listaSatelites
                    ){
                sat.muestra();
            }
        }else{
            System.out.println("No tiene satelites");
        }
    }

    
    
}
