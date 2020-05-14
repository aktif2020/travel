package com.safari.travel_v1.model.config;

public class ActionHistory {

    private int ref_role_user;
    private String slug_action_history;
    private String label_action_history;
    private String description_action_history;
    private String type_action_history;

    public int getRef_role_user(){
        return ref_role_user;
    }

    public void setRef_role_user(int ref_role_user){
        this.ref_role_user=ref_role_user;
    }

    public String getSlug_action_history(){
        return slug_action_history;
    }

    public void setSlug_action_history(String slug_action_history){
        this.slug_action_history=slug_action_history;
    }

    public String getLabel_action_history(){
        return label_action_history;
    }

    public void setLabel_action_history(String label_action_history){
        this.label_action_history=label_action_history;
    }

    public String getDescription_action_history(){
        return description_action_history;
    }

    public void setDescription_action_history(String description_action_history){
        this.description_action_history=description_action_history;
    }

    public String getType_action_history(){
        return type_action_history;
    }

    public void setType_action_history(String type_action_history){
        this.type_action_history=type_action_history;
    }

}
