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
		
	}
}