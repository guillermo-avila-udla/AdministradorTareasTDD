import java.util.List;
import java.util.ArrayList;

public class GestorTareas {

  private List<Tarea> tareas = new ArrayList<Tarea>();

  public void agregarTarea(Tarea tarea1) {
    this.tareas.add(tarea1);
  }

  public Integer obtenerTotalTareas() {
    return tareas.size();
  }

}
