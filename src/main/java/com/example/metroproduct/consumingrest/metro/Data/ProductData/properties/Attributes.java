package com.example.metroproduct.consumingrest.metro.Data.ProductData.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes {
    private int id;
    private int value_id;
    private String name;
    private String text;
    private int category_id;
    private int sort_order;
    private int is_range;
    private int is_main;
    private int is_filter;
    private int is_list;
    private int a_int;
    private int display_title;
    private ArrayList<Values> lavues = new ArrayList<Values>();

    public Attributes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue_id() {
        return value_id;
    }

    public void setValue_id(int value_id) {
        this.value_id = value_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public int getIs_range() {
        return is_range;
    }

    public void setIs_range(int is_range) {
        this.is_range = is_range;
    }

    public int getIs_main() {
        return is_main;
    }

    public void setIs_main(int is_main) {
        this.is_main = is_main;
    }

    public int getIs_filter() {
        return is_filter;
    }

    public void setIs_filter(int is_filter) {
        this.is_filter = is_filter;
    }

    public int getIs_list() {
        return is_list;
    }

    public void setIs_list(int is_list) {
        this.is_list = is_list;
    }

    public int getA_int() {
        return a_int;
    }

    public void setA_int(int a_int) {
        this.a_int = a_int;
    }

    public int getDisplay_title() {
        return display_title;
    }

    public void setDisplay_title(int display_title) {
        this.display_title = display_title;
    }

    public ArrayList<Values> getLavues() {
        return lavues;
    }

    public void setLavues(ArrayList<Values> lavues) {
        this.lavues = lavues;
    }
}
