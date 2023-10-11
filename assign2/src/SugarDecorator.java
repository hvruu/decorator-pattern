class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", with Sugar";
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }
}