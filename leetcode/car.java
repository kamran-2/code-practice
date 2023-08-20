package leetcode;

    abstract class Car {

    static {
         System.out.println("1");
    }

    public Car(String name){
        super();
        System.out.print("2");
    }

    {
        System.out.println("3");
    }
}

public class Bluecar extends Car{
    {
        System.out.print("4");
    }

    public BlueCar(){
        super("blue");
        System.out.println("5");
    }
}
public static void main(String[] aa){
    new Bluecar();
}


