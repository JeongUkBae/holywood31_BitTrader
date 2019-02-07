package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaceFactory;

public class CustomerDAOImpl implements CustomerDAO {
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {
		dao = CustomerDAOImpl.getInstance();	}
	public static CustomerDAOImpl getInstance() {return instance;}
	CustomerDAO dao;
	
	/*
	 * customerID, customerName, password, address, city, postalcode, ssn;
	 */
	@Override
	public void insertCustomer(CustomerDTO cus) {
		System.out.println("===CustomerDAO Impl 입장 ====");
		try {
			String sql = String.format(CustomerSQL.SIGNUP.toString());
			System.out.println("slq::::"+sql);
			Connection conn = DatabaceFactory
					.createDatabase(Vendor.ORACLE).getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getCustomerName());
			ps.setString(3, cus.getPassword());
			ps.setString(4, cus.getAddress());
			ps.setString(5, cus.getCity());
			ps.setString(6, cus.getPostalcode());
			ps.setString(7, cus.getSsn());
			
			int rs = ps.executeUpdate();
			System.out.println((rs==1)?"입력성공":"입력실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<CustomerDTO> selectAllCustomersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsCustomer(CustomerDTO cus) {
		boolean ok = false;
		try {
		
			PreparedStatement ps = DatabaceFactory
					.createDatabase(Vendor.ORACLE)
					.getConnection().prepareStatement(CustomerSQL.SIGNIN.toString());
			System.out.println("sql??:::"+CustomerSQL.SIGNIN.toString());
			System.out.println("id:"+cus.getCustomerID());
			System.out.println("ps:"+cus.getPassword());
			
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getPassword());
			ResultSet rs = ps.executeQuery();
			System.out.println("rs:::"+rs);
			if(rs.next()) {ok = true;}
			System.out.println("==existsCustomerDAO!!!!===");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok??::"+ok);
		return ok;
	}

	@Override
	public void updateCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

}
