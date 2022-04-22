public class Food {
    String item;
    double price;
    double fat;
    double carb;
    double fiber;

    public String toString() {
        String orderString;

        orderString = "Each " + this.item + " has " + this.fat + "g of fat, "
                + this.carb + "g of carbs, and " + this.fiber + "g of fiber.";
        return (orderString);
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }
    public double getCarb() {
        return carb;
    }
    public void setCarb(double carb) {
        this.carb = carb;
    }
    public double getFiber() {
        return fiber;
    }
    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    
}
