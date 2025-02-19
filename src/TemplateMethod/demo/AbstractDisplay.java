package TemplateMethod.demo;

public abstract class AbstractDisplay {
    abstract public void open();
    abstract public void print();
    abstract public void close();

    // 定义一道模版（流水线）
    /**
     * Template Method
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
