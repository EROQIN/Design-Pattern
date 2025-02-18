package Adapter.demo2;

/**
 * PrintBanner（委托形式，使用组合代替继承）
 */
public class PrintBanner implements Print {

    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }   
    
    


    
}