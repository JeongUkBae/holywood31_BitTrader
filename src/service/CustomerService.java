package service;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerService {
	public void registCustomer(CustomerDTO cus);
	
	public List<CustomerDTO> bringAllCustomersList();
	public List<CustomerDTO> retrieveCustomers(String searchWord);
	public CustomerDTO retrieveCustomer(String searchWord);
	public int countCustomer();
	public boolean existsCustomer(CustomerDTO cus);
	
	public void modifyCustomer(CustomerDTO cus);
	public void removeCustomer(CustomerDTO cus);
}
