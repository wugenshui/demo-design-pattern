package creational.builder;

/**
 * 具体建造者：实现了抽象建造者接口。
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造PartC");
    }
}
