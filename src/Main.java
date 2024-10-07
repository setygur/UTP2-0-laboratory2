//TODO: we need to add the missing classes!!!

//OK I will add Adder and s30854 will add Substractor
public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(Adder.add(1,2));

        Substractor substractor = new Subtractor();
        System.out.println(substractor.substract(6,3));
    }
}

class Adder{
    public static int add(int a, int b) {
        return a + b;
    }
}