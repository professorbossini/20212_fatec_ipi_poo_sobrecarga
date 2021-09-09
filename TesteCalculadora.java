import java.util.Scanner;
public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        String menu = "1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n0-Sair\n";
        int opcao;
        Calculadora calc = new Calculadora();
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            System.out.println ("Digite o primeiro operando");
            int x = leitor.nextInt();
            System.out.println("Digite o segundo operando");
            int y = leitor.nextInt();
            int res = 0;
            switch (opcao){
                case 1:
                    res = calc.soma(x, y);
                    break;
                case 2:
                    res = calc.subtracao(x, y);
                    break;
                case 3:
                    res = calc.multiplicacao(x, y);
                    break;
                case 4:
                    res = calc.divisao(x, y);
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
                case 0:
                    System.out.println("Até logo");
                    return;
            }
            System.out.printf("Res: %d\n", res);

        }while (opcao != 0);
        leitor.close();
    }

}
