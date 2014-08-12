package com.freepay.aplicacion;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.springframework.stereotype.Controller;


@Controller("PruebaBean") 
@ManagedBean(name = "PruebaBean")
@ViewScoped
public class PruebaBean {
		
	 public void mostrarMensaje(ActionEvent actionEvent) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje informativo ", "FreePay ha sido desarrollado correctamente!!!"));
	 }

}
