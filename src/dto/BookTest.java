package dto;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void test1() {
		new Book().setIsbn(null);
	}

	@Test
	public void test2(){
		Book book = new Book();
		book.setIsbn("1234");
		assertThat( book.getIsbn() , is("1235"));
	}

}
