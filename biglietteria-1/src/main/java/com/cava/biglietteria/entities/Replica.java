package com.cava.biglietteria.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "repliche")
public class Replica {

	@Id
	@GeneratedValue
	private long cod_replica;

	@ManyToOne
	@JoinColumn(name = "cod_spettacolo")
	private Spettacolo spettacolo;

	@Column(name = "data_replica")
	private LocalDate yourDate;

	public long getCod_replica() {
		return cod_replica;
	}

	public void setCod_replica(long cod_replica) {
		this.cod_replica = cod_replica;
	}

	public Spettacolo getSpettacolo() {
		return spettacolo;
	}

	public void setSpettacolo(Spettacolo spettacolo) {
		this.spettacolo = spettacolo;
	}

	public LocalDate getYourDate() {
		return yourDate;
	}

	public void setYourDate(LocalDate yourDate) {
		this.yourDate = yourDate;
	}

}
