package com.safari.travel_v1.model.config;

public class Deplacement {

    private String ville_depart;
    private String ville_arrivee;

    public Deplacement(){}

    public Deplacement(String ville_depart, String ville_arrivee) {
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
    }

    public String getVille_depart(){
        return ville_depart;
    }

    public void setVille_depart(String ville_depart){
        this.ville_depart=ville_depart;
    }

    public String getVille_arrivee(){
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee){
        this.ville_arrivee=ville_arrivee;
    }

}
