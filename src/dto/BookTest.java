package dto;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void nullをISBNに設定できなこと() {
		new Book().setIsbn(null);
	}

	@Test
	public void ISBNを設定できること(){
		Book book = new Book();
		book.setIsbn("1234");
		assertThat( book.getIsbn() , is("1235"));
	}

}
