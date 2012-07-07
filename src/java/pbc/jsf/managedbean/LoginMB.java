package pbc.jsf.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import pbc.jsf.modelo.Usuario;

@ManagedBean
public class LoginMB {
  private Usuario usuario = new Usuario();

  public String doEfetuarLogin() {
    if("sakurai".equals(usuario.getLogin())
            && "123".equals(usuario.getSenha()))
      return "principal";
    else {
      FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
      FacesContext.getCurrentInstance().addMessage("erro", msg);
      return null;
    }
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}

