/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuinfomanagesys;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author asus
 */
public class StuInfoManageSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        ShanPing sp = new ShanPing();
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        sp.updateProcess("���ڼ�������. . .", i * 9);

                        Thread.sleep(300);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(StuInfoManageSys.class.getName()).log(Level.SEVERE, null, ex);
                }
//                Login login = new Login();
                SelectLogin login = new SelectLogin();

                sp.updateProcess("��������������. . .", 100);

                sp.setVisible(false);
                login.setVisible(true);
                sp.dispose();
            }
        }.start();
        sp.setVisible(true);
    
    }
    
}
