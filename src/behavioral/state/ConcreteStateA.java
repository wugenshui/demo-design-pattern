package behavioral.state;

/**
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteStateA extends State {
    @Override
    void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
