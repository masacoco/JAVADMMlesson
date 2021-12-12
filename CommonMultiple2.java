
public class CommonMultiple2 {
	public static void main(String[] args) {
//		２または３の倍数を１から５０未満の範囲で表示するプログラム
		int i = 1;
		while (i < 50) {
			if ((i % 2 == 0)||(i % 3 == 0)) {
//				論理和
				System.out.println(i);
			}
			i++;
		}
	}

}
