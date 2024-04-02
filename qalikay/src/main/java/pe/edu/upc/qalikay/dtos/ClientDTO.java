package pe.edu.upc.qalikay.dtos;

public class ClientDTO {
    private int idClient;
    private String fullName;
    private String email;
    private String password;
    private String verificationExpert;

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
