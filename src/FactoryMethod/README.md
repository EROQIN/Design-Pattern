# Factory Method - 工厂方法模式

工厂方法模式（Factory Method Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

该模式实现了对功能的分离，即把对象的创建和对象本身业务处理分离，这样使得两者能相对独立地变化。产品的功能只由产品所具有，而与产品如何创建无关。而工厂只负责创建产品，不负责产品的使用。

