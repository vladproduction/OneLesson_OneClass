package Clone.app03;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car a = new Car();
        a.setName("bmw");
        a.setModel("x6");
        a.setColor("black");
        Equipment full = new Equipment();
        a.setEquipment(full);
        a.setPrice(50000);

        full.setTypeEngine("D");
        full.setEngineCapacity(3.5);

        Car b = a.clone();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
//        System.out.println("update for car b type of engine --> full_ECO");
//        System.out.println("update for car b engine capacity --> 2.5");
//        Equipment ECO = new Equipment();
//        ECO.setTypeEngine("full_ECO");
//        ECO.setEngineCapacity(2.5);
//
//        b.setEquipment(ECO);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        System.out.println("-----------------------------------------");
        System.out.println("Version 2.0 = update for car b type of engine --> full_ECO");
        Equipment ECO = new Equipment();
        ECO.setTypeEngine("full_ECO");
        //??????????? why we have to set engineCapacity again for
        b.setEquipment(ECO);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



    }
}
