import java.util.ArrayList;
import java.util.List;

class Rectangulo {
    private double base;
    private double altura;
    private String color;
    private static String[] colores = {"verde", "amarillo", "rojo"};
    private static int ultimoColorIndex = -1;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.color = asignarColor();
    }

    private String asignarColor() {
        ultimoColorIndex = (ultimoColorIndex + 1) % colores.length;
        return colores[ultimoColorIndex];
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void moverEnX(double puntos) {
        // Agregar código para mover en el eje X
    }

    public void moverEnY(double puntos) {
        // Agregar código para mover en el eje Y
    }

    @Override
    public String toString() {
        return String.format("Rectángulo (Base: %.2f, Altura: %.2f, Color: %s)", base, altura, color);
    }
}

class Manejador {
    public static double calcularArea(Rectangulo rectangulo) {
        return rectangulo.calcularArea();
    }

    public static double calcularPerimetro(Rectangulo rectangulo) {
        return rectangulo.calcularPerimetro();
    }

    public static void moverEnX(Rectangulo rectangulo, double puntos) {
        rectangulo.moverEnX(puntos);
    }

    public static void moverEnY(Rectangulo rectangulo, double puntos) {
        rectangulo.moverEnY(puntos);
    }
}

public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 4);
        Rectangulo rectangulo2 = new Rectangulo(3, 6);
        Rectangulo rectangulo3 = new Rectangulo(7, 2);

        System.out.println("Rectángulo 1:");
        System.out.println(rectangulo1);
        System.out.println("Rectángulo 2:");
        System.out.println(rectangulo2);
        System.out.println("Rectángulo 3:");
        System.out.println(rectangulo3);

        double areaRectangulo1 = Manejador.calcularArea(rectangulo1);
        double perimetroRectangulo2 = Manejador.calcularPerimetro(rectangulo2);

        System.out.println("Área de Rectángulo 1: " + areaRectangulo1);
        System.out.println("Perímetro de Rectángulo 2: " + perimetroRectangulo2);

        Manejador.moverEnX(rectangulo1, 2);
        Manejador.moverEnY(rectangulo2, -3);

        System.out.println("Rectángulo 1 después de moverlo:");
        System.out.println(rectangulo1);
        System.out.println("Rectángulo 2 después de moverlo:");
        System.out.println(rectangulo2);
    }
}
