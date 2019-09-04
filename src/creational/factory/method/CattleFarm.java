package creational.factory.method;

/**
 * 具体工厂：养牛场
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
