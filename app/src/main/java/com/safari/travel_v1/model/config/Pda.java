package com.safari.travel_v1.model.config;

public class Pda {

    private String ref_user;
    private String type_pda;
    private String label_pda;
    private String imei_pda;
    private String serie_pda;
    private String version_pda;
    private String system_pda;
    private String adress_mac_pda;

    public Pda(){}

    public Pda(String ref_user, String type_pda, String label_pda, String imei_pda, String serie_pda, String version_pda, String system_pda, String adress_mac_pda) {
        this.ref_user = ref_user;
        this.type_pda = type_pda;
        this.label_pda = label_pda;
        this.imei_pda = imei_pda;
        this.serie_pda = serie_pda;
        this.version_pda = version_pda;
        this.system_pda = system_pda;
        this.adress_mac_pda = adress_mac_pda;
    }

    public String getRef_user(){
        return ref_user;
    }

    public void setRef_user(String ref_user){
        this.ref_user=ref_user;
    }

    public String getType_pda(){
        return type_pda;
    }

    public void setType_pda(String type_pda){
        this.type_pda=type_pda;
    }

    public String getLabel_pda(){
        return label_pda;
    }

    public void setLabel_pda(String label_pda){
        this.label_pda=label_pda;
    }

    public String getImei_pda(){
        return imei_pda;
    }

    public void setImei_pda(String imei_pda){
        this.imei_pda=imei_pda;
    }

    public String getSerie_pda(){
        return serie_pda;
    }

    public void setSerie_pda(String serie_pda){
        this.serie_pda=serie_pda;
    }

    public String getVersion_pda(){
        return version_pda;
    }

    public void setVersion_pda(String version_pda){
        this.version_pda=version_pda;
    }

    public String getSystem_pda(){
        return system_pda;
    }

    public void setSystem_pda(String system_pda){
        this.system_pda=system_pda;
    }

    public String getAdress_mac_pda(){
        return adress_mac_pda;
    }

    public void setAdress_mac_pda(String adress_mac_pda){
        this.adress_mac_pda=adress_mac_pda;
    }

}
