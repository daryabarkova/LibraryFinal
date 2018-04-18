package library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.action.BaseAction;
import library.action.util.ActionManager;

public class SimpleServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SimpleServletController() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userAction = request.getParameter("action");
		int value = Integer.parseInt(userAction);

		BaseAction action = ActionManager.defineAction(value);
		action.manageLibrary(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
