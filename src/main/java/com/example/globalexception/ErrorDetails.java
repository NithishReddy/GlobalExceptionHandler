package com.example.globalexception;

public class ErrorDetails {
    public  String errorMessage;

    public String details;

    public ErrorDetails(String errorMessage, String details){
        this.errorMessage = errorMessage;
        this.details = details;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public String getDetails(){
        return details;
    }
}
