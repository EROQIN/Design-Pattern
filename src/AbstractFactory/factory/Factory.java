package AbstractFactory.factory;

public abstract class Factory {
    public static Factory getFactory(String className){
       Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Factory not found");
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
