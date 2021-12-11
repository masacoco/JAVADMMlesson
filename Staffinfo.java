

//クラス定義
class Staff{
	String name;
	int staffid;
	String email;
	
//	メゾット追加
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
}

public class Staffinfo {

//	これはUdemyでの演習です。
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
//		System.out.println(yamada.name);
		yamada.sayhello();

	}

}
