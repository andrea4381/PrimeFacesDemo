/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author andrea
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Leo {
	@Id
	private String id = UUID.randomUUID().toString();
	private String nome;
	private String cognome;
}
