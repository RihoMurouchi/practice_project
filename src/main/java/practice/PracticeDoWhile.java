package practice;

public class PracticeDoWhile {

	public static void main(String[] args) {
		int num = 100; //初期値の設定

		do {
			System.out.println(num);//変数numを表示
			num = num - 1;
		} while (num >= 0);
	}

}
