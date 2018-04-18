package library.action.console;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.action.BaseAction;
import library.bean.Book;
import library.dao.BookDao;
import library.dao.db.BookDaoMySQLImpl;

public class AddBookConsoleImpl implements BaseAction{
	
	private BookDao dao = new BookDaoMySQLImpl();

	@Override
	public void manageLibrary(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		
		String title = request.getParameter("title");
		String author_details = request.getParameter("author_details");
		String yearOfPublish = request.getParameter("year");
		
		int year= Integer.parseInt(yearOfPublish);
		
		Book book = new Book();
		book.setTitle(title);
		book.setYear(year);
		book.setAuthorDetails(author_details);
		
		if(dao.create(book)) {
			response.getWriter().append("New book has been registered successfully!");
		}else {
			response.getWriter().append("Unfortunately registration process has not been completed, please try again!");
		}
	}
}
