package creational.abstractfactory;

/**
 * 具体产品：蔬菜类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Vegetables implements Plant {
    @Override
    public void show() {
        System.out.println("植物：蔬菜");
    }
}
