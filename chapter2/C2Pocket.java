public class C2Pocket<E> { //Eは仮型引数(formal type parameter)と呼ばれ、クラス内のフィールドやメソッドの定義に広く利用できる
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
}