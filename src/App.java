import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // pra especificar no java a barra invertida é necessário duas barras
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {// vai retonar true enquanto não chegar no fim do arquivo
                System.out.println(sc.nextLine());

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { // finally executa mesmo se der certo ou errado
            if (sc != null) { // para evitar a nullPointerException
                sc.close();// sempre fechar o scanner para não vazar dados da memória
            }
        }

    }
}
