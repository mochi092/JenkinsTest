package dto;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void 適切なISBNを設定できる(){
		Book book = new Book();
		book.setIsbn("1234");
		assertThat( book.getIsbn() , is("1237"));
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void nullはISBNに設定できない() {
		new Book().setIsbn(null);
	}
}
