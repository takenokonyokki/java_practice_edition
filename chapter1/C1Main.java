import java.util.*;
import java.util.Arrays;

public class C1Main {
	public static void main(String[] args) {
		//Objectクラス　→　すべてのクラスは、その継承関係を親へと辿って行くとjava.lang.Objectクラスに行き着く
		
		
		//多くのインスタンスに共通する5つの基本操作
		/*メソッド　　　　　　　操作内容　　　　　　　　　関連するクラス
		  toString()　　　文字表現を得る　　　　　　Object
		  equals()　　　  等価判定を行う        Object
		  hashCode() 　　ハッシュ値を得る        Object
		  compareTo()　　大小関係を判定する    Comparable
		  clone()     　複製する　　　　　　　　　　 Object , Cloneable
		*/
		

		//toString()　→　インスタンスの中身の情報を知りたいならとにかくtoString()を呼び出せばよい。特にデバック作業やログ出力の場面で活躍する。
		C1Hero h1 = new C1Hero(); //C1Heroのインスタンスを生成
		System.out.println(h1); //h1.toString()の結果が表示される
		
		
		//equals() →　2つの変数に入っているインスタンスを比較して等価(equivalent)であるか判定する。等値(==)とは別物
		List<C1Hero> list = new ArrayList<>(); //ArrayListのインスタンスを生成
		C1Hero h2 = new C1Hero(); //h2のC1Heroインスタンスを生成
		h2.name = "ryuto"; //h2のnameにryutoを代入
		list.add(h2); //add()メソッドで変数listの配列に変数h2の要素を追加
		System.out.println("element=" + list.size()); //sizeメソッドで要素数を確認
		C1Hero h3 = new C1Hero(); //h3のC1Heroインスタンス
		h3.name = "ryuto"; //h3のnameにryutoを代入
		list.remove(h3); //remove()メソッドでlistの配列の中でh3と同じもの削除する
		//↑equals()がオーバーライドできていなかった場合、等価判定ができず、削除が行われない
		System.out.println("element=" + list.size());
		
		
		//配列同士を比較しようとしてequals()を使うと等値判定を行ってしまう
		//なので、2つの配列を等価判定したい場合はjava.util.Arraysクラスの静的メソッドequals()を使用する
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a, b));
	}
}