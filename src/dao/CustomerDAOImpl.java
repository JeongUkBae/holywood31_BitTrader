package dao;

import java.util.List;

import domain.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {
		dao = CustomerDAOImpl.getInstance();	}
	public static CustomerDAOImpl getInstance() {return instance;}
	CustomerDAO dao;
	
	
	@Override
	public void insertCustomer(CustomerDTO cat) {
		// TODO Auto-generated method stub
		
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
	public boolean existsCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateCustomer(CustomerDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(CustomerDTO cat) {
		// TODO Auto-generated method stub
		
	}

}
