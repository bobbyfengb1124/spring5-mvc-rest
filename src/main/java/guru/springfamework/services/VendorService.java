/**
 * author: Feng Bo
 *
 * date: Nov 25, 2017
 */
package guru.springfamework.services;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.api.v1.model.VendorListDTO;

public interface VendorService {

	VendorListDTO getAllVendors();

	VendorDTO getVendorById(long id);

	VendorDTO createNewVendor(VendorDTO vendorDTO);

	VendorDTO saveVendorByDTO(long id, VendorDTO vendorDTO);

	void deleteVendorById(long id);

	VendorDTO patchVendor(long id1, VendorDTO vendorDTO);

}
