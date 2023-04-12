import java.util.ArrayList;

class Grupo {
   // Atributos
   private String nomGrupo;
   private ArrayList<Alumno> alumnos;
   
   // Constructor
   public Grupo(String nomGrupo) {
      this.nomGrupo = nomGrupo;
      alumnos = new ArrayList<>();
   }
   
   // Métodos
   public String toString() {
      return "Grupo[nomGrupo = " + nomGrupo + ", alumnos = " + alumnos + "]";
   }
   
   public void addAlumno(Alumno a) {
      alumnos.add(a);
   }
}