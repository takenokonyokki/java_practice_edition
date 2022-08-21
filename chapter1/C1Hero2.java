public class C1Hero2 implements Cloneable {
	String name;
	int hp;
	C1Sword sword;
	
	public C1Hero2 clone() {
		C1Hero2 result = new C1Hero2();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
	
	public C1Hero2() {
		this.name = "";
	}
	public C1Hero2(String name) {
		this.name = name;
	}
	public C1Sword getC1Sword() {
		return this.sword;
	}
	public void setC1Sword(C1Sword sword) {
		this.sword = sword;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}