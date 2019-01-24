package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		final int distance = 300;

		Car carRed = new Car();
		carRed.color = "red";
		carRed.gasoline = 30;

		int x = carRed.run();
		int n = distance - x;

		System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");


		Car carGreen = new Car();
		carGreen.color = "green";
		carGreen.gasoline = 40;

		int i = carGreen.run();
		int y = distance - i;

		System.out.println("目的地にまで" + y + "時間かかりました。残りのガソリンは、" + i + "リットルです");


		Car carBlack = new Car();
		carBlack.color = "black";
		carBlack.gasoline = 50;

		int v = carBlack.run();
		int h = distance - x;

		System.out.println("目的地にまで" + h + "時間かかりました。残りのガソリンは、" + v + "リットルです");


	}
}
