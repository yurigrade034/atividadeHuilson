
import java.util.Scanner;
public class atividadeUm {

    public static void main(String[] args) {

        String nome;

        System.out.println("-----------> Leitor de Nome <-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome");
        nome = sc.nextLine();
        System.out.println("Bem vindo Fulaninho!");
        System.out.println("Bem vindo " + nome + "!");
        sc.close();

    }
}


//nao entendi se era pra manter o fulaninho ou substuir o nome, deixei os dois tipos ai
//ou apaga linha 13 ou a 14 depende do que vc quiser