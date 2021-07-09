package com.example.metroproduct.consumingrest.metro.Data.ProductData.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Prices {
    private String price;
    private String type;
    private String source;
    private ArrayList<LevelPrice> lavels = new ArrayList<LevelPrice>();
    private Ofline ofline;
    private boolean is_promo;

    public Prices() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<LevelPrice> getLavels() {
        return lavels;
    }

    public void setLavels(ArrayList<LevelPrice> lavels) {
        this.lavels = lavels;
    }

    public Ofline getOfline() {
        return ofline;
    }

    public void setOfline(Ofline ofline) {
        this.ofline = ofline;
    }

    public boolean isIs_promo() {
        return is_promo;
    }

    public void setIs_promo(boolean is_promo) {
        this.is_promo = is_promo;
    }
}
