package creational.factory.method;

/**
 * 工厂方法（FactoryMethod）模式
 * 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。
 * <p>
 * 优点：用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则。
 * <p>
 * 缺点：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 * <p>
 * 适用场景：客户只知道创建产品的工厂名，而不知道具体的产品名。如 TCL 电视工厂、海信电视工厂等。
 * 创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口。
 * 客户不关心创建产品的细节，只关心产品的品牌。
 *
 * @author : chenbo
 * @date : 2019/9/3
 */
public class App {
    public static void main(String[] args) {
        AnimalFarm farm1 = new HorseFarm();
        Animal animal1 = farm1.newAnimal();
        animal1.show();

        AnimalFarm farm2 = new CattleFarm();
        Animal animal2 = farm2.newAnimal();
        animal2.show();
    }
}
