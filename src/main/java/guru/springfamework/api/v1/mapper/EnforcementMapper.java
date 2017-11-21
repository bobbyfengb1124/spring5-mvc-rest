/**
 * author: Feng Bo
 *
 * date: Nov 21, 2017
 */
package guru.springfamework.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import guru.springfamework.domain.EnfEbosEnforcementRecord;
import guru.springfamework.domain.EnfEnforcementRecord;

@Mapper
public interface EnforcementMapper {
	EnforcementMapper INSTANCE = Mappers.getMapper(EnforcementMapper.class);
	
	EnfEbosEnforcementRecord enfToEbosEnf(EnfEnforcementRecord enforcement);
}
