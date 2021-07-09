package com.example.metroproduct.consumingrest.metro;

import com.example.metroproduct.consumingrest.metro.Data.RequestData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestQuote {
    private boolean success;
    private RequestData data = new RequestData();
    private ArrayList<String> errors = new ArrayList<String>();
    private String human_message;

    public RequestQuote() {
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public RequestData getData() {
        return data;
    }

    public void setData(RequestData requestData) {
        this.data = requestData;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    public String getHuman_message() {
        return human_message;
    }

    public void setHuman_message(String human_message) {
        this.human_message = human_message;
    }
}
