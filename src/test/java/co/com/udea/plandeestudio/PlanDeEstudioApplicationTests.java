package co.com.udea.plandeestudio;


import co.com.udea.plandeestudio.domain.model.Departamento;
import co.com.udea.plandeestudio.domain.model.Mensaje;
import co.com.udea.plandeestudio.domain.service.departamento.DepartamentoService;
import co.com.udea.plandeestudio.web.controller.departamento.DepartamentoRest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class PlanDeEstudioApplicationTests {

	@Mock
	private DepartamentoService servicioMock;

	private DepartamentoRest departamentoRest;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		departamentoRest = new DepartamentoRest(servicioMock);
	}

	@Test
	void getDepartamento_DebeRetornarDepartamentoExistente() {
		int codigo = 1;
		Departamento departamento = new Departamento();
		when(servicioMock.getDepartamentoByCodigo(codigo)).thenReturn(departamento);

		ResponseEntity<Departamento> respuesta = departamentoRest.getDepartamento(codigo);

		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
		assertEquals(departamento, respuesta.getBody());
		verify(servicioMock, times(1)).getDepartamentoByCodigo(codigo);
	}

	@Test
	void getDepartamentos_DebeRetornarListaDeDepartamentos() {
		List<Departamento> departamentos = new ArrayList<>();
		departamentos.add(new Departamento());
		when(servicioMock.getAllDepartamentos()).thenReturn(departamentos);

		ResponseEntity<List<Departamento>> respuesta = departamentoRest.getDepartamentos();

		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
		assertEquals(departamentos, respuesta.getBody());
		verify(servicioMock, times(1)).getAllDepartamentos();
	}

	@Test
	void saveDepartamento_DebeRetornarDepartamentoGuardado() {
		Departamento departamento = new Departamento();
		when(servicioMock.saveDepartameto(departamento)).thenReturn(departamento);

		ResponseEntity<Departamento> respuesta = departamentoRest.saveDepartamento(departamento);

		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
		assertEquals(departamento, respuesta.getBody());
		verify(servicioMock, times(1)).saveDepartameto(departamento);
	}

	@Test
	void updateDepartamento_DebeRetornarDepartamentoActualizado() {
		Departamento departamento = new Departamento();
		when(servicioMock.updateDepartamento(departamento)).thenReturn(departamento);

		ResponseEntity<Departamento> respuesta = departamentoRest.updateDepartamento(departamento);

		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
		assertEquals(departamento, respuesta.getBody());
		verify(servicioMock, times(1)).updateDepartamento(departamento);
	}

	@Test
	void deleteDepartamento_DebeEliminarDepartamentoYRetornarMensaje() {
		int codigo = 1;

		ResponseEntity<Mensaje> respuesta = departamentoRest.deleteDepartamento(codigo);
		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
		assertEquals("Departamento eliminado eliminada", respuesta.getBody().getMensaje());
		verify(servicioMock, times(1)).deleteDepartamento(codigo);
	}
	@Test
	void contextLoads() {
	}

}
