package class_obj;

class Coffee_test {
    public static void main(String[] args) {
        Coffee highland=new Coffee();
        highland.price=50000;
        highland.discount(10);
        highland.pay(10);
    }
}
