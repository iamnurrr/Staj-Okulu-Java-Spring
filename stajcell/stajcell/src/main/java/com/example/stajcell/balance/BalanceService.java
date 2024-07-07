package com.example.stajcell.balance;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@Service: Bu anotasyon, bu sınıfın bir Spring servis bileşeni olduğunu belirtir.
// Bu sınıf, iş mantığını ve servis katmanını temsil eder.

//@RequiredArgsConstructor: Bu anotasyon, final alanlar için bir kurucu metod oluşturur.
// Bu durumda, balanceRepository alanı için bir kurucu metod oluşturulur ve
// bu alan otomatik olarak bağımlılık enjeksiyonu ile doldurulur.

public class BalanceService {

    private final BalanceRepository balanceRepository;
//private final BalanceRepository balanceRepository;: BalanceRepository tipinde bir depo
// sınıfı alanı tanımlar. Bu alan, final olarak tanımlandığı için, bu alanı kullanmak için
// bir kurucu metod gereklidir ve @RequiredArgsConstructor bu kurucu metodu otomatik olarak oluşturur.

    public void createBalance(String number, String kind, Double remainder) {

        BalanceUnit balanceUnit = new BalanceUnit();
        balanceUnit.setNumber(number);
        balanceUnit.setKind(kind);
        balanceUnit.setRemainder(remainder);

        balanceRepository.save(balanceUnit);
    }
//public void createBalance(String number, String kind, Double remainder):
// Bu metod, number, kind ve remainder adlı üç parametre alır ve yeni bir BalanceUnit oluşturur.
//BalanceUnit balanceUnit = new BalanceUnit();: Yeni bir BalanceUnit nesnesi oluşturur.
//balanceUnit.setNumber(number);: number parametresini BalanceUnit nesnesinin number alanına atar.
//balanceUnit.setKind(kind);: kind parametresini BalanceUnit nesnesinin kind alanına atar.
//balanceUnit.setRemainder(remainder);: remainder parametresini BalanceUnit nesnesinin
// remainder alanına atar.
//balanceRepository.save(balanceUnit);: Yeni oluşturulan BalanceUnit nesnesini
// balanceRepository kullanarak veritabanına kaydeder.


    public BalanceUnit getBalances(String number) {
        return balanceRepository.findBalanceUnitByNumberIs(number);
//Bu metod, number adlı bir parametre alır ve bu numaraya karşılık gelen BalanceUnit nesnesini döner.
//balanceRepository kullanılarak belirtilen numaraya ait BalanceUnit nesnesi veritabanından bulunur ve döner.
}

}

