package com.company;
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}

interface Car{
    void assemble();
}

class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Basic Car.");

    }

}

class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car car){

        this.car = car;
    }
    @Override
    public void assemble(){

        this.car.assemble();
    }
}

class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car){
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Luxury Car.");
    }
}
class SportsCar extends CarDecorator{
    public SportsCar(Car car){
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}


























