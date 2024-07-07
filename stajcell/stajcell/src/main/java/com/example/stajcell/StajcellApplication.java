package com.example.stajcell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StajcellApplication {

	public static void main(String[] args) {
		SpringApplication.run(StajcellApplication.class, args);
	}

//package com.example.stajcell;: Bu, StajcellApplication sınıfının com.example.stajcell paketinde olduğunu belirtir.
//@SpringBootApplication: Bu anotasyon, bu sınıfın bir Spring Boot uygulaması olarak çalıştırılmasını sağlar.
// Arkasında birçok şey yapar: bileşen taramasını etkinleştirir, otomatik yapılandırmayı etkinleştirir
//public class StajcellApplication: StajcellApplication adlı bir sınıf tanımlar.
//StajcellApplication adlı bir sınıf tanımlar.
//public static void main(String[] args): Java'da standart bir ana metod tanımlaması.
//SpringApplication.run(StajcellApplication.class, args); satırı, Spring Boot uygulamasını başlatır.

}
