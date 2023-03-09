package Class_Methods.ch03;
public class Telephones {
    String name;
    String color;
    int price;
    public void giveInfo(){
        System.out.println("NamePhone:  "+name);
        System.out.println("ColorPhone: "+color);
        System.out.println("Price:      "+price);
    }
    public void giveInfoAgain(){
        System.out.println("Name: "+name+"; "+"Color: "+color+"; "+"Price: "+price);
    }
    public void startNokia(String helloText) {
        System.out.println("welcomeText="+helloText);
    }
    public void startApple(String HelloText){
        System.out.println("welcomeText="+HelloText);
    }
    public void startSamsung(String HelloText){
        System.out.println("welcomeText="+HelloText);
    }
    public String callingMethod(){
        String text = "Hello, I'm calling you!";
        return text;
    }



}