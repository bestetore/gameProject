package myGameProject.kodlamaio.adapters;



import myGameProject.kodlamaio.abstracts.CustomerCheckService;
import myGameProject.kodlamaio.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result= kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthYear());
			
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		
		
		return result;
	}
	

}
