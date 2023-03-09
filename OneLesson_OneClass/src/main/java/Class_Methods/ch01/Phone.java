package Class_Methods.ch01;

public class Phone {
    public String model;
    public int price;
    public boolean isPhone;

    public void infoPhone(){
        System.out.println(model+"; "+price+"; "+isPhone);
    }

    public void sendSMS(String smsText){
        System.out.println("Hello, sms for You!- "+smsText);
    }

    public String call(){
        String text = "I`m calling You, wake up!";
        System.out.println(text);
        return text;
    }
}
