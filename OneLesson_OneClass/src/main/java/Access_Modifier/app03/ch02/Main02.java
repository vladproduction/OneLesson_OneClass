package Access_Modifier.app03.ch02;

import Access_Modifier.app03.ch01.Class_c;
import Access_Modifier.app03.ch01.Class_d;

public class Main02 {
    public static void main(String[] args) {
        Class_c class_c = new Class_c();
        Class_d class_d = new Class_d();
        class_d.doProtectedAction();
    }
}
