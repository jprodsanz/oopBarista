public class Item {
    // Below are our variables
        private String name;
        private double price;
    // Constructor takes name and price as parameters
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    // Getter and Setters zone (name and price)
        public String getName() {
            return name;
        }
            public void setName(String nameOfCostumer) {
                name = nameOfCostumer;
            }
        public double getPrice() {
            return price; 
        }
            public void setPrice(double price) {
                this.price = price;
            }

}