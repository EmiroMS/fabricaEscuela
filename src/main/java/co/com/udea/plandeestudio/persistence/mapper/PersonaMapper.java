package co.com.udea.plandeestudio.persistence.mapper;

import co.com.udea.plandeestudio.domain.model.Persona;
import co.com.udea.plandeestudio.persistence.entity.PersonaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    Persona toPersona(PersonaEntity personaEntity);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    PersonaEntity toPersonaEntity(Persona persona);
}
