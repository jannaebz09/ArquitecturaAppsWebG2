package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idClient;
    @Column(name = "fullName", nullable = false, length = 50)
    private String fullName;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @Column(name = "verficationExpert", nullable = false, length = 50)
    private String verificationExpert;
    public Client() {
    }

    public Client(int idClient, String fullName, String email, String password, String verificationExpert) {
        this.idClient = idClient;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.verificationExpert = verificationExpert;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationExpert() {
        return verificationExpert;
    }

    public void setVerificationExpert(String verificationExpert) {
        this.verificationExpert = verificationExpert;
    }
}

