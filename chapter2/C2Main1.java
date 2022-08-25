public class C2Main1 {
	public static void main(String[] args) {
		C2Pocket<String> p = new C2Pocket<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}
}