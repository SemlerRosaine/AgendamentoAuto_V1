/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.relatorios;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import componente.text.formated.DataTextField;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Agendamento;
import modelo.dao.AgendamentoDao;

/**
 *
 * @author Rosaine Fiorio
 */
public class ControleAgenda extends javax.swing.JInternalFrame {

    private List<Agendamento> agendamentos;
    private AgendamentoDao agendamento;

    /**
     * Creates new form ControleAgenda
     */
    public ControleAgenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtConsultorRelatorio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDataInicial = new DataTextField(true);
        jLabel3 = new javax.swing.JLabel();
        txtDataFinal = new DataTextField(true);
        btnBuscarAgendamentos = new javax.swing.JButton();
        jbGerarRelatorio = new javax.swing.JButton();

        jLabel1.setText("Consultor");

        jLabel2.setText("Data Inicial");

        jLabel3.setText("Data Final");

        btnBuscarAgendamentos.setText("Buscar");
        btnBuscarAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAgendamentosActionPerformed(evt);
            }
        });

        jbGerarRelatorio.setText("Gerar Relatório");
        jbGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jbGerarRelatorio)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(txtDataFinal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarAgendamentos))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtConsultorRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jbGerarRelatorio)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtConsultorRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarAgendamentos))
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAgendamentosActionPerformed
        /*  try {
         this.agendamentos = new AgendamentoDao().contaAgendamentos(this.txtConsultorRelatorio.getText(), new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(txtDataInicial.getText()+" 00:00:00"), new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(txtDataFinal.getText()+" 23:59:59"));
         Integer servicos = 0;
         Integer agendados = 0;
         Integer entradas = 0;
         Integer explicacao = 0;
         Integer inspecoes = 0;
         Integer orcamentos = 0;
         Integer prazo = 0;
         Integer requisicao = 0;
         Integer retorno = 0;

         for (Agendamento agendamento : agendamentos) {
         if (!agendamento.getRetorno()) {
         servicos++;
         }

         if (agendamento.getAgendado()) {
         agendados++;
         }

         if (agendamento.getExplicacaoTrabalho()) {
         explicacao++;
         }
         if (agendamento.getElevador()) {
         inspecoes++;
         }
         if (agendamento.getOrcamento()) {
         orcamentos++;
         }
         if (agendamento.getVeiculoProntoRevisado()) {
         prazo++;
         }
         if (agendamento.getRequisicaoPecas()) {
         requisicao++;
         }
         if (agendamento.getRetorno()) {
         retorno++;
         }
         if (agendamento.getEfetivo()) {
         entradas++;
         }
         }

     
         jbGerarRelatorio.setEnabled(true);
         } catch (ParseException ex) {
         JOptionPane.showMessageDialog(this, "Data inválida.");
         }*/
    }//GEN-LAST:event_btnBuscarAgendamentosActionPerformed

    private void jbGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRelatorioActionPerformed
        try {
            try {
                // TODO add your handling code here:
                this.agendamentos = new AgendamentoDao().contaAgendamentos(this.txtConsultorRelatorio.getText(), new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(txtDataInicial.getText() + " 00:00:00"), new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(txtDataFinal.getText() + " 23:59:59"));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Data inválida.");
            }

            relatorioContaAgendamento();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsultaAgendamentoDiario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsultaAgendamentoDiario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConsultaAgendamentoDiario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbGerarRelatorioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAgendamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbGerarRelatorio;
    private javax.swing.JTextField txtConsultorRelatorio;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables

    public void relatorioContaAgendamento() throws FileNotFoundException, DocumentException, IOException {

        String fileName = System.getProperty("user.dir") + "\\consulta-agenda-" + new SimpleDateFormat("dd-mm-yyyy").format(new Date()) + ".pdf";

        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 6);

        Document document = new Document();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        PdfWriter.getInstance(document, fileOutputStream);


        document.open();
        document.setPageSize(PageSize.A4.rotate());
        Paragraph title = new Paragraph("Controle Agenda", font);
        title.setSpacingAfter(2);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        Paragraph nomeConsultor = new Paragraph("Consultor: " + this.txtConsultorRelatorio.getText(), font);
        nomeConsultor.setSpacingAfter(2);
        nomeConsultor.setSpacingBefore(2);
        nomeConsultor.setAlignment(Element.ALIGN_LEFT);
        document.add(nomeConsultor);

        Paragraph periodo = new Paragraph("De: " + txtDataInicial.getText() + " Até: " + txtDataFinal.getText(), font);
        periodo.setSpacingAfter(2);
        periodo.setSpacingBefore(2);
        periodo.setAlignment(Element.ALIGN_LEFT);
        document.add(periodo);
        for (Agendamento agendamento : agendamentos) {
            Paragraph periodoData = new Paragraph("Data: " + ((agendamento.getDataAgendamento() instanceof Date) ? new SimpleDateFormat("dd/MM/yyyy").format(agendamento.getDataAgendamento()) : null));
            periodoData.setSpacingAfter(2);
            periodoData.setSpacingBefore(2);
            periodoData.setAlignment(Element.ALIGN_LEFT);
            document.add(periodoData);

            PdfPTable pdfPTable = new PdfPTable(20);
            pdfPTable.setWidthPercentage(100);

            pdfPTable.addCell(new PdfPCell(new Phrase("Hora Agendada", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Cliente", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("CPF", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Telefone", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Motivo Visita", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Veiculo", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Placa", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Hora Recepção", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Agendados", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Efetivo", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Numero Prisma", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Retornos", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Inspeçoes", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Orçamentos", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Numero OS", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Hora Prometida", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Prazos Cumpridos", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Hora Entrega", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Explicação dos Serviços", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase("Requisição de Peças", font)));


            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getDataAgendamento() instanceof Date) ? new SimpleDateFormat("HH:mm").format(agendamento.getDataAgendamento()) : null, font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getCliente(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getCpf(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getTelefone(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getMotivoVisita(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getVeiculoModelo(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getVeiculoPlaca(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getDataRecepcao() instanceof Date) ? new SimpleDateFormat("HH:mm").format(agendamento.getDataRecepcao()) : null, font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getAgendado()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getEfetivo()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getCodigoPrisma(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getRetorno()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getElevador()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getOrcamento()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase(agendamento.getNumeroOS().toString(), font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getDataEntregaPrevista() instanceof Date) ? new SimpleDateFormat("HH:mm").format(agendamento.getDataEntregaPrevista()) : null, font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getVeiculoProntoRevisado()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getDataEntrega() instanceof Date) ? new SimpleDateFormat("HH:mm").format(agendamento.getDataEntrega()) : null, font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getExplicacaoTrabalho()) ? "S" : "N", font)));
            pdfPTable.addCell(new PdfPCell(new Phrase((agendamento.getRequisicaoPecas()) ? "S" : "N", font)));


            document.add(pdfPTable);


        }
        document.close();
        Desktop.getDesktop().open(new File(fileName));
    }
}
