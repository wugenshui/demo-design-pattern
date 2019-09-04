package structure.decorator;

/**
 * 装饰（Decorator）模式：
 * 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 * <p>
 * 优点：
 * 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
 * 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
 * <p>
 * 缺点：装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
 * <p>
 * 例如：房子装修、相片加相框等
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class App {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(p);
        concreteDecorator.operation();
    }
}
