/**
 * author: Feng Bo
 *
 * date: Nov 17, 2017
 */
package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;
    private String customerUrl;
}
