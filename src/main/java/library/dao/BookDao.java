package library.dao;

import java.util.List;

import library.bean.Book;

public interface BookDao extends BaseDaoAction<Book>{

	List<Book> readAll();
}
