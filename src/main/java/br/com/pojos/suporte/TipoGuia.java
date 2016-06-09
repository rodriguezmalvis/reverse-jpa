package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TipoGuia generated by hbm2java
 */
@Entity
@Table(name = "TIPO_GUIA", schema = "dbo", catalog = "CacDb")
public class TipoGuia implements java.io.Serializable {

	private int idTipoGuia;
	private String nome;
	private Date timestamp;
	private Set<Guia> guias = new HashSet<Guia>(0);

	public TipoGuia() {
	}

	public TipoGuia(int idTipoGuia, String nome, Date timestamp) {
		this.idTipoGuia = idTipoGuia;
		this.nome = nome;
		this.timestamp = timestamp;
	}

	public TipoGuia(int idTipoGuia, String nome, Date timestamp, Set<Guia> guias) {
		this.idTipoGuia = idTipoGuia;
		this.nome = nome;
		this.timestamp = timestamp;
		this.guias = guias;
	}

	@Id

	@Column(name = "id_tipo_guia", unique = true, nullable = false)
	public int getIdTipoGuia() {
		return this.idTipoGuia;
	}

	public void setIdTipoGuia(int idTipoGuia) {
		this.idTipoGuia = idTipoGuia;
	}

	@Column(name = "nome", nullable = false, length = 40)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoGuia")
	public Set<Guia> getGuias() {
		return this.guias;
	}

	public void setGuias(Set<Guia> guias) {
		this.guias = guias;
	}

}
