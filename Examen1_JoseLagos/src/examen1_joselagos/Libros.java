package examen1_joselagos;

/**
 *
 * @author Tony
 */
public class Libros {
    private String autor, titulo, genero, editorial, idioma, estado, nombrepersona, ISBN;
    private int cuenta, año_entrada, año_creacion;

    public Libros() {
    }

    public Libros(String autor, String titulo, String genero, String editorial, String idioma, String estado, String nombrepersona, String ISBN, int cuenta, int año_entrada, int año_creacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.estado = estado;
        this.nombrepersona = nombrepersona;
        this.ISBN = ISBN;
        this.cuenta = cuenta;
        this.año_entrada = año_entrada;
        this.año_creacion = año_creacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombrepersona() {
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAño_entrada() {
        return año_entrada;
    }

    public void setAño_entrada(int año_entrada) {
        this.año_entrada = año_entrada;
    }

    public int getAño_creacion() {
        return año_creacion;
    }

    public void setAño_creacion(int año_creacion) {
        this.año_creacion = año_creacion;
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", estado=" + estado + ", nombrepersona=" + nombrepersona + ", ISBN=" + ISBN + ", cuenta=" + cuenta + ", a\u00f1o_entrada=" + año_entrada + ", a\u00f1o_creacion=" + año_creacion + '}';
    }
    
    
}
