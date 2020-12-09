package DAOeBean;

public class EmpresaBean {
    private int codigoemp;
    private String nomeemp;
    private String cnpj;
    private String razsocial;

    public EmpresaBean() {
        
    }
    
    public int getCodigoemp() {
        return codigoemp;
    }

    public void setCodigoemp(int codigoemp) {
        this.codigoemp = codigoemp;
    }

    public String getNomeemp() {
        return nomeemp;
    }

    public void setNomeemp(String nomeemp) {
        this.nomeemp = nomeemp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazsocial() {
        return razsocial;
    }

    public void setRazsocial(String razsocial) {
        this.razsocial = razsocial;
    }
}