import java.util.Scanner;

public class Main {

      public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double hamburgerTotal;
        double saladTotal;
        double friesTotal;
        double sodaTotal;
        double foodTotal;

        Food hamburger = new Food();
        hamburger.setItem("Hamburger");
        hamburger.setPrice(1.85);
        hamburger.setFat(9);
        hamburger.setCarb(33);
        hamburger.setFiber(1);

        Food salad = new Food();
        salad.setItem("Salad");
        salad.setPrice(2.00);
        salad.setFat(1);
        salad.setCarb(11);
        salad.setFiber(5);

        Food fries = new Food();
        fries.setItem("Fries");
        fries.setPrice(1.30);
        fries.setFat(11);
        fries.setCarb(36);
        fries.setFiber(4);

        Food soda = new Food();
        soda.setItem("Soda");
        soda.setPrice(0.95);
        soda.setFat(0);
        soda.setCarb(38);
        soda.setFiber(0);

        System.out.print("Enter number of hamburgers: ");
        hamburgerTotal = hamburger.getPrice() * input.nextDouble();
        System.out.println(hamburger.toString() + "\nTotal: " + hamburgerTotal + "\n");
        
        System.out.print("Enter number of salads: ");
        saladTotal = salad.getPrice() * input.nextDouble();
        System.out.println(salad.toString() + "\nTotal: " + saladTotal + "\n");

        System.out.print("Enter number of fries: ");
        friesTotal = fries.getPrice() * input.nextDouble();
        System.out.println(fries.toString() + "\nTotal: " + friesTotal + "\n");

        System.out.print("Enter number of soda: ");
        sodaTotal = soda.getPrice() * input.nextDouble();
        System.out.println(soda.toString() + "\nTotal: " + sodaTotal + "\n");

        foodTotal = hamburgerTotal + saladTotal + friesTotal + sodaTotal;
        System.out.printf("Your order comes to: $%.2f", foodTotal);

        input.close();
    }
}
