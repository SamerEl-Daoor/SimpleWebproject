package aqarDelta;
import java.io.IOException;

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Controller extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	View myView=new View();
    Model myModel=new Model();
    
    
    
    public Controller() {

        super();

        // TODO Auto-generated constructor stub

    }
    //=============================
    public Controller(View view,Model model){
    model=myModel;
    view=myView;
    }
    
    
    protected void doGet
    (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	
		String userName = req.getParameter("un") ;
		String userPass = req.getParameter("pw") ;
		
		res.getWriter().append("Served at: "+userName+" & "+userPass) ; 

		
	}
    
    
    protected void doPost
    (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}



}
