package behavioral.responsibility.chain;

/**
 * 具体处理者角色1
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteHandler1 extends Handle {
    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
