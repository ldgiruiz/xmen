package co.com.mutantes.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import co.com.mutantes.util.*;


@Entity
public class mutantes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_mutantes;

	@Column
	private String[] Dna;

	@Column
	private boolean is_mutant;

	public int getId_mutantes() {
		return id_mutantes;
	}

	public void setId_mutantes(int id_mutantes) {
		this.id_mutantes = id_mutantes;
	}

	public String[] getDna() {
		return Dna;
	}

	public void setDna(String[] dna) {
		Dna = dna;
	}

	public boolean isIs_mutant() {
		return is_mutant = ismutant.isMutant(Dna);
	}

	public void setIs_mutant(boolean is_mutant) {
		this.is_mutant = ismutant.isMutant(Dna);
	}



	

}
