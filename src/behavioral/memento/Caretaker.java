package behavioral.memento;

/**
 * 管理者
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
