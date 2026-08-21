package JSONLivro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;

public class Main {
    public static void main(String[] args) {
        String json = """
                {
                 titulo : "Alice no País das Maravilhas",
                 autor : "Lewis Carroll",
                 editora : {
                     nome : "Cia das Letras",
                     cidade : "São Paulo"
                }
                }
                """;


        Gson gson = new GsonBuilder()
                .setStrictness(Strictness.LENIENT)
                .create();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);

    }
}
