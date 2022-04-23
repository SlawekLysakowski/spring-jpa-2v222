package pl.edu.wszib.springjpa.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
@Entity
@Table
public class Adres {
  @Id
  private String ulica;
  private String kodPocztowy;
  private String miasto;
  private String kraj;
  @CreationTimestamp
  private Instant createdAt;
  @UpdateTimestamp
  private Instant updatedAt;

  public String getUlica() {
    return ulica;
  }

  public void setUlica(String ulica) {
    this.ulica = ulica;
  }

  public String getKodPocztowy() {
    return kodPocztowy;
  }

  public void setKodPocztowy(String kodPocztowy) {
    this.kodPocztowy = kodPocztowy;
  }

  public String getMiasto() {
    return miasto;
  }

  public void setMiasto(String miasto) {
    this.miasto = miasto;
  }

  public String getKraj() {
    return kraj;
  }

  public void setKraj(String kraj) {
    this.kraj = kraj;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
