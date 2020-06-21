/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracing;

/**
 *
 * @author Rakibul Hasan Remon
 */
public class Tester {
    public static void main(String[] args) {
        int x[] = {23};
A a1 = new A();
B b1 = new B();
B b2 = new B(b1);
a1.methodA(1, x);
b2.methodB(3, 2);
a1.methodA(1, x);

    }
}
