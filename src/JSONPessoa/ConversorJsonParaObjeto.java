package JSONPessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

public class ConversorJsonParaObjeto {
    public static void main(String[] args) {
        String json = """
                {
                "nome" : "John Smith",                
                 "cidade": "Recife" ,
                 "profissao": Dev               
                }
                """;



        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}
