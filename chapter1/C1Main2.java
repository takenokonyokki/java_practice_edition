import java.util.*;

public class C1Main2 {
	public static void main(String[] args) {
		//HashSetでremoveできない例
		Set<C1Hero> list = new HashSet<>(); //HashSetは要素の重複を許可しない集合構造で順番を持たない
		C1Hero h1 = new C1Hero(); //C1Hero型の変数h1のC1Heroインスタンス生成
		h1.name = "moe"; //h1のnameにmoeを代入
		list.add(h1); //add()で配列listにh1の要素を追加
		System.out.println("element=" + list.size()); //size()で配列listの要素数を確認、1になる
		C1Hero h2 = new C1Hero(); //C1Hero型の変数h2のC1Heroインスタンス生成
		h2.name = "moe"; //h2のnameにmoeを代入
		list.remove(h2); //remove()で配列listの中でh2と同じもの削除する
		System.out.println("element=" + list.size()); //size()で配列listの要素数を確認し、removeで削除したはずが、削除できていないため、1になる
		
		//上記がうまく動かないのは、hashCode()がオーバーライドされていないかったため、正しくないハッシュコードが返されたから
		
		//C1HeroクラスでhashCode()をオーバーライドさせれば、正しいハッシュコードを返され削除できる
	}
}