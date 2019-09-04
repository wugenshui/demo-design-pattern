package creational.abstractfactory;

/**
 * 具体工厂：上饶农场类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class SRfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成");
        return new Vegetables();
    }
}
