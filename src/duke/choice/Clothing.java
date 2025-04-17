/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author nishanthinim
 */
public class Clothing implements Comparable<Clothing> {

    private String descrption;
    private double price;
    private String size = "M";

    public Clothing(String descrption, double price, String aSize) {
        this.descrption = descrption;
        this.price = price;
        size = aSize;
    }

    public final static double min_price = 10.0;
    public final static double tax = 0.2;

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
        this.price = (price > min_price) ? price : min_price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescrption() + "," + getSize() + "," + getPrice();
    }

    @Override
    public int compareTo(Clothing other) {
        return this.descrption.compareTo(other.descrption);
    }
}
