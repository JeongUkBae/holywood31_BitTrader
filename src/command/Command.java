package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	
	public Command(HttpServletRequest request, 
			HttpServletResponse responset) {
		setRequest(request);
		execute();
	}
	public Command() {}
	
	@Override
	public void execute() {
		
 		System.out.println("===== 5.뷰 셋팅  =====");
		System.out.println("cmd::"+request.getParameter("cmd"));
		

		setAction(request.getParameter("cmd"));
		setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		setPage(request.getParameter("page"));
		
		
		this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
	
	}

	
	
}
