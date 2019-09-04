package structure.decorator;

/**
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
