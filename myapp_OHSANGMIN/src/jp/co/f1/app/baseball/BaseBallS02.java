/*
 * プログラム名：野球ゲームプログラムStep2
 * プログラムの説明：生成した3桁のランダムな数字が
 * 				ユニークか重複しているかをチェックします。
				チェックした結果はコンソール画面に表示します。
 * 作成者：オ　サン　ミン
 * 作成日：2021/10/13
 */

package jp.co.f1.app.baseball;

public class BaseBallS02 {

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("---野球ゲームプログラム開始---\n");

		//ランダムな3つの数字を格納する配列変数「answer」を宣言
		int[] answer = new int[3];

		//Mathクラスのrandom()メソッドを利用して0から9までのランダムな数字を3つ生成
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)(Math.random()*10);
		}

		//配列変数「answer」の各要素に代入された数字をコンソール画面に表示
		System.out.print("３桁のランダム数字（正解数字）は ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println("です。");

		//配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
		if (answer[0] == answer[1] || answer[0] == answer[2] || answer[1] == answer[2]) {
			System.out.println("⇒重複してします。");
		} else {
			System.out.println("⇒ユニークです。");
		}

		//プログラム終了メッセージ
		System.out.println("\n---野球ゲームプログラム開始---");

	}

}
