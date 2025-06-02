import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorDeClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("clientes.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);
                Cliente c = new Cliente(nome, idade);
                clientes.add(c);
            }
            leitor.close();
            System.out.println("Clientes lidos:");
            for (Cliente c : clientes) {
                System.out.println(c.nome + " - " + c.idade + " anos");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de clientes.");
            e.printStackTrace();
        }
    }
}