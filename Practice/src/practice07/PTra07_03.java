package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		char[] keyWord = {'平', '島', '沼', '山', '森'};

		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		for(char i = 4;i < keyWord.length; i--) {
			System.out.println(keyWord[i]);
		}

		}
}
