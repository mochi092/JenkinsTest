package dto;

public class Book {
	String isbn;

	public void setIsbn(String isbn){
		if(isbn == null || isbn.length() ==0 ){
			throw new IllegalArgumentException();
		}
		this.isbn = isbn;
	}

	public String getIsbn(){
		return this.isbn;
	}
}
