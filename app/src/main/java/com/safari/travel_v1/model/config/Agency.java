package com.safari.travel_v1.model.config;

public class Agency {

    private String label_agency;
    private String logo_agency;
    private String adresse_agency;
    private String tel_agency;
    private String email_agency;
    private java.util.Date date_creation_agency;

    public String getLabel_agency(){
        return label_agency;
    }

    public void setLabel_agency(String label_agency){
        this.label_agency=label_agency;
    }

    public String getLogo_agency(){
        return logo_agency;
    }

    public void setLogo_agency(String logo_agency){
        this.logo_agency=logo_agency;
    }

    public String getAdresse_agency(){
        return adresse_agency;
    }

    public void setAdresse_agency(String adresse_agency){
        this.adresse_agency=adresse_agency;
    }

    public String getTel_agency(){
        return tel_agency;
    }

    public void setTel_agency(String tel_agency){
        this.tel_agency=tel_agency;
    }

    public String getEmail_agency(){
        return email_agency;
    }

    public void setEmail_agency(String email_agency){
        this.email_agency=email_agency;
    }

    public java.util.Date getDate_creation_agency(){
        return date_creation_agency;
    }

    public void setDate_creation_agency(java.util.Date date_creation_agency){
        this.date_creation_agency=date_creation_agency;
    }

}
