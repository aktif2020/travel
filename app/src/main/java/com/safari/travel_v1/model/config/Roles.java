package com.safari.travel_v1.model.config;

public class Roles {


    public Roles(){}

    public Roles(String label_role, int admin_level) {
        this.label_role = label_role;
        this.admin_level = admin_level;
    }

    private String label_role;
    private int admin_level;

    public String getLabel_role(){
        return label_role;
    }

    public void setLabel_role(String label_role){
        this.label_role=label_role;
    }

    public int getAdmin_level(){
        return admin_level;
    }

    public void setAdmin_level(int admin_level){
        this.admin_level=admin_level;
    }

}
