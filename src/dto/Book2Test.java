package dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class Book2Test {

	@Test
	public void 適切なISBNを設定できる(){
		Book book = new Book();
		book.setIsbn("1234");
		assertEquals("1234",book.getIsbn());
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void nullはISBNに設定できない() {
		new Book().setIsbn(null);
	}
}
