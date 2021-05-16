package myGameProject.kodlamaio.concretes;

import myGameProject.kodlamaio.abstracts.CustomerCheckService;
import myGameProject.kodlamaio.abstracts.CustomerService;
import myGameProject.kodlamaio.entities.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	
	public CustomerManager() {}
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	
	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Kullanıcı eklendi: " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Kullanıcı doğrulanamadı");
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanıcı bilgileri güncellendi: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanıcı silindi: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
