// initialization/OverloadingVarargs2.java
// Won't compile

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.print("first");
    }
    static void f(Character... args) {
        System.out.print("second");
    }
    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
