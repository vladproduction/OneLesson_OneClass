package Class_Methods.ch01;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "iphone SE";
        phone1.price = 400;
        phone1.isPhone = true;

        phone1.infoPhone();
        phone1.sendSMS("Have a nice day!");
        phone1.call();

    }
}
