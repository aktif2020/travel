package com.safari.travel_v1.model.config;

public class Users {

    private String ref_agence;
    private String username;
    private String password;
    private String photo_profile;
    private String adresse_physique;

    public Users(){}

    public Users(String ref_agence, String username, String password, String photo_profile, String adresse_physique) {
        this.ref_agence = ref_agence;
        this.username = username;
        this.password = password;
        this.photo_profile = photo_profile;
        this.adresse_physique = adresse_physique;
    }

    public String getRef_agence(){
        return ref_agence;
    }

    public void setRef_agence(String ref_agence){
        this.ref_agence=ref_agence;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPhoto_profile(){
        return photo_profile;
    }

    public void setPhoto_profile(String photo_profile){
        this.photo_profile=photo_profile;
    }

    public String getAdresse_physique(){
        return adresse_physique;
    }

    public void setAdresse_physique(String adresse_physique){
        this.adresse_physique=adresse_physique;
    }

}
