/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmonton.cash.register;

/**
 *
 * @author Shawn
 */
public class Inventory {
    private String serNO;
    private String itemName;
    private String company;
    private String location;
    private double price;
    private int quantity;

    public String getSerNO() {
        return serNO;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSerNO(String serNO) {
        this.serNO = serNO;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public Inventory(String serNo, String itemName, String company, String location,double price, int quantity ){
     this.serNO = serNo;
     this.itemName = itemName;
     this.company = company;
     this.location = location;
     this.price = price;
     this.quantity = quantity;
        
    }
    
    public Inventory(){}
       
    
}
