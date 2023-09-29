/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_10;
    import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class libro_10 {

    libro_10(String titulo, String autor, int anioPublicacion, boolean disponible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public class Libro {
    // Atributos libro_10
    private final String titulo;
    private final String autor;
    private final int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    // Métodos libro_10
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInformacion() {
        String mensaje = "Título: " + titulo +
                "\nAutor: " + autor +
                "\nAño de publicación: " + anioPublicacion +
                "\nDisponible: " + (disponible ? "Sí" : "No");
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
}
