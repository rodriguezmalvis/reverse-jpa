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
 * SxmlHistoricoTransmissaoTiss generated by hbm2java
 */
@Entity
@Table(name = "SXML_HISTORICO_TRANSMISSAO_TISS")
public class SxmlHistoricoTransmissaoTiss implements java.io.Serializable {

	private int id;
	private String cpfCnpj;
	private String pathArquivoEntrada;
	private Date dtTransmissaoEntrada;
	private String pathArquivoSaida;
	private Date dtTransmissaoSaida;
	private Date timestamp;
	private Byte fgFalhaProcessamento;
	private Long cdProtocolo;
	private Integer idProtocolo;
	private String versao;
	private Integer idTipoProtocolo;
	private Integer FProcessado;
	private Boolean FManual;
	private Boolean FFechado;

	public SxmlHistoricoTransmissaoTiss() {
	}

	public SxmlHistoricoTransmissaoTiss(int id, String cpfCnpj, String pathArquivoEntrada, Date dtTransmissaoEntrada,
			Date timestamp) {
		this.id = id;
		this.cpfCnpj = cpfCnpj;
		this.pathArquivoEntrada = pathArquivoEntrada;
		this.dtTransmissaoEntrada = dtTransmissaoEntrada;
		this.timestamp = timestamp;
	}

	public SxmlHistoricoTransmissaoTiss(int id, String cpfCnpj, String pathArquivoEntrada, Date dtTransmissaoEntrada,
			String pathArquivoSaida, Date dtTransmissaoSaida, Date timestamp, Byte fgFalhaProcessamento,
			Long cdProtocolo, Integer idProtocolo, String versao, Integer idTipoProtocolo, Integer FProcessado,
			Boolean FManual, Boolean FFechado) {
		this.id = id;
		this.cpfCnpj = cpfCnpj;
		this.pathArquivoEntrada = pathArquivoEntrada;
		this.dtTransmissaoEntrada = dtTransmissaoEntrada;
		this.pathArquivoSaida = pathArquivoSaida;
		this.dtTransmissaoSaida = dtTransmissaoSaida;
		this.timestamp = timestamp;
		this.fgFalhaProcessamento = fgFalhaProcessamento;
		this.cdProtocolo = cdProtocolo;
		this.idProtocolo = idProtocolo;
		this.versao = versao;
		this.idTipoProtocolo = idTipoProtocolo;
		this.FProcessado = FProcessado;
		this.FManual = FManual;
		this.FFechado = FFechado;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "cpf_cnpj", nullable = false, length = 19)
	public String getCpfCnpj() {
		return this.cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	@Column(name = "path_arquivo_entrada", nullable = false)
	public String getPathArquivoEntrada() {
		return this.pathArquivoEntrada;
	}

	public void setPathArquivoEntrada(String pathArquivoEntrada) {
		this.pathArquivoEntrada = pathArquivoEntrada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_transmissao_entrada", nullable = false, length = 23)
	public Date getDtTransmissaoEntrada() {
		return this.dtTransmissaoEntrada;
	}

	public void setDtTransmissaoEntrada(Date dtTransmissaoEntrada) {
		this.dtTransmissaoEntrada = dtTransmissaoEntrada;
	}

	@Column(name = "path_arquivo_saida")
	public String getPathArquivoSaida() {
		return this.pathArquivoSaida;
	}

	public void setPathArquivoSaida(String pathArquivoSaida) {
		this.pathArquivoSaida = pathArquivoSaida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_transmissao_saida", length = 23)
	public Date getDtTransmissaoSaida() {
		return this.dtTransmissaoSaida;
	}

	public void setDtTransmissaoSaida(Date dtTransmissaoSaida) {
		this.dtTransmissaoSaida = dtTransmissaoSaida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "fg_falha_processamento")
	public Byte getFgFalhaProcessamento() {
		return this.fgFalhaProcessamento;
	}

	public void setFgFalhaProcessamento(Byte fgFalhaProcessamento) {
		this.fgFalhaProcessamento = fgFalhaProcessamento;
	}

	@Column(name = "cd_protocolo", precision = 13, scale = 0)
	public Long getCdProtocolo() {
		return this.cdProtocolo;
	}

	public void setCdProtocolo(Long cdProtocolo) {
		this.cdProtocolo = cdProtocolo;
	}

	@Column(name = "id_protocolo")
	public Integer getIdProtocolo() {
		return this.idProtocolo;
	}

	public void setIdProtocolo(Integer idProtocolo) {
		this.idProtocolo = idProtocolo;
	}

	@Column(name = "versao", length = 10)
	public String getVersao() {
		return this.versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	@Column(name = "id_tipo_protocolo")
	public Integer getIdTipoProtocolo() {
		return this.idTipoProtocolo;
	}

	public void setIdTipoProtocolo(Integer idTipoProtocolo) {
		this.idTipoProtocolo = idTipoProtocolo;
	}

	@Column(name = "f_processado")
	public Integer getFProcessado() {
		return this.FProcessado;
	}

	public void setFProcessado(Integer FProcessado) {
		this.FProcessado = FProcessado;
	}

	@Column(name = "f_manual")
	public Boolean getFManual() {
		return this.FManual;
	}

	public void setFManual(Boolean FManual) {
		this.FManual = FManual;
	}

	@Column(name = "f_fechado")
	public Boolean getFFechado() {
		return this.FFechado;
	}

	public void setFFechado(Boolean FFechado) {
		this.FFechado = FFechado;
	}

}
