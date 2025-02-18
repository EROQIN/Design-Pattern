package TemplateMethod.demo;

public class StringDisplay extends AbstractDisplay {

    private String str;

    public StringDisplay(String string) {
        this.str = string;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println(("|" + str + "|"));
    }

    @Override
    public void close() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }   

}
