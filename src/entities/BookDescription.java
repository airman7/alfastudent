package entities;

public class BookDescription {
	int did;
	String class1;
	String board;
	String author;
	String publications;
	String subject;
	String language;
	int pages;
	String edition;
	int publishing_year;
	String binding;
	String details;
	
	public BookDescription(int did, String class1, String board, String author, String publications, String subject,
			String language, int pages, String edition, int publishing_year, String binding, String details) {
		super();
		this.did = did;
		this.class1 = class1;
		this.board = board;
		this.author = author;
		this.publications = publications;
		this.subject = subject;
		this.language = language;
		this.pages = pages;
		this.edition = edition;
		this.publishing_year = publishing_year;
		this.binding = binding;
		this.details = details;
	}
	public BookDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getPublishing_year() {
		return publishing_year;
	}
	public void setPublishing_year(int publishing_year) {
		this.publishing_year = publishing_year;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
