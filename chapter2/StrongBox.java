//2-1
public class StrongBox<E> { //インスタンスを１つだけ格納できる（ジェネリクス）
	
	private KeyType keyType; //鍵の種類を示すフィールド　鍵の種類を列挙型で受け取り格納
	
	private long count; //64bitサイズ
	
	public StrongBox(KeyType key) { //鍵の種類を受け取るコンストラクタ
		this.keyType = key;
	}
	
	private E item; //格納用の変数
	
	//格納するためのputメソッド
	public void put (E i) { 
		this.item = i;
	}
	
	//取り出すためのgetメソッド
	public E get() { 
		this.count++;
		//switch文で分岐
		switch (this.keyType) {
		case PADLOCK:
			if (count < 1024) {
				return null;
			}
			break;
		case BUTTON:
			if (count < 10000) {
				return null;
			}
			break;
		case DIAL:
			if (count < 30000) {
				return null;
			}
			break;
		case FINGER:
			if (count < 1000000) {
				return null;
			}
			break;
		}
		this.count = 0;
		return this.item;
	}
}