package com.atomev8.event;

public class PublicEvent {
    private static PublicEvent instance;
    
    private EventImageView eventImageView;
    private EventChat eventChat;
    private EventLogin eventLogin;
    
    
    public static PublicEvent getInstance(){
        if(instance == null)
            instance = new PublicEvent();
        return instance;
    }
    
    private PublicEvent(){
        
    }
    
    public void addEventImageView(EventImageView event){
        this.eventImageView = event;
    }
    public EventImageView getEventImageView(){
        return this.eventImageView;
    }
    
    public void addEventChat(EventChat event){
        this.eventChat = event;
    }
    public EventChat getEventChat(){
        return this.eventChat;
    }
    
    public void addEventLogin(EventLogin event){
        this.eventLogin = event;
    }
    public EventLogin getEventLogin(){
        return this.eventLogin;
    }
}
