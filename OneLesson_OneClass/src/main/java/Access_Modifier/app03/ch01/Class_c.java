package Access_Modifier.app03.ch01;

import Access_Modifier.app03.Class_a;

public class Class_c extends Class_a {
    @Override
    protected void doProtectedAction() {
        System.out.println("Class_c --> doProtectedAction() overridden");
    }
}
