import java.util.ArrayList;

 public class Biblioteca {
    private ArrayList<Libro> Libros;

    public Biblioteca(){
        this.Libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){

        Libros.add(libro);
    }

    public void mostrar(){
        if(Libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        } else {
            for(Libro i: Libros){
                System.out.println(i);
            }
        }
    }



}
