public class C1Sword implements Cloneable {
	private String name;
	
	public C1Sword clone() {
		C1Sword result = new C1Sword();
		result.name = this.name;
		return result;
	}
	
	public C1Sword() {
		this.name = "";
	}
	public C1Sword(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
} 