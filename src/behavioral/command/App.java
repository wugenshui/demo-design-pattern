package behavioral.command;

/**
 * 命令（Command）模式
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 * <p>
 * 优点如下。
 * 降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。
 * 增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，它满足“开闭原则”，对扩展比较灵活。
 * 可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 * 方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 * <p>
 * 缺点是：可能产生大量具体命令类。因为计对每一个具体操作都需要设计一个具体命令类，这将增加系统的复杂性。
 * <p>
 * 例子也很多，例如，电视机遥控器（命令发送者）通过按钮（具体命令）来遥控电视机（命令接收者），还有计算机键盘上的“功能键”等。
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class App {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
