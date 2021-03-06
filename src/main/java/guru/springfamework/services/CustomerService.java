/**
 * author: Feng Bo
 *
 * date: Nov 17, 2017
 */
package guru.springfamework.services;

import java.util.List;

import guru.springfamework.api.v1.model.CustomerDTO;

public interface CustomerService {

	List<CustomerDTO> getAllCustomers();

	CustomerDTO getCustomerById(Long id);

	CustomerDTO createNewCustomer(CustomerDTO customerDTO);

	CustomerDTO saveCustomerByDTO(long l, CustomerDTO customerDTO);
	
	CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);

	void deleteCustomerById(long id);

}
