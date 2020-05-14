package com.safari.travel_v1.model.config;

public class UsersActionHistory {

    private int ref_action_history;
    private String ref_user_action;
    private String ref_user_get;
    private String output_user;
    private String output_system;
    private String device_history;

    public UsersActionHistory(){}

    public UsersActionHistory(int ref_action_history, String ref_user_action, String ref_user_get, String output_user, String output_system, String device_history) {
        this.ref_action_history = ref_action_history;
        this.ref_user_action = ref_user_action;
        this.ref_user_get = ref_user_get;
        this.output_user = output_user;
        this.output_system = output_system;
        this.device_history = device_history;
    }

    public int getRef_action_history(){
        return ref_action_history;
    }

    public void setRef_action_history(int ref_action_history){
        this.ref_action_history=ref_action_history;
    }

    public String getRef_user_action(){
        return ref_user_action;
    }

    public void setRef_user_action(String ref_user_action){
        this.ref_user_action=ref_user_action;
    }

    public String getRef_user_get(){
        return ref_user_get;
    }

    public void setRef_user_get(String ref_user_get){
        this.ref_user_get=ref_user_get;
    }

    public String getOutput_user(){
        return output_user;
    }

    public void setOutput_user(String output_user){
        this.output_user=output_user;
    }

    public String getOutput_system(){
        return output_system;
    }

    public void setOutput_system(String output_system){
        this.output_system=output_system;
    }

    public String getDevice_history(){
        return device_history;
    }

    public void setDevice_history(String device_history){
        this.device_history=device_history;
    }

}
