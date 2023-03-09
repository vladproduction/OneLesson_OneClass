package Class_Methods.ch02;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.name = "bmw";
        car1.model = "x6";
        car1.color = "black";
        car1.price = 50000;

        car1.visual();
        car1.prospect();

        Clients client1 = new Clients();
        client1.name = "Jack";
        client1.sinceYear = 2018;
        client1.amountCars = 2;

        client1.clientInfo();

    }
}
