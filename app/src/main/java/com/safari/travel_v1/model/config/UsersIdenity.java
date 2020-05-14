package com.safari.travel_v1.model.config;

import java.util.Date;

public class UsersIdenity {

    private String ref_user;
    private String nom_user;
    private String postnom_user;
    private String prenom_user;
    private char sexe_user;
    private java.util.Date date_naissance_user;
    private String lieu_naissance_user;
    private String adresse_user;
    private String tel_user;
    private String email_user;

    public UsersIdenity(){}

    public UsersIdenity(String ref_user, String nom_user, String postnom_user, String prenom_user, char sexe_user, Date date_naissance_user, String lieu_naissance_user, String adresse_user, String tel_user, String email_user) {
        this.ref_user = ref_user;
        this.nom_user = nom_user;
        this.postnom_user = postnom_user;
        this.prenom_user = prenom_user;
        this.sexe_user = sexe_user;
        this.date_naissance_user = date_naissance_user;
        this.lieu_naissance_user = lieu_naissance_user;
        this.adresse_user = adresse_user;
        this.tel_user = tel_user;
        this.email_user = email_user;
    }

    public String getRef_user(){
        return ref_user;
    }

    public void setRef_user(String ref_user){
        this.ref_user=ref_user;
    }

    public String getNom_user(){
        return nom_user;
    }

    public void setNom_user(String nom_user){
        this.nom_user=nom_user;
    }

    public String getPostnom_user(){
        return postnom_user;
    }

    public void setPostnom_user(String postnom_user){
        this.postnom_user=postnom_user;
    }

    public String getPrenom_user(){
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user){
        this.prenom_user=prenom_user;
    }

    public char getSexe_user(){
        return sexe_user;
    }

    public void setSexe_user(char sexe_user){
        this.sexe_user=sexe_user;
    }

    public java.util.Date getDate_naissance_user(){
        return date_naissance_user;
    }

    public void setDate_naissance_user(java.util.Date date_naissance_user){
        this.date_naissance_user=date_naissance_user;
    }

    public String getLieu_naissance_user(){
        return lieu_naissance_user;
    }

    public void setLieu_naissance_user(String lieu_naissance_user){
        this.lieu_naissance_user=lieu_naissance_user;
    }

    public String getAdresse_user(){
        return adresse_user;
    }

    public void setAdresse_user(String adresse_user){
        this.adresse_user=adresse_user;
    }

    public String getTel_user(){
        return tel_user;
    }

    public void setTel_user(String tel_user){
        this.tel_user=tel_user;
    }

    public String getEmail_user(){
        return email_user;
    }

    public void setEmail_user(String email_user){
        this.email_user=email_user;
    }

}
