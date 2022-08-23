import java.util.Comparator;

public class TitleComparator implements Comparator<C1Book> {
	public int compare(C1Book x, C1Book y) {
		return x.getTitle().compareTo(y.getTitle());
	}
}