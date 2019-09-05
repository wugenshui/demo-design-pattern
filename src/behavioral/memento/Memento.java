package behavioral.memento;

/**
 * 备忘录
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
