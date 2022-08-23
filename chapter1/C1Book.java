//練習問題　1-1

import java.util.*;

//自然順序を宣言するためにComparableインターフェースを実装、複製をサポートしていることを外部に対して表明するためにCloneableインターフェースを実装
public class C1Book implements Comparable<C1Book>, Cloneable {
	private String title; //書名
	private Date publishDate; //発行日
	private String comment; //コメント

	//equals()オーバーライド
	public boolean equals(Object o){
		//自分自身が引数として渡されたら無条件でtrueを返す
		if (o == this) { 
			return true;
		}
		//nullが引数として渡されたら無条件でfalseを返す
		if (o == null) {
			return false;
		}
		//型が異なるならば、falseを返す
		if (!(o instanceof C1Book)) {
			return false;
		}
		//型が同じなら比較できるように適切にキャスト(変換)する
		C1Book b = (C1Book)o;
		//発行日を比較して等価か判定
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}
		//書名を比較して等価か判定
		if (!title.equals(b.title)) {
			return false;
		}
		return true;
	}
	
	//hashCode()をオーバーライド
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	//compareTo()をオーバーライド
	public int compareTo(C1Book o) {
		return this.publishDate.compareTo(o.publishDate); //発行日が古い順？
	}
	
	//clone()をオーバーライド
	public C1Book clone() {
		C1Book b = new C1Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) { 
		this.title = title;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}