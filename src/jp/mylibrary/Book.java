package jp.mylibrary;

 class Book {
	private int id;
	private String title;
	private String author;
	private String isbn;
	private String ndc;
	
	Book(int id, String title, String author, String isbn, String ndc) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.ndc = ndc;
	}
	Book() {
		
	}
	Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	Book(int id, String title, String author, String isbn) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	String getIsbn() {
		return isbn;
	}

	 void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	String getNdc() {
		return ndc;
	}

	void setNdc(String ndc) {
		this.ndc = ndc;
	}
	void getBookDataAll() {
		System.out.printf("ID: %s, タイトル: %s, 著者: %s, ISDN: %s, NDC: %s%n",id,title,author,isbn,ndc);
	}

}
