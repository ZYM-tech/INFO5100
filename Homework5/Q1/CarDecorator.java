public class CarDecorator implements ICar{
    protected   ICar  Car;
    protected  String feature;

    public CarDecorator(ICar Car){
        this.Car = Car;
    }
    @Override
    public void assemble() {
        Car.assemble();
        System.out.println("Adding the feature of " + feature);
    }
}
