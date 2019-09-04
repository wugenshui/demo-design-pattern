package creational.builder;

/**
 * 产品角色：包含多个组成部件的复杂对象
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Product {
    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("partA = " + partA);
        System.out.println("partB = " + partB);
        System.out.println("partC = " + partC);
    }
}
