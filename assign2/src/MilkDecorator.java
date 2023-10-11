class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", with Milk";
    }

    public double cost() {
        return coffee.cost() + 1.0;
    }
}
