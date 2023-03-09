package Class_Methods.ch02;

public class Cars {

    String name;
    String color;
    String model;
    int price;

    void visual(){
        System.out.println("цвет: "+color);
        System.out.println("марка авто: "+name+"; ЦЕНА= "+price);
        System.out.println("МОДЕЛЬ АВТО: "+model);

    }
    void prospect(){

        System.out.println("Качество!");
    }
}
