import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GestorTareasTest {

  @Test
  public void testAgregarTarea() {

    GestorTareas gestor = new GestorTareas();

    Tarea tarea1 = new Tarea();
    Tarea tarea2 = new Tarea();

    tarea1.setTitulo("Tarea uno 1");
    tarea2.setTitulo("Tarea uno 2");

    gestor.agregarTarea(tarea1);
    //gestor.agregarTarea(tarea2);

    assertEquals(2, gestor.obtenerTotalTareas(), "Deberia tener 2 tarea");

  }
}