package behavioral.iterator;

/**
 * 抽象聚合
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public interface Aggregate {
    /**
     * 添加元素
     *
     * @param obj 元素
     */
    void add(Object obj);

    /**
     * 移除元素
     *
     * @param obj 元素
     */
    void remove(Object obj);

    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    Iterator getIterable();
}
