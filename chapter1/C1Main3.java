import java.util.*;

public class C1Main3 {
	public static void main(String[] args) {
		//インスタンスの複製　⇒　防御的コピー(defensive)
		//clone()で複製できる。しかし次の2つの作業が必要になる
		//①Cloneableインターフェースを実装する
		//②clone()をpublicでオーバーライドする
		
		C1Hero2 h1 = new C1Hero2("ryuto"); //インスタンス生成
		C1Sword s = new C1Sword("sword"); //インスタンス生成
		
		h1.setC1Sword(s); //h1のsetC1Sword()メソッドを引数sで呼出し
		System.out.println("weapon:" + h1.getC1Sword().getName());
		C1Hero2 h2 = h1.clone(); //h1をh2に複製する
		
		h1.getC1Sword().setName("Java"); //swordのnameをJavaに変更
		System.out.println("h1:" + h1.getC1Sword().getName() + "/h2:" + h2.getC1Sword().getName());
	}
}