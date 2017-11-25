/**
 * author: Feng Bo
 *
 * date: Nov 25, 2017
 */
package guru.springfamework.api.v1.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;


public class VendorMapperTest {
	
	public static final String NAME = "someName";
	
	VendorMapper vendorMapper = VendorMapper.INSTANCE;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void vendorToVendorDTO() throws Exception {
        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        //then
        assertEquals(vendor.getName(), vendorDTO.getName());
    }
	
	@Test
    public void vendorDTOtoVendor() throws Exception {
        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        //when
        Vendor vendor = vendorMapper.vendorDTOtoVendor(vendorDTO);

        //then
        assertEquals(vendorDTO.getName(), vendor.getName());
    }


}
