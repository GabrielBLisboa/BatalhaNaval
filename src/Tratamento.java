import java.util.Arrays;

public class Tratamento {
    static String[] naoVazio = {"N", "-", "*"};

    public static void erroDeEntrada() {
        System.out.println("Coordenada Inv�lida");
        Entrada.leCoordenada();
    }

    public static boolean mesmoLugar(int linha, int coluna) {
        return Arrays.asList(naoVazio).contains(Defesa.jogada[linha][coluna]);
    }
}
