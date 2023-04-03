import MyPacakge1.*;

import MyPacakge1.MySubPackage1.*;

public class Compile {
  public static void main(String[] args) {
    MyDemoClass1 obj = new MyDemoClass1();
    MyDemoClass2 obj1 = new MyDemoClass2();
    MyDemoClass3 obj2 = new MyDemoClass3();

    obj.method1();
    obj.method2("Aayan");
    obj.method3(3,5);

    obj1.method1();
    obj1.method2("Kshitij");
    obj1.method3(56,67);

    obj2.method1();
    obj2.method2("Aditya");
    obj2.method3(23,5);
  }  
}
