/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author nishanthinim
 */
public class Customer {

    private String name;
    private String size;

    public Customer(String name,int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
    
    
    private Clothing item[];
    
    public void addItem(Clothing items[]) {
        item = items;
    }

    public Clothing[] getItem() {
        return item;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing items : item) {
                total += items.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

}
