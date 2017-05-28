package dto;

import org.junit.Test;

public class BookTest {

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void testSetIsbn() {
		new Book().setIsbn(null);
	}

}
