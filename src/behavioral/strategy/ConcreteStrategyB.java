package behavioral.strategy;

/**
 * 具体策略类B
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
