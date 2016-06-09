package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PrestadorCadastrado generated by hbm2java
 */
@Entity
@Table(name = "PRESTADOR_CADASTRADO", schema = "dbo", catalog = "CacDb")
public class PrestadorCadastrado implements java.io.Serializable {

	private int idPrestador;
	private Prestador prestador;
	private char DPagamento;
	private Character DClassificacaoUltra;
	private Character DClassificacaoRadio;
	private boolean FCredenciado;
	private String nomeFantasia;
	private boolean FHospitalAberto;
	private String siglaConselho;
	private String registroConselho;
	private boolean FOcasional;
	private boolean FEndrDiferenciadoEspc;
	private boolean FUtilizaMatriculaAssociacao;
	private boolean FEntregaProcessoStaff;
	private Date timestamp;
	private Byte FRedeReferenciada;
	private Byte FSemCobranca;
	private String ufConselho;
	private Integer idCbos;
	private Character DSituacaoAtendimento;
	private String inscricaoMunicipal;
	private Integer anoRecadastramento;
	private Date dtContratacaoEstabelecimentoGeral;
	private Character DTipoHospital;
	private Character DClassificacaoEstabelecimento;
	private String registroAnsIntermediario;
	private Character DUrgenciaEmergencia;
	private Character DSexo;
	private Date dtNascimento;
	private Integer idCbo;
	private Boolean FMedicoAdministracao;
	private Boolean FCadastroNovo;
	private Set<GuiaOcupacional> guiaOcupacionals = new HashSet<GuiaOcupacional>(0);

	public PrestadorCadastrado() {
	}

	public PrestadorCadastrado(Prestador prestador, char DPagamento, boolean FCredenciado, boolean FHospitalAberto,
			boolean FOcasional, boolean FEndrDiferenciadoEspc, boolean FUtilizaMatriculaAssociacao,
			boolean FEntregaProcessoStaff, Date timestamp) {
		this.prestador = prestador;
		this.DPagamento = DPagamento;
		this.FCredenciado = FCredenciado;
		this.FHospitalAberto = FHospitalAberto;
		this.FOcasional = FOcasional;
		this.FEndrDiferenciadoEspc = FEndrDiferenciadoEspc;
		this.FUtilizaMatriculaAssociacao = FUtilizaMatriculaAssociacao;
		this.FEntregaProcessoStaff = FEntregaProcessoStaff;
		this.timestamp = timestamp;
	}

	public PrestadorCadastrado(Prestador prestador, char DPagamento, Character DClassificacaoUltra,
			Character DClassificacaoRadio, boolean FCredenciado, String nomeFantasia, boolean FHospitalAberto,
			String siglaConselho, String registroConselho, boolean FOcasional, boolean FEndrDiferenciadoEspc,
			boolean FUtilizaMatriculaAssociacao, boolean FEntregaProcessoStaff, Date timestamp, Byte FRedeReferenciada,
			Byte FSemCobranca, String ufConselho, Integer idCbos, Character DSituacaoAtendimento,
			String inscricaoMunicipal, Integer anoRecadastramento, Date dtContratacaoEstabelecimentoGeral,
			Character DTipoHospital, Character DClassificacaoEstabelecimento, String registroAnsIntermediario,
			Character DUrgenciaEmergencia, Character DSexo, Date dtNascimento, Integer idCbo,
			Boolean FMedicoAdministracao, Boolean FCadastroNovo, Set<GuiaOcupacional> guiaOcupacionals) {
		this.prestador = prestador;
		this.DPagamento = DPagamento;
		this.DClassificacaoUltra = DClassificacaoUltra;
		this.DClassificacaoRadio = DClassificacaoRadio;
		this.FCredenciado = FCredenciado;
		this.nomeFantasia = nomeFantasia;
		this.FHospitalAberto = FHospitalAberto;
		this.siglaConselho = siglaConselho;
		this.registroConselho = registroConselho;
		this.FOcasional = FOcasional;
		this.FEndrDiferenciadoEspc = FEndrDiferenciadoEspc;
		this.FUtilizaMatriculaAssociacao = FUtilizaMatriculaAssociacao;
		this.FEntregaProcessoStaff = FEntregaProcessoStaff;
		this.timestamp = timestamp;
		this.FRedeReferenciada = FRedeReferenciada;
		this.FSemCobranca = FSemCobranca;
		this.ufConselho = ufConselho;
		this.idCbos = idCbos;
		this.DSituacaoAtendimento = DSituacaoAtendimento;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.anoRecadastramento = anoRecadastramento;
		this.dtContratacaoEstabelecimentoGeral = dtContratacaoEstabelecimentoGeral;
		this.DTipoHospital = DTipoHospital;
		this.DClassificacaoEstabelecimento = DClassificacaoEstabelecimento;
		this.registroAnsIntermediario = registroAnsIntermediario;
		this.DUrgenciaEmergencia = DUrgenciaEmergencia;
		this.DSexo = DSexo;
		this.dtNascimento = dtNascimento;
		this.idCbo = idCbo;
		this.FMedicoAdministracao = FMedicoAdministracao;
		this.FCadastroNovo = FCadastroNovo;
		this.guiaOcupacionals = guiaOcupacionals;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "prestador"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_prestador", unique = true, nullable = false)
	public int getIdPrestador() {
		return this.idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Prestador getPrestador() {
		return this.prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	@Column(name = "d_pagamento", nullable = false, length = 1)
	public char getDPagamento() {
		return this.DPagamento;
	}

	public void setDPagamento(char DPagamento) {
		this.DPagamento = DPagamento;
	}

	@Column(name = "d_classificacao_ultra", length = 1)
	public Character getDClassificacaoUltra() {
		return this.DClassificacaoUltra;
	}

	public void setDClassificacaoUltra(Character DClassificacaoUltra) {
		this.DClassificacaoUltra = DClassificacaoUltra;
	}

	@Column(name = "d_classificacao_radio", length = 1)
	public Character getDClassificacaoRadio() {
		return this.DClassificacaoRadio;
	}

	public void setDClassificacaoRadio(Character DClassificacaoRadio) {
		this.DClassificacaoRadio = DClassificacaoRadio;
	}

	@Column(name = "f_credenciado", nullable = false)
	public boolean isFCredenciado() {
		return this.FCredenciado;
	}

	public void setFCredenciado(boolean FCredenciado) {
		this.FCredenciado = FCredenciado;
	}

	@Column(name = "nome_fantasia", length = 50)
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Column(name = "f_hospital_aberto", nullable = false)
	public boolean isFHospitalAberto() {
		return this.FHospitalAberto;
	}

	public void setFHospitalAberto(boolean FHospitalAberto) {
		this.FHospitalAberto = FHospitalAberto;
	}

	@Column(name = "sigla_conselho", length = 7)
	public String getSiglaConselho() {
		return this.siglaConselho;
	}

	public void setSiglaConselho(String siglaConselho) {
		this.siglaConselho = siglaConselho;
	}

	@Column(name = "registro_conselho", length = 15)
	public String getRegistroConselho() {
		return this.registroConselho;
	}

	public void setRegistroConselho(String registroConselho) {
		this.registroConselho = registroConselho;
	}

	@Column(name = "f_ocasional", nullable = false)
	public boolean isFOcasional() {
		return this.FOcasional;
	}

	public void setFOcasional(boolean FOcasional) {
		this.FOcasional = FOcasional;
	}

	@Column(name = "f_endr_diferenciado_espc", nullable = false)
	public boolean isFEndrDiferenciadoEspc() {
		return this.FEndrDiferenciadoEspc;
	}

	public void setFEndrDiferenciadoEspc(boolean FEndrDiferenciadoEspc) {
		this.FEndrDiferenciadoEspc = FEndrDiferenciadoEspc;
	}

	@Column(name = "f_utiliza_matricula_associacao", nullable = false)
	public boolean isFUtilizaMatriculaAssociacao() {
		return this.FUtilizaMatriculaAssociacao;
	}

	public void setFUtilizaMatriculaAssociacao(boolean FUtilizaMatriculaAssociacao) {
		this.FUtilizaMatriculaAssociacao = FUtilizaMatriculaAssociacao;
	}

	@Column(name = "f_entrega_processo_staff", nullable = false)
	public boolean isFEntregaProcessoStaff() {
		return this.FEntregaProcessoStaff;
	}

	public void setFEntregaProcessoStaff(boolean FEntregaProcessoStaff) {
		this.FEntregaProcessoStaff = FEntregaProcessoStaff;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "f_rede_referenciada")
	public Byte getFRedeReferenciada() {
		return this.FRedeReferenciada;
	}

	public void setFRedeReferenciada(Byte FRedeReferenciada) {
		this.FRedeReferenciada = FRedeReferenciada;
	}

	@Column(name = "f_sem_cobranca")
	public Byte getFSemCobranca() {
		return this.FSemCobranca;
	}

	public void setFSemCobranca(Byte FSemCobranca) {
		this.FSemCobranca = FSemCobranca;
	}

	@Column(name = "uf_conselho", length = 2)
	public String getUfConselho() {
		return this.ufConselho;
	}

	public void setUfConselho(String ufConselho) {
		this.ufConselho = ufConselho;
	}

	@Column(name = "id_cbos")
	public Integer getIdCbos() {
		return this.idCbos;
	}

	public void setIdCbos(Integer idCbos) {
		this.idCbos = idCbos;
	}

	@Column(name = "d_situacao_atendimento", length = 1)
	public Character getDSituacaoAtendimento() {
		return this.DSituacaoAtendimento;
	}

	public void setDSituacaoAtendimento(Character DSituacaoAtendimento) {
		this.DSituacaoAtendimento = DSituacaoAtendimento;
	}

	@Column(name = "inscricao_municipal", length = 20)
	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	@Column(name = "ano_recadastramento")
	public Integer getAnoRecadastramento() {
		return this.anoRecadastramento;
	}

	public void setAnoRecadastramento(Integer anoRecadastramento) {
		this.anoRecadastramento = anoRecadastramento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_contratacao_estabelecimento_geral", length = 23)
	public Date getDtContratacaoEstabelecimentoGeral() {
		return this.dtContratacaoEstabelecimentoGeral;
	}

	public void setDtContratacaoEstabelecimentoGeral(Date dtContratacaoEstabelecimentoGeral) {
		this.dtContratacaoEstabelecimentoGeral = dtContratacaoEstabelecimentoGeral;
	}

	@Column(name = "d_tipo_hospital", length = 1)
	public Character getDTipoHospital() {
		return this.DTipoHospital;
	}

	public void setDTipoHospital(Character DTipoHospital) {
		this.DTipoHospital = DTipoHospital;
	}

	@Column(name = "d_classificacao_estabelecimento", length = 1)
	public Character getDClassificacaoEstabelecimento() {
		return this.DClassificacaoEstabelecimento;
	}

	public void setDClassificacaoEstabelecimento(Character DClassificacaoEstabelecimento) {
		this.DClassificacaoEstabelecimento = DClassificacaoEstabelecimento;
	}

	@Column(name = "registro_ans_intermediario", length = 6)
	public String getRegistroAnsIntermediario() {
		return this.registroAnsIntermediario;
	}

	public void setRegistroAnsIntermediario(String registroAnsIntermediario) {
		this.registroAnsIntermediario = registroAnsIntermediario;
	}

	@Column(name = "d_urgencia_emergencia", length = 1)
	public Character getDUrgenciaEmergencia() {
		return this.DUrgenciaEmergencia;
	}

	public void setDUrgenciaEmergencia(Character DUrgenciaEmergencia) {
		this.DUrgenciaEmergencia = DUrgenciaEmergencia;
	}

	@Column(name = "d_sexo", length = 1)
	public Character getDSexo() {
		return this.DSexo;
	}

	public void setDSexo(Character DSexo) {
		this.DSexo = DSexo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", length = 10)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "id_cbo")
	public Integer getIdCbo() {
		return this.idCbo;
	}

	public void setIdCbo(Integer idCbo) {
		this.idCbo = idCbo;
	}

	@Column(name = "f_medico_administracao")
	public Boolean getFMedicoAdministracao() {
		return this.FMedicoAdministracao;
	}

	public void setFMedicoAdministracao(Boolean FMedicoAdministracao) {
		this.FMedicoAdministracao = FMedicoAdministracao;
	}

	@Column(name = "f_cadastro_novo")
	public Boolean getFCadastroNovo() {
		return this.FCadastroNovo;
	}

	public void setFCadastroNovo(Boolean FCadastroNovo) {
		this.FCadastroNovo = FCadastroNovo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prestadorCadastrado")
	public Set<GuiaOcupacional> getGuiaOcupacionals() {
		return this.guiaOcupacionals;
	}

	public void setGuiaOcupacionals(Set<GuiaOcupacional> guiaOcupacionals) {
		this.guiaOcupacionals = guiaOcupacionals;
	}

}
