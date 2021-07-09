package com.example.metroproduct.consumingrest.metro.Data.ProductData.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pack_factors {
    private int instamart;

    public Pack_factors() {
    }

    public int getInstamart() {
        return instamart;
    }

    public void setInstamart(int instamart) {
        this.instamart = instamart;
    }
}
