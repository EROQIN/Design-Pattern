package Builder.demo;

public class Main {
    
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("参数不正确");
            return;
        }
        if(args[0].equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename+"文件编写完毕");
        }
        else{
            System.out.println("参数不正确");
        }
    }
    
}
