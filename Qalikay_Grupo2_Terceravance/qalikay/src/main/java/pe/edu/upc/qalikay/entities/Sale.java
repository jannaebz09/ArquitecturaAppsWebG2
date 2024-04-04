package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Sale")
public class Sale{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSale;
    @Column(name="idProduct", nullable = false)
    private int idProduct;
    @Column(name="saleDate", nullable = false, length = 10)
    private LocalDate saleDate;
    @Column(name="amount", nullable = false)
    private int amount;

    public Sale() {
    }

    public Sale(int idSale, int idProduct, LocalDate saleDate, int amount) {
        this.idSale = idSale;
        this.idProduct = idProduct;
        this.saleDate = saleDate;
        this.amount = amount;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
