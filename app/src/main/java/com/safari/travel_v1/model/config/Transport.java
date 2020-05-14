package com.safari.travel_v1.model.config;

public class Transport {

    private String ref_agency;
    private String ref_deplacement;
    private String label_transport;
    private String type_vehicule;

    public Transport(){}

    public Transport(String ref_agency, String ref_deplacement, String label_transport, String type_vehicule) {
        this.ref_agency = ref_agency;
        this.ref_deplacement = ref_deplacement;
        this.label_transport = label_transport;
        this.type_vehicule = type_vehicule;
    }

    public String getRef_agency(){
        return ref_agency;
    }

    public void setRef_agency(String ref_agency){
        this.ref_agency=ref_agency;
    }

    public String getRef_deplacement(){
        return ref_deplacement;
    }

    public void setRef_deplacement(String ref_deplacement){
        this.ref_deplacement=ref_deplacement;
    }

    public String getLabel_transport(){
        return label_transport;
    }

    public void setLabel_transport(String label_transport){
        this.label_transport=label_transport;
    }

    public String getType_vehicule(){
        return type_vehicule;
    }

    public void setType_vehicule(String type_vehicule){
        this.type_vehicule=type_vehicule;
    }

}
