package com.safari.travel_v1.model.config;

public class UsersRole {

    private int ref_role;
    private String ref_user;

    public UsersRole(){}

    public UsersRole(int ref_role, String ref_user) {
        this.ref_role = ref_role;
        this.ref_user = ref_user;
    }

    public int getRef_role(){
        return ref_role;
    }

    public void setRef_role(int ref_role){
        this.ref_role=ref_role;
    }

    public String getRef_user(){
        return ref_user;
    }

    public void setRef_user(String ref_user){
        this.ref_user=ref_user;
    }

}
