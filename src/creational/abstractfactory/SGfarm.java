package creational.abstractfactory;

/**
 * 具体工厂：韶关农场类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class SGfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成");
        return new Fruitage();
    }
}
