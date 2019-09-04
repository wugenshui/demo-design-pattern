package structure.composite;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}
