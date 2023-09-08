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
