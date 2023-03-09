package Class_Methods.ch03;

public class Main {
    public static void main(String[] args) {
        Telephones Nokia = new Telephones();
        Nokia.name = "Nokia3200";
        Nokia.color = "blue";
        Nokia.price = 200;
        Nokia.giveInfo();
        Nokia.giveInfoAgain();
        Nokia.startNokia("Hold Your "+Nokia.name);
        String callNokia = Nokia.callingMethod();
        System.out.println("Нокия: "+callNokia);
        System.out.println("================");

        Telephones Apple = new Telephones();
        Apple.name = "Iphone 12";
        Apple.color = "white";
        Apple.price = 260;
        Apple.giveInfo();
        Apple.giveInfoAgain();
        Apple.startApple(Apple.name+" welcome You!");
        String callApple = Apple.callingMethod();
        System.out.println("Apple: "+callApple);
        System.out.println("================");

        Telephones Samsung = new Telephones();
        Samsung.name = "SNote 10";
        Samsung.color = "black";
        Samsung.price = 220;
        Samsung.giveInfo();
        Samsung.giveInfoAgain();
        Samsung.startSamsung("Добрий день, ми з України!");
        String callSamsung = Samsung.callingMethod();
        System.out.println("Самсунг: "+callSamsung);
        System.out.println("================");

    }
}
