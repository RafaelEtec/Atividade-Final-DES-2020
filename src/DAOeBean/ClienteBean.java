package DAOeBean;

public class ClienteBean {
    private String id;
    private String nome;
    private String telres;
    private String telcom;
    private String telcel;
    private String email;
    
    public ClienteBean() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelres() {
        return telres;
    }

    public void setTelres(String telres) {
        this.telres = telres;
    }

    public String getTelcom() {
        return telcom;
    }

    public void setTelcom(String telcom) {
        this.telcom = telcom;
    }

    public String getTelcel() {
        return telcel;
    }

    public void setTelcel(String telcel) {
        this.telcel = telcel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}