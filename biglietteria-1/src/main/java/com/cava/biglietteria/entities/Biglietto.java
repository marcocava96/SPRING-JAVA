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
@Table(name = "biglietti")
public class Biglietto {

	@Id
	@GeneratedValue
	private long cod_operazione;

	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "cod_replica")
	private Replica replica;

	@Column(name = "data_ora")
	private LocalDate data_ora;

	@Column
	private String tipo_pagamento;

	@Column
	private long quantita;

	public long getCod_operazione() {
		return cod_operazione;
	}

	public void setCod_operazione(long cod_operazione) {
		this.cod_operazione = cod_operazione;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public LocalDate getData_ora() {
		return data_ora;
	}

	public void setData_ora(LocalDate data_ora) {
		this.data_ora = data_ora;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public long getQuantita() {
		return quantita;
	}

	public void setQuantita(long quantita) {
		this.quantita = quantita;
	}

}
