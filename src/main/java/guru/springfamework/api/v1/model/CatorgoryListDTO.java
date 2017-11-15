/**
 * author: Feng Bo
 *
 * date: Nov 15, 2017
 */
package guru.springfamework.api.v1.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatorgoryListDTO {

	List<CategoryDTO> categories;
}
