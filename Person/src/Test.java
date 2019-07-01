
public class Test {

	public static void main(String[] args) {
	Person taro=new Person();
	taro.name="中井勝英";
	taro.age=24;
	taro.phoneNumber="07016400852";
	taro.address="ka-nakai@i.softbank.jp";

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();



	Robot aibo = new Robot();
	aibo.name="アイボ";
	aibo.talk();
	aibo.walk();
	aibo.run();


	Robot asimo=new Robot();
	asimo.name="アシモ";
	asimo.talk();
	asimo.walk();
	asimo.run();


	Robot pepper=new Robot();
	pepper.name="ペッパー";
	pepper.talk();
	pepper.walk();
	pepper.run();

	}

}
