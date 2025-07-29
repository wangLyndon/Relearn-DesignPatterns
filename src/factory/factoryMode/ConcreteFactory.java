package factory.factoryMode;

public class ConcreteFactory extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
