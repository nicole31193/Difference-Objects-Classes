package difference.objects.classes;

public class Car {
    private String make;
    private String model;
    private int year;

    // class-level (shared) field
    private static int carsBuilt = 0;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        carsBuilt++;
    }

    // instance method (per-object behavior)
    public String description() {
        return year + " " + make + " " + model;
    }

    // class (static) method
    public static int getCarsBuilt() {
        return carsBuilt;
    }

    @Override
    public String toString() {
        return "Car{" + description() + "}";
    }
}
