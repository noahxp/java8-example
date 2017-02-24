package java8.example;

class A {

}

public class Anonymous {

	public static void main(String[] args) {

		A a = new A() {
			public String sayHi(String name) {
				return "hi," + name;
			}
		};

		final int cc = 9;
		(new A() { // 匿名類別
			int bb = 10000; // 匿名類別的成員

			public void show() { // 匿名類別的方法
				System.out.println("匿名類別：");
				System.out.println("this  ->bb= " + bb);
				System.out.println("main()->cc= " + cc);
			}
		}).show();

	}
}
