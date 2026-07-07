public class Car {
    String model;
    int yearofLaunch;
    boolean goodCondition;

    void startCar () {
        System.out.println("Car "+ model + " engine started for drive!");
    }
    void stopCar (){
        System.out.println("Car "+model+ " stopped its engine!");
    }
}
class CarDetailes {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Tata Tigor";
        c1.yearofLaunch = 2019;
        c1.goodCondition = true;
        c1.startCar();
    }
}
