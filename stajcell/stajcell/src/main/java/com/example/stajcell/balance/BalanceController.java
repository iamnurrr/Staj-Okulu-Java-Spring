package com.example.stajcell.balance;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
@RequiredArgsConstructor
public class BalanceController {

    //BalanceController sınıfı, /balance yolundaki HTTP isteklerini işleyen bir REST kontrolcüsüdür.

    private final BalanceService balanceService;



    @PostMapping
    public String createBalance(@RequestParam String number, @RequestParam String kind, @RequestParam Double remainder) {
        balanceService.createBalance(number, kind, remainder);

        return "Process success!";
    }
    //createBalance metodu, HTTP POST isteklerini işleyerek yeni bir bakiye oluşturur.
    //@RequestParam: Bu anotasyon, HTTP isteğinden gelen parametreyi metod parametresine bağlar.

    @GetMapping
    public BalanceUnit getBalance(@RequestParam String number) {
        return balanceService.getBalances(number);
}
    //Bu metod, number adlı bir parametre alır ve belirli bir bakiye bilgisi döner.
    //@GetMapping: Bu anotasyon, HTTP GET isteklerini işleyen bir metod olduğunu belirtir.
    //getBalance metodu, HTTP GET isteklerini işleyerek belirli bir numaraya ait bakiye bilgisi döner.
    //balanceService adlı bir servis sınıfı, bu işlemlerin gerçekleştirilmesini sağlar.

}

