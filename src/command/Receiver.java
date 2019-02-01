package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Receiver {

	public static Command cmd = new Command();

	
	public static void init(
			HttpServletRequest request, HttpServletResponse responset){
		System.out.println("===== 2.리시버진입 =====");
		System.out.println("cmd::"+request.getParameter("cmd"));
	
		cmd = Commander.order(request,responset);
	}
}
