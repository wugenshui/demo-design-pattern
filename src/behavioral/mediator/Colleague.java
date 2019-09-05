package behavioral.mediator;

/**
 * 抽象同事类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
