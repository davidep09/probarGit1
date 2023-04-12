class Programa {
   public static void main(String[] args){
      Alumno a1 = new Alumno(1, "Pepe");
      System.out.println("Matrícula = " + a1.getNm());
      System.out.println("Nombre = " + a1.getNombre());
      System.out.println(a1);
      Grupo g1 = new Grupo("1DWN");
   }
}