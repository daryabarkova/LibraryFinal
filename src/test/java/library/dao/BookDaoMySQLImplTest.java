package library.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import library.dao.db.BookDaoMySQLImpl;

public class BookDaoMySQLImplTest {
	
	private BookDao dao = null;
	
	@Before
	
	public void initData() {
		dao = new BookDaoMySQLImpl();
	}

	@Test
	
	public void testReadAllNotNull() {
		Assert.assertNotNull(dao);
		Assert.assertNotNull(dao.readAll());
	}
	
}
