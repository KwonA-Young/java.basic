package example.modi.member.pack2;

import example.modi.member.pack1.A;

public class C {

	public C() {
		
		A a = new A();
		
		a.a = 1; //public 
		a.b = 2; //default
		a.c = 3; //private
		
		a.method1(); //public
		a.method2(); //default
		a.method3(); //private
	}
}
