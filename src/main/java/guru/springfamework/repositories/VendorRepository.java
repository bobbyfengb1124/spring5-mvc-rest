/**
 * author: Feng Bo
 *
 * date: Nov 25, 2017
 */
package guru.springfamework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springfamework.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long>{

}
