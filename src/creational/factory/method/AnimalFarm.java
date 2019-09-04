package creational.factory.method;

/**
 * 抽象工厂：畜牧场
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public interface AnimalFarm {
    /**
     * 创建具体产品
     *
     * @return 具体产品
     */
    Animal newAnimal();
}
