package creational.abstractfactory;

/**
 * 抽象工厂：农场类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public interface Farm {
    /**
     * 新建植物
     *
     * @return 植物
     */
    Plant newPlant();

    /**
     * 新建动物
     *
     * @return 动物
     */
    Animal newAnimal();
}
