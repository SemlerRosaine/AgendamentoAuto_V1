package visualizacao;

import javax.swing.JDesktopPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rosaine Fiorio
 */
public class Inicializacao {

    public static JDesktopPane AREA_DE_TRABALHO;
    public static  TelaPrincipal TELA_PRINCIPAL;;
   

    public static void main(String[] args) {
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               /* TelaAgendamento telaAgendamento = new TelaAgendamento();
                telaAgendamento.setVisible(true);
                telaAgendamento.setResizable(false);*/
                TELA_PRINCIPAL = new TelaPrincipal();
                TELA_PRINCIPAL.setVisible(true);

            }
        });
    }
}
