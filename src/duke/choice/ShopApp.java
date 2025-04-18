/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nishanthinim
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 3;
        System.out.println("Welcome kanna!!");

        Customer c1 = new Customer("Pinky", measurement);
//        c1.setName("Pinky");
        System.out.println("Customer name : " + c1.getName());
//        c1.setSize("S");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 =  new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing item[] = {item1, item2, item3, item4};

        try{
            ItemList list = new ItemList(item);
            Routing routing = Routing.builder().get("/item", list).build();
            ServerConfiguration config = ServerConfiguration.builder().bindAddress (InetAddress.getLocalHost()).port (8888).build();
            WebServer ws = WebServer.create(config,routing);
            ws.start();
        }catch(UnknownHostException ex){
            ex.printStackTrace();
        }
        
        
//        item1.setDescrption("Blue Jacket");       //these are called from paramter constructor
//        item1.setPrice(20.9);
//        item1.setSize("M");
//
//        item2.setDescrption("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//
//        item[2].setDescrption("Green Scarf");
//        item[2].setPrice(5);
//        item[2].setSize("S");
//
//        item[3].setDescrption("Blue T-Shirt");
//        item[3].setPrice(10.5);
//        item[3].setSize("S");
//        System.out.println("Item1 : "+item1.descrption+","+item1.price+","+item1.size);
//        System.out.println("Item2 : "+item2.descrption+","+item2.price+","+item2.size);
//        total = (item1.price + (item2.price*2)) * (1+tax);
//        System.out.println("Total : "+total);
//        int measurement = 3;
//        switch (measurement){
//            case 1: 
//            case 2: 
//            case 3:
//                c1.setSize("S");
//                break;
//            case 4: 
//            case 5: 
//            case 6:
//                c1.setSize("M");
//                break;
//            case 7: 
//            case 8: 
//            case 9:
//                c1.setSize("L");
//                break;
//            default:
//                c1.setSize("X");
//                break;
//        }
        c1.addItem(item);
//        c1.setSize(measurement);
        System.out.println("Size : " + c1.getSize());
        System.out.println("Min_price:" + Clothing.min_price);     //Static variable access by class name
        System.out.println("Tax : " + Clothing.tax);

//       for(Clothing items : item){
//            System.out.println("Item : "+items.descrption+","+items.price+","+items.size);
//           total += items.price;
//       }
//       System.out.println("Total : "+total);
//       for(Clothing items : item){
//           if(c1.getSize().equals(items.getSize())){
//                System.out.println("Item : "+items.getDescrption()+","+items.getPrice()+","+items.getSize());
//                total += items.getPrice();
//                total += (total*tax);
//                if(total>15){
//                    break;
//                }
//           }
//       }
//       System.out.println("Total : "+total);
        System.out.println("Customer is : " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing items : c1.getItem()) {
//            System.out.println("Items is : " + items.getDescrption());
            System.out.println("Items Output : " + items);
        }
//        System.out.println("Total : " + c1.getTotalClothingCost());

//Practice 7
        int avg = 0;
        int count = 0;
        for (Clothing items : c1.getItem()) {
            if (items.getSize().equals("L")) {
                count++;
                avg += items.getPrice();
            }
        }
        try {
            avg = avg / count;
            System.out.println("Average : " + avg + " ,Count : " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't Divide by zero");
        }
        
        Arrays.sort(c1.getItem());
        for (Clothing items : c1.getItem()) {
            System.out.println("Items Output : " + items);
        }
    }
}
