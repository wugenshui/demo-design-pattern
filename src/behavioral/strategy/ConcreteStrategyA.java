package behavioral.strategy;

/**
 * 具体策略类A
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
