public class C1Hero {
	private String name;
	private int hp, mp;
	
	public String toString() { //ObjectクラスのtoStringをオーバーライド
		return "HERO(NAME=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
}