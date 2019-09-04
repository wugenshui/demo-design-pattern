package creational.abstractfactory;

/**
 * 具体产品：水果类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Fruitage implements Plant {
    @Override
    public void show() {
        System.out.println("植物：水果");
    }
}
