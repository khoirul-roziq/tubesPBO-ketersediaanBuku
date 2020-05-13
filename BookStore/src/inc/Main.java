/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc;

import java.sql.SQLException;
import views.FrameAwal;

/**
 *
 * @author Muhammad Alfarizi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        FrameAwal frame = new FrameAwal();
        frame.setVisible(true);
    }
    
}
