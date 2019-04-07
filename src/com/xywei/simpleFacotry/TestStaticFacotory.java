package com.xywei.simpleFacotry;

public class TestStaticFacotory {

	/**
	 * 应用在dao层
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 第一种
		System.out.println("==============================1==========================");
		Fruit fruit1 = StaticFacotry.getApple();
		fruit1.get();
		Fruit fruit2 = StaticFacotry.getBanana();
		fruit2.get();

		// 第二种
		System.out.println("==============================2==========================");

		Fruit fruit3 = StaticFacotry.getFruit("apple");
		Fruit fruit4 = StaticFacotry.getFruit("banana");
		fruit3.get();
		fruit4.get();

		System.out.println("==============================3==========================");

		// 第三种没运行出来，问题没解决，应该是JDK版本问题，我用的是jdk8
		Fruit fruit5 = StaticFacotry.getFruit3("Apple");
		Fruit fruit6 = StaticFacotry.getFruit3("Banana");
		fruit5.get();
		fruit6.get();

	}

}
