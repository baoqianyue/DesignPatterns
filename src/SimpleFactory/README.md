     
# 简单工厂模式       
简单工厂模式又叫静态工厂模式，其核心就在这个静态的分类新建实例的方法。         
比如我们的客户需要负责各个模块的程序员，需要擅长各种语言的程序员，这时我们可以使用静态工厂模式。     
## 普通方法      

```Java
public class JavaProgrammer{
  public JavaProgrammer(){
    System.out.println("我是一个Java程序员");
  }
}

public class AndroidProgrammer{
  public AndroidProgrammer(){
    System.out.println("我是一个Android程序员");
  }
}

public class Custom{
  public static void main(String [] args){
    JavaProgrammer java = new JavaProgrammer();
    AndroidProgrammer android = new AndroidProgrammer();
  }
}
```    


## 静态工厂实现       
上面的方法虽然也能满足要求，但是耦合度太高，其实客户需要知道一个程序员的能力，但没毕竟要知道他的成长历程，为了降低耦合，我们引入工厂类，将程序员的成长历程和一些客户不必要知道的属性放到工厂里，客户直接通过工厂的创建工厂方法，新建一个程序员最高父类，输入他所需要程序员的类型，利用多态，将用户操作和程序员分离开来        

* UML类图        
 ![](https://ooo.0o0.ooo/2017/07/02/5958937eed8fc.png)

* 定义程序员最高父类，可以定义一些程序员共有的属性          


```Java
public class Programmer  {
    public Programmer(){

    }
}

```
* 定义具体的程序员，可以有各种程序员特定的属性      


```java
public class JavaProgrammer extends Programmer{
  public JavaProgrammer(){
    System.out.println("我是一个Java程序员");
  }
}

public class AndroidProgrammer extends Programmer{
  public AndroidProgrammer(){
    System.out.println("我是一个Android程序员");
  }
}
```      

* 定义程序员工厂        


```java
public class ProgrammerFactory{
  public static Programmer createProgrammer(String type){
    Programmer programmer = null;
    switch (type) {
      case "Java":
      programmer = new JavaProgrammer();
      return programmer;
      case "Android":
      programmer = new AndroidProgrammer();
      return programmer;
      default:
        return programmer;
    }
  }
}
```        

* 客户端           


```java
public class Customer{
  public static void main(String [] args){
    Programmer java = ProgrammerFactory.createProgrammer("Java");
    Programmer android = ProgrammerFactory.createProgrammer("Android");
  }
}
```      

程序输出：        
```
我是一个Java程序员
我是一个Android程序员

```          

## 静态工厂模式的缺陷        
虽然我们解决了普通方式耦合性太高的问题，但是我们还违背面向对象的开闭原则，我们现在的程序员只有Java和Android两种，如果客户需要更多种类的程序员时，修改程序就要在工厂类中增添更多的case，这就违反了开闭原则。          
> 开闭原则(Open-Closed Principle, OCP)：一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展。   
 在开闭原则的定义中，软件实体可以指一个软件模块、一个由多个类组成的局部结构或一个独立的类。
