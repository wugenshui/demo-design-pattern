package creational.factory.method;

/**
 * 具体工厂：养马场
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
