package com.example.jchen415.mywaytormobileapplication;

public class MenuDesserts {

    private int desserts_ID;
    private String desserts_Name;
    private double desserts_Price;
    private int desserts_Quantity;
    private int desserts_Registration_pID;

    public MenuDesserts() {

    }
    public MenuDesserts(int desserts_ID, String desserts_Name, double desserts_Price, int desserts_Quantity, int desserts_Registration_pID) {

        this.desserts_ID = desserts_ID;
        this.desserts_Name = desserts_Name;
        this.desserts_Price = desserts_Price;
        this.desserts_Quantity= desserts_Quantity;
        this.desserts_Registration_pID = desserts_Registration_pID;
    }

    public int getDesserts_ID() {
        return desserts_ID;
    }

    public void setDesserts_ID(int desserts_ID) {
        this.desserts_ID = desserts_ID;
    }

    public String getDesserts_Name() {
        return desserts_Name;
    }

    public void setDesserts_Name(String desserts_Name) {
        this.desserts_Name = desserts_Name;
    }

    public double getDesserts_Price() {
        return desserts_Price;
    }

    public void setDesserts_Price(double desserts_Price) {
        this.desserts_Price = desserts_Price;
    }

    public int getDesserts_Quantity() {
        return desserts_Quantity;
    }

    public void setDesserts_Quantity(int desserts_Quantity) {
        this.desserts_Quantity = desserts_Quantity;
    }
    public int getDesserts_Registration_pID() {
        return desserts_Registration_pID;
    }

    public void setDesserts_Registration_pID(int desserts_Registration_pID) {
        this.desserts_Registration_pID = desserts_Registration_pID;
    }
}
