package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TipoTabelaAmb generated by hbm2java
 */
@Entity
@Table(name = "TIPO_TABELA_AMB")
public class TipoTabelaAmb implements java.io.Serializable {

	private int idTipoTabela;
	private String nome;
	private String codAns;
	private Date timestamp;
	private Character DClassificacaoTabela;
	private char DTipo;
	private Boolean FAtivo;

	public TipoTabelaAmb() {
	}

	public TipoTabelaAmb(int idTipoTabela, String nome, String codAns, Date timestamp, char DTipo) {
		this.idTipoTabela = idTipoTabela;
		this.nome = nome;
		this.codAns = codAns;
		this.timestamp = timestamp;
		this.DTipo = DTipo;
	}

	public TipoTabelaAmb(int idTipoTabela, String nome, String codAns, Date timestamp, Character DClassificacaoTabela,
			char DTipo, Boolean FAtivo) {
		this.idTipoTabela = idTipoTabela;
		this.nome = nome;
		this.codAns = codAns;
		this.timestamp = timestamp;
		this.DClassificacaoTabela = DClassificacaoTabela;
		this.DTipo = DTipo;
		this.FAtivo = FAtivo;
	}

	@Id

	@Column(name = "id_tipo_tabela", unique = true, nullable = false)
	public int getIdTipoTabela() {
		return this.idTipoTabela;
	}

	public void setIdTipoTabela(int idTipoTabela) {
		this.idTipoTabela = idTipoTabela;
	}

	@Column(name = "nome", nullable = false, length = 65)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "cod_ans", nullable = false, length = 2)
	public String getCodAns() {
		return this.codAns;
	}

	public void setCodAns(String codAns) {
		this.codAns = codAns;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "D_CLASSIFICACAO_TABELA", length = 1)
	public Character getDClassificacaoTabela() {
		return this.DClassificacaoTabela;
	}

	public void setDClassificacaoTabela(Character DClassificacaoTabela) {
		this.DClassificacaoTabela = DClassificacaoTabela;
	}

	@Column(name = "d_tipo", nullable = false, length = 1)
	public char getDTipo() {
		return this.DTipo;
	}

	public void setDTipo(char DTipo) {
		this.DTipo = DTipo;
	}

	@Column(name = "f_ativo")
	public Boolean getFAtivo() {
		return this.FAtivo;
	}

	public void setFAtivo(Boolean FAtivo) {
		this.FAtivo = FAtivo;
	}

}
