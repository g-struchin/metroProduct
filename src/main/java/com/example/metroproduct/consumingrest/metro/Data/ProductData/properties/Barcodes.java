package com.example.metroproduct.consumingrest.metro.Data.ProductData.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Barcodes {
    private long barcode;

    public Barcodes() {
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }
}
