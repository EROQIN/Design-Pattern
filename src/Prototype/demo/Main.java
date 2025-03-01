package Prototype.demo;

import Prototype.demo.framework.Manager;
import Prototype.demo.framework.Product;

public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("waring box", mbox);
        manager.register("slash box", sbox);


        //生成
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("waring box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

    }
}
