package structure.adapter.objectadapter;

import structure.adapter.classadapter.Adaptee;
import structure.adapter.classadapter.Target;

/**
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
