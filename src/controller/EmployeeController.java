package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Command;
import command.Commander;
import command.Receiver;
import domain.EmployeeDTO;
import enums.Action;
import service.EmployeeService;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeService service = EmployeeServiceImpl.getInstance();
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Employee 로 들어왔다====");
		String emag = request.getParameter("emag");
		String ename = request.getParameter("ename");
		String ebd = request.getParameter("ebd");
		String epoto = request.getParameter("epoto");
		String notes = request.getParameter("notes");
		
		System.out.println("emag:: " + emag);
		System.out.println("ename:: " + ename);
		System.out.println("ebd:: " + ebd);
		System.out.println("empno:: " + epoto);
		System.out.println("notes:: " + notes);
		
		System.out.println("===== 1.컨트롤러 진입 =====");
		Receiver.init(request,response);
		/*
		 * employeeID, manager, name, birthDate, photo, notes;
		 */	
	
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case MOVE:
			System.out.println("---케이스 MOVE---");
			Carrier.forward(request, response);
			break;
		case REGISTER:
			System.out.println("---케이스 REGISTER---");
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("ename"));
			emp.setManager(request.getParameter("emag"));
			emp.setBirthDate(request.getParameter("ebd"));
			emp.setNotes(request.getParameter("notes"));
			service.registEmployee(emp);
			
			Carrier.forward(request, response);
			break;
		case ACCESS:
			System.out.println("---케이스 ACCESS---");
			emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("ename"));
		//	service.existsEmployee(searchWord);
			Carrier.forward(request, response);
			break;
			
		default:
			break;
		}
		
	}



}
