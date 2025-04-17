/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author nishanthinim
 */
public class Clothing {
    private String descrption;
    private double price;
    private String size = "M";
    
    private final double min_price = 10.0;
    private final double tax = 0.2;

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public double getPrice() {
        return price + (price * tax);
    }

    public void setPrice(double price) {
//        if(price > min_price){
//            this.price = price;
//        }
          this.price = (price > min_price)?price:min_price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
    
}
