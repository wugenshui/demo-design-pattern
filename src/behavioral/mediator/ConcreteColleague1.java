package behavioral.mediator;

/**
 * 具体同事类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
