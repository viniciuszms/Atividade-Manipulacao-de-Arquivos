import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeitorSimples {
    public static void main(String[] args) {
        try {
            FileReader leitor = new FileReader("frase.txt");
            BufferedReader buffer = new BufferedReader(leitor);
            String linha;
            while ((linha = buffer.readLine()) != null) {
                System.out.println("Frase lida: " + linha);
            }
            buffer.close();
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
