class Alumno {

   // Atributos
   private int nm;
   private String nombre;
   
   // Constructor
   public Alumno(int nm, String nombre) {
      this.nm = nm;
      this.nombre = nombre;
   }
   
   // Métodos
   public int getNm() {
      return nm;
   }
   
   public String getNombre() {
      return nombre;
   }
   
   public String toString() {
      return "Alumno[nm = " + nm + ", nombre = " + nombre + "]";
   }
}