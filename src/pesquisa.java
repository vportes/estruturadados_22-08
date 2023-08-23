import java.util.Scanner;

public class pesquisa {

    static Scanner teclado = new Scanner(System.in);
    static int pesquisa[] = new int[20];
    public static int total1, total2, total3, total4, total5;

    public static void inserirVoto() {
        total1 = total2 = total3 = total4 = total5 = 0;
        System.out.println("Avaliação da cantina! Avalie numa escala entre 1 (péssimo) e 5 (excelente).");
        for (int i = 0; i < pesquisa.length; i++) {
            int voto = 0;
            while (voto < 1 || voto > 5) {
                System.out.print((i+1) + "º voto: ");
                voto = teclado.nextInt();
                if (voto < 1 || voto > 5){
                    System.out.println("Voto inválido!");
                } else{
                    switch (voto){
                        case 1:
                            total1++;
                            break;
                        case 2:
                            total2++;
                            break;
                        case 3:
                            total3++;
                            break;
                        case 4:
                            total4++;
                            break;
                        case 5:
                            total5++;
                            break;
                    }
                }
            }
            pesquisa[i] = voto;
        }
    }

    public static void mostrarVotos(){
        System.out.println("Mostrar votos:");
        for (int i = 0; i < pesquisa.length; i++){
            System.out.print(pesquisa[i]+" ");
        }
    }

    public static void mostrarMedia(){
        double soma = 0;
        for (int i = 0; i < pesquisa.length; i++){
            soma = soma + pesquisa[i];
        }
        System.out.println("Média dos votos: "+soma/ pesquisa.length);
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n1 - Inserir votos");
            System.out.println("2 - Mostrar votos");
            System.out.println("3 - Mostrar média");
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
                case 9:
                    System.out.println("Fim");
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }
    }
}