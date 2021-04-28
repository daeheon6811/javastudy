package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode =1;

	public Book(int bookNo, String title, String author) {

		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "가 대여 됐습니다");

	}

	public void print() {
		if (this.stateCode == 0) {
			System.out.print("대여중");
			System.out.println("[bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]");
		} else {
			System.out.print("재고 있음");
			System.out.println("[bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]");

		}
	}

	

}
