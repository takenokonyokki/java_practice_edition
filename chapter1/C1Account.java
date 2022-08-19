//equals()の定石の書き方
//銀行口座クラスのequals()をオーバーライド
public class C1Account {
	String accountNo; //口座番号
	
	public boolean equals(Object o) { //引数はObject型にする
		if (o == this) { //自分自身が引数として渡されたら、無条件でtrueを返す
			return true;
		}
		if (o == null) { //nullが引数として渡されたら、無条件でfalseを返す
			return false;
		}
		//オブジェクト instanceof 型　→　オブジェクトが指定の型である場合、結果がtrueとなる
		if (!(o instanceof C1Account)) { //型が異なるならば、falseを返す
			return false;
		}
		C1Account r = (C1Account)o; //型が同じなら、比較できるように適切にキャスト(型変換)する
		if (!this.accountNo.trim().equals(r.accountNo.trim())) { //2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定しtrueかfalseを返す。
			return false; //trim()メソッドは、文字列の先頭と最後に空白があった場合には取り除いて文字列を返すメソッド
		}
		return true;
	}
}