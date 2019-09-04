package structure.composite;

/**
 * 抽象构件
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
interface Component {
    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();
}
