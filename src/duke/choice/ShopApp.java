/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

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

        Customer c1 = new Customer("Pinky",measurement);
//        c1.setName("Pinky");
        System.out.println("Customer name : " + c1.getName());
//        c1.setSize("S");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing item[] = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescrption("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescrption("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item[2].setDescrption("Green Scarf");
        item[2].setPrice(5);
        item[2].setSize("S");

        item[3].setDescrption("Blue T-Shirt");
        item[3].setPrice(10.5);
        item[3].setSize("S");

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
            System.out.println("Items is : " + items.getDescrption());
        }
//        System.out.println("Total : " + c1.getTotalClothingCost());

    }

}
