package com.example.metroproduct.consumingrest.metro.Data.ProductData.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Packing {
    private int size;
    private String type;
    private Pack_factors pack_factors;

    public Packing() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pack_factors getPack_factors() {
        return pack_factors;
    }

    public void setPack_factors(Pack_factors pack_factors) {
        this.pack_factors = pack_factors;
    }
}
