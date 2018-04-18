package library.action.console;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.action.BaseAction;
import library.bean.Book;
import library.dao.BookDao;
import library.dao.db.BookDaoMySQLImpl;

public class BookListConsoleImpl implements BaseAction {

	private BookDao dao = new BookDaoMySQLImpl();

	@Override
	public void manageLibrary(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.getWriter().append("LIST OF BOOKS <br> <br>");
		
		List<Book> books = dao.readAll();
		int bookCounter = 1;

		if (books != null) {
			for (Book book : books) {
				System.out.println(book);
				response.getWriter().append("Book #" + bookCounter + "<br>");
				response.getWriter().append(book.toString() + "<br>" + "<br>");
				bookCounter += 1;

			}
		} else {
			System.out.println("Library is empty");
		}
	}
}
