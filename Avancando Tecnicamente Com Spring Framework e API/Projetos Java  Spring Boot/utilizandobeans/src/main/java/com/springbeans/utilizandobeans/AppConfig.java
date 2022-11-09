package com.springbeans.utilizandobeans;

import org.apache.logging.log4j.util.ProviderUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }
    //<bean id="Livro" class="com.springbeans.Livro"/>

    @Bean
    public AutorLivro geAutorLivro(){
        return new Autor();
    }
    
}
