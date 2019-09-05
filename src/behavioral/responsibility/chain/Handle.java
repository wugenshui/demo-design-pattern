package behavioral.responsibility.chain;

/**
 * 抽象处理者角色
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
abstract class Handle {
    private Handle next;

    public void setNext(Handle next) {
        this.next = next;
    }

    public Handle getNext() {
        return next;
    }

    /**
     * 处理请求
     */
    public abstract void handleRequest(String request);
}
