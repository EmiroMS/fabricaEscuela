package co.com.udea.plandeestudio.domain.input;

import co.com.udea.plandeestudio.domain.model.UnidadAcademica;

import java.util.List;

public interface InputPortUnidadAcademica {

    UnidadAcademica getUnidadAcademicaByCodigo(String codigo);
    List<UnidadAcademica> getUnidadesAcademicas();
    UnidadAcademica saveUnidadAcademica(UnidadAcademica unidadAcademica);
    boolean deleteUnidadAcademica(String codigo);
    UnidadAcademica updateUnidadAcademica(UnidadAcademica unidadAcademica);
}
