package com.example.stajcell.balance;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //database de bir tabloya denk geliyor.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BalanceUnit {
    @Id
    @GeneratedValue
    private Long id; //primary key
    private String number;

    private String kind;

    private Double remainder;


    //@Entity: Bu anotasyon, BalanceUnit sınıfının bir JPA varlığı olduğunu belirtir ve veritabanında
    // bir tabloya karşılık gelir.
    //@Getter: Lombok, bu sınıftaki tüm alanlar için getter metodlarını otomatik olarak oluşturur.
    //@Setter: Lombok, bu sınıftaki tüm alanlar için setter metodlarını otomatik olarak oluşturur.
    //@NoArgsConstructor: Lombok, parametresiz bir kurucu metod oluşturur.
    //@AllArgsConstructor: Lombok, tüm alanları içeren bir kurucu metod oluşturur.
    //@Id: id alanının birincil anahtar olduğunu belirtir.
    //@GeneratedValue: id alanının değerinin otomatik olarak oluşturulmasını sağlar.



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getRemainder() {
        return remainder;
    }

    public void setRemainder(Double remainder) {
        this.remainder = remainder;
    }


}