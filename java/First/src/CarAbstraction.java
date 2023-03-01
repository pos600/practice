public class CarAbstraction extends VehicleAbstraction {

    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }
    void brake(){
        System.out.println("The driver stepped on the brake.");
    }
    void park(){
        System.out.println("The driver parked the car.");
    }
    
}
