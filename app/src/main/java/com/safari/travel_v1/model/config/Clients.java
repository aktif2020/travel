package com.safari.travel_v1.model.config;

import java.util.Date;

public class Clients {

    private int ref_agence;
    private String nom_client;
    private String postnom_client;
    private String prenom_client;
    private char sexe_client;
    private java.util.Date date_naissance_client;
    private String profession_client;
    private String adresse_client;
    private String tel_client;
    private String email_client;

    public Clients(){}

    public Clients(int ref_agence, String nom_client, String postnom_client, String prenom_client, char sexe_client, Date date_naissance_client, String profession_client, String adresse_client, String tel_client, String email_client) {
        this.ref_agence = ref_agence;
        this.nom_client = nom_client;
        this.postnom_client = postnom_client;
        this.prenom_client = prenom_client;
        this.sexe_client = sexe_client;
        this.date_naissance_client = date_naissance_client;
        this.profession_client = profession_client;
        this.adresse_client = adresse_client;
        this.tel_client = tel_client;
        this.email_client = email_client;
    }

    public int getRef_agence(){
        return ref_agence;
    }

    public void setRef_agence(int ref_agence){
        this.ref_agence=ref_agence;
    }

    public String getNom_client(){
        return nom_client;
    }

    public void setNom_client(String nom_client){
        this.nom_client=nom_client;
    }

    public String getPostnom_client(){
        return postnom_client;
    }

    public void setPostnom_client(String postnom_client){
        this.postnom_client=postnom_client;
    }

    public String getPrenom_client(){
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client){
        this.prenom_client=prenom_client;
    }

    public char getSexe_client(){
        return sexe_client;
    }

    public void setSexe_client(char sexe_client){
        this.sexe_client=sexe_client;
    }

    public java.util.Date getDate_naissance_client(){
        return date_naissance_client;
    }

    public void setDate_naissance_client(java.util.Date date_naissance_client){
        this.date_naissance_client=date_naissance_client;
    }

    public String getProfession_client(){
        return profession_client;
    }

    public void setProfession_client(String profession_client){
        this.profession_client=profession_client;
    }

    public String getAdresse_client(){
        return adresse_client;
    }

    public void setAdresse_client(String adresse_client){
        this.adresse_client=adresse_client;
    }

    public String getTel_client(){
        return tel_client;
    }

    public void setTel_client(String tel_client){
        this.tel_client=tel_client;
    }

    public String getEmail_client(){
        return email_client;
    }

    public void setEmail_client(String email_client){
        this.email_client=email_client;
    }

}
