public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro("paramont", "tprres", 450, "91212"); // Usa constructor por defecto
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez",432, "978-8437604947");
        
        libro1.mostrarInfo();
        
        libro2.setNumeroPaginas(450); // Modifica un atributo
        
        libro2.mostrarInfo();//Aca imprime la informacion depsues de modificarla
        
        
        System.out.println("Libros creados: " + Libro.getTotalLibros()); //
        
        
        //Codigo a borrar
        //libro2.mostrarInfo(); //Aca imprime la informacion antes de la modificacion
        //System.out.println("\nEl título del libro2 es: " + libro2.getTitulo());
        // System.out.println(libro2.getNumeroPaginas());
        

    }
}
