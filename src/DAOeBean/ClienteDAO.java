package DAOeBean;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    
    private Connection con;
    
    public ClienteDAO(Connection con) {
        this.con = con;
    }
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserirCliente(ClienteBean cliente) {
        String sql = "insert into tbcadclientes(nome,telres,telcom,telcel,email) values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelres());
            ps.setString(3, cliente.getTelcom());
            ps.setString(4, cliente.getTelcel());
            ps.setString(5, cliente.getEmail());
            
            if (ps.executeUpdate() > 0) {
                return "Usuário Cadastrado \n";
            } else {
                return "Erro ao cadastrar \n";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public List<ClienteBean> listarTodos() {
        String sql = "select * from tbcadclientes";
        List<ClienteBean> listaClientes = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    ClienteBean cb = new ClienteBean();
                    cb.setId(rs.getString(1));
                    cb.setNome(rs.getString(2));
                    cb.setTelres(rs.getString(3));
                    cb.setTelcom(rs.getString(4));
                    cb.setTelcel(rs.getString(5));
                    cb.setEmail(rs.getString(6));
                    
                    listaClientes.add(cb);
                }
                return listaClientes;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public String excluirCliente(ClienteBean cliente) {
        String sql = "delete from tbcadclientes where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, cliente.getId());
            
            if (ps.executeUpdate() > 0) {
                return "Cliente Excluído \n";
            } else {
                return "Erro na Exclusão \n";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String alterarCliente(ClienteBean cliente) {
        String sql = "update tbcadclientes set nome = ?, telres = ?, telcom = ?, telcel = ?, email = ? where id = ?";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelres());
            ps.setString(3, cliente.getTelcom());
            ps.setString(4, cliente.getTelcel());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getId());
            
            if (ps.executeUpdate() > 0) {
                return "Informações do Cliente Alteradas \n";
            } else {
                return "Erro na Alteração \n";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String TeleRes(String id) {
        String sql = "select telres from tbcadclientes where id = ?";
    
        String teleRes = "";
        ResultSet rs = null;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, id);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                teleRes = rs.getString("telres");
            }
            return teleRes;
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String TeleCom(String id) {
        String sql = "select telcom from tbcadclientes where id = ?";
    
        String teleCom = "";
        ResultSet rs = null;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, id);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                teleCom = rs.getString("telcom");
            }
            return teleCom;
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String TeleCel(String id) {
        String sql = "select telcel from tbcadclientes where id = ?";
    
        String teleCel = "";
        ResultSet rs = null;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, id);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                teleCel = rs.getString("telcel");
            }
            return teleCel;
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
}
