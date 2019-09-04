package creational.abstractfactory;

/**
 * 抽象工厂（AbstractFactory）：
 * 是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * <p>
 * 优点：具有工厂方法模式的优点。
 * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 * 当增加一个新的产品族时不需要修改原代码，满足开闭原则。
 * <p>
 * 缺点：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 * <p>
 * 电器厂既生产电视机又生产洗衣机或空调
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class App {
    public static void main(String[] args) {
        Farm farm1 = new SGfarm();
        Animal animal1 = farm1.newAnimal();
        animal1.show();
        Plant plant1 = farm1.newPlant();
        plant1.show();

        Farm farm2 = new SRfarm();
        Animal animal2 = farm1.newAnimal();
        animal2.show();
        Plant plant2 = farm1.newPlant();
        plant2.show();
    }

}
