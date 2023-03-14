package Access_Modifier.app03.ch01;

import Access_Modifier.app03.Class_a;

public class Class_d extends Class_a {
    @Override
    public void doProtectedAction() {
        System.out.println("Class_d doProtectedAction() -->overridden");
    }
}
