package OOP;

public class InheritenceTestCar extends InheritenceVehicle {

    private String modelName = "Mustang";

    public static void main(String[] args) {

        InheritenceTestCar myCar = new InheritenceTestCar();

        System.out.println(myCar.Brand + " " + myCar.modelName);
        myCar.engine();
        myCar.wiper();
        myCar.headlight();

    }
}
