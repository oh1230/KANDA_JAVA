/*
 * プログラム名　：　myapp_super_intro_OHSANGMIN
 * プログラム説明　：　High＆Low ゲーム
 * 作成者　：　オ　サン　ミン
 * 作成日　：　2021年10月5日
 */

package jp.co.f1.app.highandlow;

public class HighAndLowS03 {

	public static void main(String[] args) {

		System.out.println("************");
		System.out.println("*High & Low*");
		System.out.println("************");
		System.out.println();

		int num = (int)(Math.random()*9)+1;
		System.out.println("  [問題表示]");
		System.out.println("*****  *****");
		System.out.println("*   *  *****");
		System.out.println("* " +num + " *  *****");
		System.out.println("*   *  *****");
		System.out.println("*****  *****");

		System.out.println();
		System.out.println("--ゲーム終了--");

	}

}
