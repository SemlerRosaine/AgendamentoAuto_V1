package modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Rosaine Fiorio
 */
@javax.persistence.Entity
@Table(name = "agendamento")
public class Agendamento extends Registro {

    @Column
    private String consultor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInclusao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAgendamento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRecepcao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntregaPrevista;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrega;
    @Column
    private Integer numeroOS;
    @Column
    private String codigoPrisma;
    @Column
    private String cliente;
    @Column
    private String cpf;
    @Column
    private String telefone;
    @Column
    private String endereco;
    @Column
    private String veiculoModelo;
    @Column
    private String veiculoPlaca;
    @Column
    private String motivoVisita;
    @Column
    private Boolean agendado = false;
    @Column
    private Boolean efetivo = false;
    @Column
    private Boolean retorno = false;
    @Column
    private Boolean orcamento = false;
    @Column
    private Boolean veiculoProntoRevisado = false;
    @Column
    private Boolean explicacaoTrabalho = false;
    @Column
    private Boolean elevador = false;
    @Column
    private Boolean requisicaoPecas = false;

    public String getConsultor() {
        return consultor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getVeiculoModelo() {
        return veiculoModelo;
    }

    public void setVeiculoModelo(String veiculoModelo) {
        this.veiculoModelo = veiculoModelo;
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Date getDataRecepcao() {
        return dataRecepcao;
    }

    public void setDataRecepcao(Date dataRecepcao) {
        this.dataRecepcao = dataRecepcao;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Integer getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(Integer numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getCodigoPrisma() {
        return codigoPrisma;
    }

    public void setCodigoPrisma(String codigoPrisma) {
        this.codigoPrisma = codigoPrisma;
    }

    

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public Boolean getAgendado() {
        return agendado;
    }

    public void setAgendado(Boolean agendado) {
        this.agendado = agendado;
    }

    public Boolean getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(Boolean efetivo) {
        this.efetivo = efetivo;
    }

    public Boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }

    public Boolean getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Boolean orcamento) {
        this.orcamento = orcamento;
    }

    public Boolean getVeiculoProntoRevisado() {
        return veiculoProntoRevisado;
    }

    public void setVeiculoProntoRevisado(Boolean veiculoProntoRevisado) {
        this.veiculoProntoRevisado = veiculoProntoRevisado;
    }

    public Boolean getExplicacaoTrabalho() {
        return explicacaoTrabalho;
    }

    public void setExplicacaoTrabalho(Boolean explicacaoTrabalho) {
        this.explicacaoTrabalho = explicacaoTrabalho;
    }

    public Boolean getElevador() {
        return elevador;
    }

    public void setElevador(Boolean elevador) {
        this.elevador = elevador;
    }

    public Boolean getRequisicaoPecas() {
        return requisicaoPecas;
    }

    public void setRequisicaoPecas(Boolean requisicaoPecas) {
        this.requisicaoPecas = requisicaoPecas;
    }
}
