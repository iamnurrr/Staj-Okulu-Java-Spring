package com.example.stajcell.balance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<BalanceUnit, Long> {

    BalanceUnit findBalanceUnitByNumberIs(String number);

    //public interface BalanceRepository: Bu, BalanceRepository adında bir arayüz tanımlar.
    //extends JpaRepository<BalanceUnit, Long>: JpaRepository arayüzünü genişleterek BalanceUnit varlık
    // sınıfı ve Long tipi birincil anahtar ile bir JPA deposu arayüzü oluşturur.
    // BalanceUnit: Bu, JPA varlık sınıfını temsil eder. Veritabanında bir tabloya karşılık gelir.
    // Long: Bu, BalanceUnit varlığının birincil anahtarının türüdür.
    //JpaRepository

    //JpaRepository arayüzü, CRUD (Create, Read, Update, Delete) işlemlerini otomatik olarak sağlar.
    // Bu sayede, temel veritabanı işlemleri için ek kod yazmanıza gerek kalmaz.


}