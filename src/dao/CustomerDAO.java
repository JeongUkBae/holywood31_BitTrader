package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO cat);
	
	public List<CustomerDTO> selectAllCustomersList();
	public List<CustomerDTO> selectCustomers(String searchWord);
	public CustomerDTO selectCustomer(String searchWord);
	public int countCustomer();
	public boolean existsCustomer(String searchWord);
	
	public void updateCustomer(CustomerDTO cat);
	public void deleteCustomer(CustomerDTO cat);
}
