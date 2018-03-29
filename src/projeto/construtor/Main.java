package projeto.construtor;

import projeto.form.FormBackground;
import projeto.form.FormLogin;

public class Main {

    public static void main(String[] args) {
        FormBackground formBg = new FormBackground();
        FormLogin formLogin = new FormLogin();
        formLogin.setVisible(true);

        //Forçando o tema Windows para todas as telas, para que o tema NIMBUS não volte a aparecer.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.getMessage();
        }
    }
}
