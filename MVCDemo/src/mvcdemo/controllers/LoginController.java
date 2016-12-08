package mvcdemo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvcdemo.model.Authenticator;
import mvcdemo.model.User;
import sun.text.normalizer.ICUBinary.Authenticate;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
	//	System.out.println("Username :"+username+"\t password :"+password);
		
		RequestDispatcher rd = null;

		Authenticator authenticator = new Authenticator();
		String result = authenticator.authenticate(username, password);
		if (result.equals("success")) {
	        HttpSession session=request.getSession();  
	        session.setAttribute("username",username);  
	        
			rd = request.getRequestDispatcher("/index.jsp");
			User user = new User(username, password);
			request.setAttribute("lbl_user", user);
		}else{
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}

}