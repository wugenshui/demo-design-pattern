package behavioral.state;

/**
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteStateB extends State {
    @Override
    void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
