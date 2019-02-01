package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.EmployeeDTO;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	public CreateCommand(HttpServletRequest request,
			HttpServletResponse responset) {
		super(request, responset);
		System.out.println("===== !. Create커맨더 진입 =====");
		System.out.println("cmd::"+request.getParameter("cmd"));
		

		/*
		 * setAction(request.getParameter("cmd"));
		 * setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		 * setPage(request.getParameter("page")); 
		 * execute();
		 */
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName(request.getParameter("ename"));
		emp.setManager(request.getParameter("emag"));
		emp.setBirthDate(request.getParameter("ebd"));
		emp.setPhoto(request.getParameter("ephoto"));
		emp.setNotes(request.getParameter("notes"));
		EmployeeServiceImpl.getInstance().registEmployee(emp);
	
	}
}
