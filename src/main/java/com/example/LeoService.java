/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author andrea
 */
@Named
@ManagedBean
public class LeoService {
	private final LeoRepository leos;
	private String nome;
	
	@Inject
	public LeoService(LeoRepository leos) {
		this.nome = "Ciccione";
		this.leos = leos;
	}
	
	public void setNome(String nome) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Nome cambiato", "Nome: " + nome);
        FacesContext.getCurrentInstance().addMessage(null, msg);
		Leo leo = new Leo();
		leo.setNome(nome);
		leo.setCognome(nome + UUID.randomUUID().toString());
		leo = this.leos.save(leo);
		this.nome = leo.getId();
	}
	
	public String getNome() {
		return this.leos.findAllNames().stream()
				.collect(Collectors.joining("\n"));
	}
	
}
