package Inheritance.Animals;

public class British_Cat extends Cat{

    public void runFast(){
        System.out.println("British very fast running");
    }
    public void eat(){
        super.eat();
    }

}
