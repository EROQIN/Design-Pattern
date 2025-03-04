package AbstractFactory.factory;

public abstract class Item {
    protected String caption; //标题
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
