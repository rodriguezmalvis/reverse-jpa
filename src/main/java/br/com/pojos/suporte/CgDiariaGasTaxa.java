package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CgDiariaGasTaxa generated by hbm2java
 */
@Entity
@Table(name = "CG_DIARIA_GAS_TAXA", schema = "dbo", catalog = "CacDb")
public class CgDiariaGasTaxa implements java.io.Serializable {

	private CgDiariaGasTaxaId id;
	private String nome;
	private char DTipo;
	private Date dtInicio;
	private Date dtFim;
	private boolean FAtivo;
	private Date timestamp;

	public CgDiariaGasTaxa() {
	}

	public CgDiariaGasTaxa(CgDiariaGasTaxaId id, String nome, char DTipo, Date dtInicio, boolean FAtivo,
			Date timestamp) {
		this.id = id;
		this.nome = nome;
		this.DTipo = DTipo;
		this.dtInicio = dtInicio;
		this.FAtivo = FAtivo;
		this.timestamp = timestamp;
	}

	public CgDiariaGasTaxa(CgDiariaGasTaxaId id, String nome, char DTipo, Date dtInicio, Date dtFim, boolean FAtivo,
			Date timestamp) {
		this.id = id;
		this.nome = nome;
		this.DTipo = DTipo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.FAtivo = FAtivo;
		this.timestamp = timestamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idDiariaGasTaxa", column = @Column(name = "id_diaria_gas_taxa", nullable = false)),
			@AttributeOverride(name = "idTipoTabela", column = @Column(name = "id_tipo_tabela", nullable = false)) })
	public CgDiariaGasTaxaId getId() {
		return this.id;
	}

	public void setId(CgDiariaGasTaxaId id) {
		this.id = id;
	}

	@Column(name = "nome", nullable = false, length = 170)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "d_tipo", nullable = false, length = 1)
	public char getDTipo() {
		return this.DTipo;
	}

	public void setDTipo(char DTipo) {
		this.DTipo = DTipo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inicio", nullable = false, length = 23)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_fim", length = 23)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "f_ativo", nullable = false)
	public boolean isFAtivo() {
		return this.FAtivo;
	}

	public void setFAtivo(boolean FAtivo) {
		this.FAtivo = FAtivo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
