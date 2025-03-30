package org.comit.course._16_practice;

class MyGenericClass<S, U> {

	S s;
	U u;

	MyGenericClass(S s, U u) {
		this.s = s;
		this.u = u;
	}

	S getS() {
		return s;
	}

	U getU() {
		return u;
	}

}

public class Exercise1 {
	public static void main(String[] args) {

		MyGenericClass<String, Integer> obj = new MyGenericClass<>("Hello", 1);

		System.out.println(obj.getS());
		System.out.println(obj.getU());
	}
}
