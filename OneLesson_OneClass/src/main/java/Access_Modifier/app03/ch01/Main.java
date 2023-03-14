package Access_Modifier.app03.ch01;

import Access_Modifier.app03.Class_a;

public class Main {
    public static void main(String[] args) {
        Class_a class_a = new Class_a();
        Class_b class_b = new Class_b();
        Class_c class_c = new Class_c();
        class_c.doProtectedAction();

    }
}
