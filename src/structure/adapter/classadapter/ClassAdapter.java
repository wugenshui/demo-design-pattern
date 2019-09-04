package structure.adapter.classadapter;

/**
 * 类适配器类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
