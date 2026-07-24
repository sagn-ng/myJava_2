package class_obj;

public class Coffee {
    int price;
    public void discount(double r){
        System.out.printf("%.2f\n", (double) price*r/100);
    }
    public void pay(double r){
        System.out.printf("%.2f\n", (double) price-price*r/100);
    }
}
