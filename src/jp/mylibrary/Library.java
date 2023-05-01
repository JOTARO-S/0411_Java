package jp.mylibrary;

public class Library {
	private Book book;
	private User user;
	private Lending lending;
	
	Library() {
		
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Lending getLending() {
		return lending;
	}
	public void setLending(Lending lending) {
		this.lending = lending;
	}
	
	void getOverdueBookList() {
		System.out.printf("期限: %s, ID: %s, タイトル: %s, 著者: %s, 名前: %s, 電話番号 %s, 住所 %s%n ",
				lending.getUntilReturn(),book.getId(),book.getTitle(),book.getAuthor(),
				user.getName(),user.getPhonenumber(),user.getAddress());
	}
	
}
