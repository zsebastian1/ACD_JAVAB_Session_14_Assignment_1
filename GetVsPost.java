package Assignment14;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetVsPost
 */
@WebServlet("/GetVsPost")
public class GetVsPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public GetVsPost() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
     	
    }
    public void destroy() {
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("You have entered a 'get'. The parameter you entered was: " + request.getParameter("value"));
		response.getWriter().append("<form action='GetVsPost' method='post'>"
				+ "<input type='text' name='value'>"
				+ "<input type='submit' value='Click for POST'>"
				+ "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("You have entered a 'post'. The parameter you entered was: " + request.getParameter("value"));
		response.getWriter().append("<form action='GetVsPost' method='get'>"
				+ "<input type='text' name='value'>"
				+ "<input type='submit' value='Click for GET'>"
				+ "</form>");
	}

}