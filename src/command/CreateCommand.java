package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	public CreateCommand(HttpServletRequest request,
			HttpServletResponse responset) {
		super(request, responset);
		System.out.println("===== !. Create커맨더 진입 =====");
		System.out.println("cmd::"+request.getParameter("cmd"));
		System.out.println("dir::"+request.getParameter("dir"));
		System.out.println("page::"+request.getParameter("page"));
		/*
		 * setAction(request.getParameter("cmd"));
		 * setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		 * setPage(request.getParameter("page")); 
		 * execute();
		 */
		
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER :
				EmployeeDTO emp = new EmployeeDTO();
				emp.setName(request.getParameter("ename"));
				emp.setManager(request.getParameter("emag"));
				emp.setBirthDate(request.getParameter("ebd"));
				emp.setPhoto(request.getParameter("ephoto"));
				emp.setNotes(request.getParameter("notes"));
				EmployeeServiceImpl.getInstance().registEmployee(emp);
			break;
		case SIGNUP : 
			/*
			 * var customId = $('#custom_id').val(); var cname = $('#cname').val(); var
			 * password = $('#cpassword').val(); var addr = $('#addr').val(); var city =
			 * $('#city').val(); var pcode = $('#pcode').val(); var coun = $('#coun').val();
			 */
				CustomerDTO cus = new CustomerDTO();
				cus.setCustomerID(request.getParameter("customId"));
				cus.setCustomerName(request.getParameter("cname"));
				cus.setPassword(request.getParameter("cpassword"));
				cus.setAddress(request.getParameter("addr"));
				cus.setCity(request.getParameter("city"));
				cus.setPostalcode(request.getParameter("pcode"));
				cus.setSsn(request.getParameter("ssn"));
				CustomerServiceImpl.getInstance().registCustomer(cus);
			break;	
		default:
			break;
			
		}
	}
}
