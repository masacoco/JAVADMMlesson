
public class CommonMultiple3 {
	public static void main(String[] args) {
//		2と３の公倍数以外の数示する
		int i = 1;
		while (i < 20) {
			if (!((i % 2 == 0)&&(i % 3 == 0))) {
//				Not演算子の例
				System.out.println(i);
			}
			i++;
		}
	}

}
