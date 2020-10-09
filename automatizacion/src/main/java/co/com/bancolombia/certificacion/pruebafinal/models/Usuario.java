package co.com.bancolombia.certificacion.pruebafinal.models;

public class Usuario {
    private String email, password, password1;

    public Usuario(String email, String password, String passwrod1) {
        this.email = email;
        this.password = password;
        this.password1 = password1;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword1() {
        return password1;
    }
}
