# Iterator - 迭代器设计模式


#### 模式核心思想
迭代器模式通过将集合对象的遍历行为抽象为独立迭代器对象，实现数据存储与遍历逻辑的解耦。该模式完美遵循**单一职责原则**和**开闭原则**。

#### 代码结构解析
![Iterator UML](https://refactoring.guru/images/patterns/diagrams/iterator/structure.png)

（示意图说明：聚合对象与迭代器的协作关系）

##### 1. 聚合对象实现（BookShelf）
```java
public class BookShelf {
    private ArrayList<Book> books;
    
    public Iterator iterator() {
        return new BookShelfIterator(this); // 创建专属迭代器
    }
    // 其他集合操作方法...
}
```
- 封装数据存储细节（ArrayList实现）
- 通过工厂方法返回对应迭代器

##### 2. 迭代器实现（BookShelfIterator）
```java
public class BookShelfIterator implements Iterator {
    private int index;
    private BookShelf bookShelf;

    public Object next() {
        return bookShelf.getBookAt(index++); // 按索引顺序访问
    }
    
    public boolean hasNext() {
        return index < bookShelf.getLength(); // 边界判断
    }
}
```
- 持有集合对象的引用
- 封装遍历状态（index）
- 实现标准遍历接口

##### 3. 客户端调用（Main）
```java
Iterator it = bookShelf.iterator();
while(it.hasNext()) {
    Book book = (Book)it.next(); // 统一访问方式
}
```
- 无需了解集合内部结构
- 支持同时多个遍历会话

#### 模式优势
1. **遍历算法可扩展**：可创建反向迭代器/过滤迭代器等变体
2. **集合实现透明化**：ArrayList切换为数组不影响客户端
3. **并行遍历支持**：如示例中it与it2的独立遍历
4. **接口统一**：所有集合对象使用相同的遍历方式

#### 典型应用场景
- 需要提供多种遍历方式
- 需要统一遍历异构集合（数组/树/图）
- 需要隐藏集合内部实现细节
- 需要支持分布式遍历

