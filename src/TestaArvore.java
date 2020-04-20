import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class TestaArvore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = -1;

        Arvore KnyQ = new Arvore();
        KnyQ.conteudo();

        do {
            System.out.println("\n==RESPOSTA==");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            System.out.println("0- Sair");
            System.out.println("==DIGITE UMA OPÇÃO==");
            op = in.nextInt();

            switch (op){
                case 1:
                    KnyQ.sim();
                    break;
                case 2:
                    KnyQ.nao();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
            }

            KnyQ.conteudo();
            if (KnyQ.possuiPersonagem()){
                op = 0;
            }
        } while(op != 0);

    }
}
