public class Baristas {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, where cafe is our specialization";
            System.out.println(generalGreeting);

        //this is the menu at my shop 
        Item item1 = new Item ("mocha", 3.25);
        Item item2 = new Item ("oatMilkLatte", 4.95);
        Item item3 = new Item ("soyMilkLatte", 5.65);
        Item item4 = new Item ("cappuccino", 6.65);
        
        // Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order(); 
        Order order2 = new Order();

        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Manuel");
        Order order4 = new Order("Sebastian");
        Order order5 = new Order("Karol");

        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, 
        // to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item3);
        
            order2.addItem(item2);
            order2.addItem(item4);
        
        order3.addItem(item2);
        order3.addItem(item3);

            order4.addItem(item1);
            order4.addItem(item1);
        
        order5.addItem(item3);
        order5.addItem(item4);
        
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
        order3.isReady(true);
        order5.isReady(true);

            System.out.println(order1.getStatusMessage());
            System.out.println(order2.getStatusMessage());
            System.out.println(order3.getStatusMessage());
            System.out.println(order4.getStatusMessage());
            System.out.println(order5.getStatusMessage());
    }
}