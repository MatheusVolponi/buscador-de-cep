import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CepSearchEngine cepSearch = new CepSearchEngine();

        System.out.println("Digite um CEP para iniciar a busca:");
        var cep = read.nextLine();
        try {
            Address address = cepSearch.searchAddress(cep);
            System.out.println(address);
            FileGenerator generator = new FileGenerator();
            generator.jsonGenerator(address);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
