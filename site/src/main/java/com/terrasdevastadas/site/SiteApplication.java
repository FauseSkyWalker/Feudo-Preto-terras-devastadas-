package com.terrasdevastadas.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/*
 * A anotação @SpringBootApplicationannotation é utilizada para informar 
 * ao programa que essa é uma classe de configuração. Ela é utilizada apenas no arquivo main()
 * do projeto, ou seja, o arquiva que inicia o projeto. Além disso, também seta algumas
 * auto-configurações do spring. Basicamente avisa: "Ei, isso é um programa do spring boot".
 */

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class }) // utilizei esse parametro exclude para que o spring não utilizasse uma auto-configuração de segurança.
public class SiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

}
