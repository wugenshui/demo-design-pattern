package behavioral.iterator;

/**
 * 迭代器（Iterator）模式
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * <p>
 * 优点如下。
 * 访问一个聚合对象的内容而无须暴露它的内部表示。
 * 遍历任务交由迭代器完成，这简化了聚合类。
 * 它支持以不同方式遍历一个聚合，甚至可以自定义迭代器的子类以支持新的遍历。
 * 增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 封装性良好，为遍历不同的聚合结构提供一个统一的接口。
 * <p>
 * 缺点是：增加了类的个数，这在一定程度上增加了系统的复杂性。
 * <p>
 * 如 Java 中的 Collection、List、Set、Map 等都包含了迭代器。
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class App {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("中山大学");
        aggregate.add("华南理工");
        aggregate.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator iterator = aggregate.getIterable();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println("\nFirst:" + iterator.first());
    }
}
