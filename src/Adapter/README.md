# Adapter - 适配器设计模式

我们使用适配器设计模式来将一个类的接口转换成客户希望的另外一个接口。

适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

以该src中的代码为例，我们有一个接口是Print接口，它有两个"插孔"，即printStrong()和printWeak()方法，

而我们有一个"插头"，它叫Banner，它也有两个方法，即showWithParen()和showWithAster()。

我们希望让Banner的showWithParen()方法对应printWeak()方法，而showWithAster()方法对应printStrong()方法。

在我们无法修改Banner类和Print接口的情况下，我们可以通过PrintBanner类来将Banner的showWithParen()方法适配成printWeak()方法,将showWithAster()方法适配成printStrong()方法:

```java
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }   
```

(详见demo1)

这样，我们就可以通过PrintBanner类来调用printWeak()和printStrong()方法了。

这样做的优势在于，我们无需修改Banner类和Print接口，就可以让Banner类和Print接口协同工作。

关于适配器的实现，除了使用继承的形式，还可以使用委托的形式，简单来说，就是在适配器中创建出被适配者的对象实例，然后通过委托的方式让适配器调用被适配者的方法，详见demo2。

（在委托形式的适配器模式中，Print可以为抽象类，因为这样也可以满足PrintBanner的单继承要求）

这是一种在web开发中常用的设计模式，接口往往由框架提供，而我们无法修改接口，这时就可以通过适配器模式来让我们的类与接口协同工作。 

