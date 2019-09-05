package behavioral.mediator;

/**
 * 抽象中介者
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
abstract class Mediator {
    /**
     * 注册
     *
     * @param colleague 同事
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     *
     * @param colleague 同事
     */
    public abstract void relay(Colleague colleague);
}
