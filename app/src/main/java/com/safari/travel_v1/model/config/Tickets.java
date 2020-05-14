package com.safari.travel_v1.model.config;

public class Tickets {

    private int ref_phone;
    private int ref_client;
    private String ref_transport;
    private String label_ticket;

    public Tickets(){}

    public Tickets(int ref_phone, int ref_client, String ref_transport, String label_ticket) {
        this.ref_phone = ref_phone;
        this.ref_client = ref_client;
        this.ref_transport = ref_transport;
        this.label_ticket = label_ticket;
    }

    public int getRef_phone(){
        return ref_phone;
    }

    public void setRef_phone(int ref_phone){
        this.ref_phone=ref_phone;
    }

    public int getRef_client(){
        return ref_client;
    }

    public void setRef_client(int ref_client){
        this.ref_client=ref_client;
    }

    public String getRef_transport(){
        return ref_transport;
    }

    public void setRef_transport(String ref_transport){
        this.ref_transport=ref_transport;
    }

    public String getLabel_ticket(){
        return label_ticket;
    }

    public void setLabel_ticket(String label_ticket){
        this.label_ticket=label_ticket;
    }

}
