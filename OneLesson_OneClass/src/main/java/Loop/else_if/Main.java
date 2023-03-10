package Loop.else_if;

public class Main {
    public static void main(String[] args) {
        String result = defineType(15);
        System.out.println("result="+result);

    }
    private static String defineType(int points){
        String type = null;
        if(points == 100){
            type = "World Class";
        } else if(points>50){
            type = "Country Class";
        } else if(points>10){
            type = "Region Class";
        } else {
            type= "Amator";
        }
        return type;
    }
}
