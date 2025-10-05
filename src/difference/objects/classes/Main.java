package difference.objects.classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cars built so far (class-level): " + Car.getCarsBuilt());
        Car a = new Car("Toyota", "Corolla", 2020);
        Car b = new Car("Honda", "Civic", 2022);

        System.out.println("Cars built so far (class-level): " + Car.getCarsBuilt());
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("a.description(): " + a.description());
        System.out.println("b.description(): " + b.description());

        Car c = a;
        System.out.println("a == c ? " + (a == c));
        System.out.println("a.equals(c)? " + a.equals(c));
        System.out.println("a == b ? " + (a == b));

        Car d = new Car("Honda", "Civic", 2023);
        System.out.println("d -> " + d);
        System.out.println("Cars built so far (class-level): " + Car.getCarsBuilt());
    }
}
