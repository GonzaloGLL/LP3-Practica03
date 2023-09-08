import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dia (1-31): ");
        dia = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        mes = scanner.nextInt();
        System.out.print("Ingrese el año (1900-2050): ");
        anio = scanner.nextInt();
        valida();
    }

    
    public boolean bisiesto() {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }

    
    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    
    private void valida() {
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diasMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }

    
    public void corta() {
        System.out.printf("%02d-%02d-%04d\n", dia, mes, anio);
    }

    
    public long diasTranscurridos() {
        long dias = 0;
        for (int i = 1900; i < anio; i++) {
            dias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            dias += diasMes(i);
        }
        dias += dia - 1;
        return dias;
    }

    
    public int diaSemana() {
        long diasTranscurridos = diasTranscurridos();
        return (int) ((diasTranscurridos + 1) % 7);
    }

    
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        fecha.leer();
        fecha.corta();
        System.out.println("Dias transcurridos: " + fecha.diasTranscurridos());
        System.out.println("Dia de la semana: " + fecha.diaSemana());
    }
}
