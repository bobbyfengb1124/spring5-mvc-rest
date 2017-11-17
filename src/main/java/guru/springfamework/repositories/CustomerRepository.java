/**
 * author: Feng Bo
 *
 * date: Nov 17, 2017
 */
package guru.springfamework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springfamework.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
