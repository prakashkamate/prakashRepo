package com.cjc.calculator;
import com.cjc.sum.A;
import com.cjc.sub.B;
import com.cjc.multi.C;
import com.cjc.div.D;

public class Demo
{
public static void main (String args[])
{
A a=new A();
a.sum(10,5);
B b=new B();
b.sub(10,5);
C c=new C();
c.multi(10,5);
D d=new D();
d.div(10,5);

}
}
