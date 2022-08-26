import java.util.*;

public class C2Main1 {
	//null安全性　⇒　Optionalを使用する
	public static Optional<String> decorate(String s, char c) { //文字列sを文字cで挟んで装飾するメソッド
		String r;
		if (s == null || s.length() == 0) { //文字列sがnullまたは長さ0の場合はnullを返す
			r = null;
		} else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) {
		Optional<String> s = decorate("", '*');
		System.out.println(s.orElse("nullのため処理できません"));
		
		C2Pocket<String> p = new C2Pocket<>();
		p.put("1192");
		String s2 = p.get();
		System.out.println(s2);
	}
}