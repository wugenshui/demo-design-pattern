package behavioral.state;

/**
 * 状态（State）模式
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 * <p>
 * 优点如下。
 * 状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”。
 * 减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖。
 * 有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换。
 * <p>
 * 缺点如下。
 * 状态模式的使用必然会增加系统的类与对象的个数。
 * 状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。
 * <p>
 * 如人的情绪有高兴的时候和伤心的时候，不同的情绪有不同的行为，当然外界也会影响其情绪变化。
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
