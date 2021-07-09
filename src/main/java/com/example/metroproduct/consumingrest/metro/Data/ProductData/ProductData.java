package com.example.metroproduct.consumingrest.metro.Data.ProductData;

import com.example.metroproduct.consumingrest.metro.Data.ProductData.properties.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductData {
    private int id;
    private int category_id;
    private String action_id;
    private int article;
    private int mgb_article;
    private String name;
    private String description;
    private ArrayList<String> images = new ArrayList<String>();
    private ArrayList<String> docs = new ArrayList<String>();
    private Manufacturer manufacturer;
    private int sorting;
    private Packing packing;
    private Stock stock;
    private long health_warning;
    private Prices prices;
    private Prices_per_unit prices_per_unit;
    private ArrayList<Attributes> attribute = new ArrayList<Attributes>();
    private boolean eshop_availability;
    private boolean pick_up;
    private String slug;
    private String url;
    private ArrayList<String> embeds = new ArrayList<String>();
    private String raiting;
    private ArrayList<String> icons = new ArrayList<String>();
    private boolean full_cashback_online;
    private Meta meta;
    private ArrayList<Barcodes> barcodes = new ArrayList<Barcodes>();

    public ProductData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getAction_id() {
        return action_id;
    }

    public void setAction_id(String action_id) {
        this.action_id = action_id;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getMgb_article() {
        return mgb_article;
    }

    public void setMgb_article(int mgb_article) {
        this.mgb_article = mgb_article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public ArrayList<String> getDocs() {
        return docs;
    }

    public void setDocs(ArrayList<String> docs) {
        this.docs = docs;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSorting() {
        return sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }

    public Packing getPacking() {
        return packing;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public long getHealth_warning() {
        return health_warning;
    }

    public void setHealth_warning(long health_warning) {
        this.health_warning = health_warning;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public Prices_per_unit getPrices_per_unit() {
        return prices_per_unit;
    }

    public void setPrices_per_unit(Prices_per_unit prices_per_unit) {
        this.prices_per_unit = prices_per_unit;
    }

    public ArrayList<Attributes> getAttribute() {
        return attribute;
    }

    public void setAttribute(ArrayList<Attributes> attribute) {
        this.attribute = attribute;
    }

    public boolean isEshop_availability() {
        return eshop_availability;
    }

    public void setEshop_availability(boolean eshop_availability) {
        this.eshop_availability = eshop_availability;
    }

    public boolean isPick_up() {
        return pick_up;
    }

    public void setPick_up(boolean pick_up) {
        this.pick_up = pick_up;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getEmbeds() {
        return embeds;
    }

    public void setEmbeds(ArrayList<String> embeds) {
        this.embeds = embeds;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public ArrayList<String> getIcons() {
        return icons;
    }

    public void setIcons(ArrayList<String> icons) {
        this.icons = icons;
    }

    public boolean isFull_cashback_online() {
        return full_cashback_online;
    }

    public void setFull_cashback_online(boolean full_cashback_online) {
        this.full_cashback_online = full_cashback_online;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public ArrayList<Barcodes> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(ArrayList<Barcodes> barcodes) {
        this.barcodes = barcodes;
    }
}
