package behavioral.memento;

/**
 * 发起人
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态
     *
     * @return 备忘录
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 回复状态
     *
     * @param memento 备忘录
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
