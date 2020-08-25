/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import modelo.Agendamento;

/**
 *
 * @author Rosaine Fiorio
 */
public class AgendamentoDao extends GenericoDao<Agendamento> {

    public AgendamentoDao() {
        super(Agendamento.class);
    }

    public List<Agendamento> contaAgendamentos(String consultor, Date dataInicial, Date dataFinal) {
        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.consultor = :consultor AND a.dataAgendamento BETWEEN :dataInicial AND :dataFinal ORDER BY a.dataInclusao");
        query.setParameter("consultor", consultor);
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        return query.getResultList();
    }

    public List<Agendamento> contaAgendamentosConsultores(Date dataInicial, Date dataFinal) {
        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.dataAgendamento BETWEEN :dataInicial AND :dataFinal ORDER BY a.dataInclusao");
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        return query.getResultList();
    }

    public Agendamento buscaAgenda(String cliente) {

        Query query = entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cliente LIKE :cliente ORDER BY a.dataInclusao");
        query.setParameter("cliente", cliente);

        Object resultado = query.getSingleResult();
        return (resultado instanceof Agendamento) ? (Agendamento) resultado : null;

    }

    public List<Agendamento> buscaAgendaPorCPF(String cpf) {

        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cpf LIKE :cpf ORDER BY a.dataInclusao");
        query.setParameter("cpf", "%" + cpf + "%");

        return query.getResultList();
    }

    public List<Agendamento> buscaAgendaPorNome(String nome) {

        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cliente LIKE :cliente ORDER BY a.dataInclusao");
        query.setParameter("cliente", "%" + nome + "%");

        return query.getResultList();
    }

    public List<Agendamento> buscaAgendaPorConsultor(String consultor) {

        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.consultor LIKE :nome ORDER BY a.dataInclusao");
        query.setParameter("nome", "%" + consultor + "%");

        return query.getResultList();
    }

    public List<Agendamento> buscaAgendandamentoData(Date dataAgendamento) {
        Date beginDate = (Date) dataAgendamento.clone();
        beginDate.setHours(0);
        beginDate.setMinutes(0);
        beginDate.setSeconds(0);
        Date endDate = (Date) dataAgendamento.clone();
        endDate.setHours(23);
        endDate.setMinutes(59);
        endDate.setSeconds(59);
        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento as a WHERE a.dataAgendamento BETWEEN :dataInicial AND :dataFinal ORDER BY a.dataAgendamento");
        query.setParameter("dataInicial", beginDate);
        query.setParameter("dataFinal", endDate);

        return query.getResultList();
    }
}
