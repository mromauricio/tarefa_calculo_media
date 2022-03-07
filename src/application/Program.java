package application;

public class Program {
    public static void main(String[] args) {
        double notaA = Double.parseDouble(args[0]);
        double notaB = Double.parseDouble(args[1]);
        double notaC = Double.parseDouble(args[2]);
        double notaD = Double.parseDouble(args[3]);
        double sum = 0.0;
        for (int i =0; i < args.length; i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("A média dos valores de entrada é: " + sum / args.length);

    }
}
