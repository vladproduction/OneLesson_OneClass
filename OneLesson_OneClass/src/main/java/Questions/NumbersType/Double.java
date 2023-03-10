package Questions.NumbersType;

public class Double {
    public static void main(String[] args) {
//        //#1
//        Suppose that a variable a is declared as double a = 3.14159. What does
//        each of the following print?
//        a. System.out.println(a);
//        b. System.out.println(a+1);
//        c. System.out.println(8/(int) a);
//        d. System.out.println(8/a);
//        e. System.out.println((int) (8/a));
//        Explain each outcome.

        double a = 3.14159;

        System.out.println();
        System.out.println("a="+a);
        System.out.println();
        System.out.println("b="+a+1);
        System.out.println();
        System.out.println("c="+8/(int) a);
        System.out.println();
        System.out.println("d="+8/a);
        System.out.println();
        System.out.println("e="+(int) (8/a));

        //#2
//        Order check.
//        Write a program that takes three double command-line  arguments x, y, and z
//        and prints true if the values are strictly ascending or descending
//        ( x < y < z or x > y > z ), and false otherwise.
    }
}
