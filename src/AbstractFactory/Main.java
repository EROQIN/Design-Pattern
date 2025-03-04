package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("参数不正确");
            return;
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://gmw.cn");
        Link us_yahoo = factory.createLink("Yahoo!", "http://yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!", "http://yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://excite.com");
        Link google = factory.createLink("Google", "http://google.com");

        Tray traynews = factory.createTray("新闻");
        traynews.add(people);
        traynews.add(gmw);
        
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "小明");
        page.add(traynews);
        page.add(traysearch);
        page.output();

        
    }
}
