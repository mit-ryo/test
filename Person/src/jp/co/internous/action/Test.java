package jp.co.internous.action;

public class Test {

	public static void main(String[]args){

		Person taro = new Person();

		taro.name = "山田太郎";
		taro.age = 20;

		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();



		Person jiro = new Person();

		jiro.name = "木村次郎";
		jiro.age = 18;

		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person hanako = new Person();

		hanako.name = "鈴木花子";
		hanako.age = 16;

		System.out.println(hanako.name);
		System.out.println(hanako.age);


		Person ryo = new Person();

		ryo.name = "三橋怜";
		ryo.age = 27;
		ryo.phoneNumber = "080-0000-1111";
		ryo.address = "神奈川";

		System.out.println(ryo.name);
		System.out.println(ryo.age);
		System.out.println(ryo.phoneNumber);
		System.out.println(ryo.address);


		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();


	}

}
