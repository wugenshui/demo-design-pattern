package behavioral.strategy;

/**
 * 策略（Strategy）模式：
 * 该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 * <p>
 * 优点如下。
 * 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句。
 * 策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 * 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 * 策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 * 策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离。
 * <p>
 * 缺点如下。
 * 客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 * 策略模式造成很多的策略类。
 * <p>
 * 例如，出行旅游可以乘坐飞机、乘坐火车、骑自行车或自己开私家车等，超市促销可以釆用打折、送商品、送积分等方法。
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();
        System.out.println("--------------");
        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }
}
