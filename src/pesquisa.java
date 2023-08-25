import java.util.Scanner;

public class pesquisa {

    static Scanner teclado = new Scanner(System.in);
    static int pesquisa[] = new int[20];
    static int total[] = new int[5];

    public static void inserirVoto() {
        System.out.println("Avaliação da cantina! Avalie numa escala entre 1 (péssimo) e 5 (excelente).");
        for (int i = 0; i < pesquisa.length; i++) {
            int voto = 0;
            while (voto < 1 || voto > 5) {
                System.out.print((i+1) + "º voto: ");
                voto = teclado.nextInt();
                if (voto < 1 || voto > 5){
                    System.out.println("Voto inválido!");
                } else{
                    total[(voto-1)]++;
                }
            }
            pesquisa[i] = voto;
        }
    }

    public static void mostrarVotos(){
        System.out.println("Mostrar votos:");
        for (int i = 0; i < pesquisa.length; i++){
            System.out.println("Voto "+(i+1)+" = "+pesquisa[i]);
        }
    }

    public static void mostrarMedia(){
        double soma = 0;
        for (int i = 0; i < pesquisa.length; i++){
            soma = soma + pesquisa[i];
        }
        System.out.println("Média dos votos: "+soma/ pesquisa.length);
    }

    public static void mostrarTotais(){
        for (int i = 0; i<total.length; i++){
            System.out.println(total[i]+" votantes votaram "+(i+1));
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n1 - Inserir votos");
            System.out.println("2 - Mostrar votos");
            System.out.println("3 - Mostrar média");
            System.out.println("4 - Mostrar totais");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    inserirVoto();
                    break;
                case 2:
                    mostrarVotos();
                    break;
                case 3:
                    mostrarMedia();
                    break;
                case 4:
                    mostrarTotais();
                    break;
                case 9:
                    System.out.println("Fim");
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }
    }
}
