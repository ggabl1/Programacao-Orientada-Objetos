import java.util.*;

public class Program {
    private static final int quantidadeDePerguntas = 3;
    private static final String respostas[] = new String[quantidadeDePerguntas];
    private static final String gabarito[] = new String[quantidadeDePerguntas];
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeRecebido = receberNome();
        start(nomeRecebido);
        primeiraPergunta(nomeRecebido);
        apresentarResultado(nomeRecebido);
    }

    public static String receberNome() {
        System.out.println("Digite seu nome");
        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "Nao escreveu nada";
        }
        nome = nome.trim();
        String[] nomeInteiro = nome.split(" ");
        String primeiroNome = nomeInteiro[0];
        String primeiraLetra = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetra.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void start(String nomeRecebido) {
        System.out.println(String.format("""
                Saudaçoes!! O jogo é de adivinhação, então vai fazer perguntas e você vai responder.
                Aperte enter para começar
                """, nomeRecebido));
        SCAN.nextLine();
    }

    public static void primeiraPergunta(String nome) {
        String resposta = "";
        do {
            System.out.println(
                    """
                            1 - Qual desses jogos tem como tema principal sibrevivencia?
                            A) The forest
                            B) League of Legends
                            C) The Witcher 3: Wild Hunt
                            """);
            resposta = SCAN.nextLine();
        } while (!respostaValida(resposta));
        gabarito[0] = "A";
        respostas[0] = resposta;
    }

    public static boolean respostaValida(String resposta) {
        if (resposta.isBlank()) {
            System.out.println("resposta inválida, tente novamente");
            return false;
        }
        return true;
    }

    public static void apresentarResultado(String nomerecebido) {
        System.out.println("veja as perguntas que voce acertou "+ nomerecebido);
        for (int i = 0; i < quantidadeDePerguntas; i++) {
            System.out.println(String.format(
                    "%s - %s",
                    (i + 1),
                    gabarito[i].equalsIgnoreCase(respostas[i]) ? "acertou" : "errou"));
        }
    }

    public static void agradecer(String nomeRecebido) {
        System.out.println("Agradecemos por jogar"+nomeRecebido);
    }
}