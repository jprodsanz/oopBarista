import java.util.ArrayList; 

public class Order {
    // variables 
        private String name;  // null is default
        private boolean ready; // false is default
        private ArrayList<Item> items = new ArrayList<Item>(); // null is default
    
    // constructor
    // without arguments "Guest" starts off as empty array
        public Order() {
            this.name = "Guest";
            this.ready = false; 
        }
    
    // overload the constructor 
    // name is the argument 
        public Order(String name) {
            this.name = name; 
            this.ready = false; 
        }
    
    //Getters and setters
        public String getName() {
            return name;
        }
        public void setName(String orderName) {
            name = orderName;
        }
        public boolean getReady() {
            return ready;
        }
        public void isReady(boolean ready) {
            this.ready = true; 
        }
        public ArrayList<Item> getItems() {
            return items;
        }
        public void setItems(ArrayList<Item> items) {
            this.items = items; 
        }

        public void addItem(Item item) {
            this.items.add(item);
        }
        public String getStatusMessage() {
            if (this.ready == true){
                return 
                ("Dear costumer, your order is ready, enjoy!");
            } else {
                return
                ("Please wait");
            }
        }
        public double getOrderTotal() {
            double total = 0.00;
            for (Item item: this.items) {
                total += item.getPrice();
            }
            return total; 
        }
        public void display() {
            System.out.printf
            ("\n Costumer Name: %s \n", this.name);
            for (Item item : this.items) {
                System.out.printf(item.getName() + " - $" + item.getPrice() + "\n");
            }
            System.out.printf
            ("Your total is: $%s", this.getOrderTotal());
        }

}