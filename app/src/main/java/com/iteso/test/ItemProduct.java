package com.iteso.test;

public class ItemProduct {
    private int image;
    private String title;
    private String store;
    private String location;
    private String phone;
    private String description;

    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public ItemProduct(int image, String title, String store, String location, String phone, String description) {
        this.image = image;
        this.title = title;
        this.store = store;
        this.location = location;
        this.phone = phone;
        this.description = description;
    }

    public ItemProduct(){

        setImage(0);
        setDescription("");
        setTitle("");
        setStore("");
        setLocation("");
        setPhone("");
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
