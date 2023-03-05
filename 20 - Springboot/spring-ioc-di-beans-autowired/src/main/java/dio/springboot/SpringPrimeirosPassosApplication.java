package dio.springboot;

import com.google.gson.Gson;
import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-000\",\"logradouro\": \"PraÃ§a da SÃ©\",\"localidade\": \"SÃ£o Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }
}
