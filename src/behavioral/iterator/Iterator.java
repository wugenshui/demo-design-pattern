package behavioral.iterator;

/**
 * 抽象迭代器
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
