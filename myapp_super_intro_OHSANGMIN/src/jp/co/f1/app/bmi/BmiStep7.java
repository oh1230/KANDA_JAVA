/*
 * プログラム名　：　myapp_super_intro_OHSANGMIN
 * プログラム説明　：　身長と体重を入力したら、BMI数値を計算して出力。
 * 				また、Bmi数値によって「太り気味です。」というメッセージを出力。
 * 作成者　：　オ　サン　ミン
 * 作成日　：　2021年10月5日
 */

package jp.co.f1.app.bmi;

import java.util.Scanner;

public class BmiStep7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double tall = 0;
		double weight = 0;

		// プログラム開始メッセージ
		System.out.println("※※BMI計算プログラムを開始します※※");
		System.out.println();

		while (true) {
			//身長を入力
			System.out.print("身長を入力してください＞");
			tall = sc.nextDouble();

			//体重を入力
			System.out.print("体重を入力してください＞");
			weight = sc.nextDouble();

			if (tall <= 0 || weight <= 0) {
				System.out.println("※※0以下の数値があるため、再入力してください※※");
				System.out.println();
				continue;
			} else {
				break;
			}
		}

		//身長を出力
		System.out.print("身長が　");
		System.out.print(tall);
		System.out.print("cm、　");

		//体重を出力
		System.out.print("体重が　");
		System.out.print(weight);
		System.out.println("ｋｇの場合");

		//heightとbmi変数宣言
		double height = tall * 0.01;
		double bmi = weight / (height * height);

		//BMI数値を出力
		System.out.println("BMIの値は" + bmi + "です。");

		if (bmi >= 25) {
			System.out.println("太り気味です。");
		} else if (bmi < 18.5) {
			System.out.println("やせ気味です。");
		} else {
			System.out.println("正常値です。");
		}

		System.out.println();
		System.out.print("※※BMI計算プログラムを終了します※※");

	}

}
