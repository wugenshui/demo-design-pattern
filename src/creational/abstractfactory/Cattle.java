package creational.abstractfactory;

/**
 * 具体产品：牛类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Cattle implements Animal {
    @Override
    public void show() {
        System.out.println("牛：哞哞哞");
    }
}
