/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.DataInputStream;

/**
 *
 * @author Широканев Александр
 */
public interface DataReceivedListener {
    void dataReceived(PartReader sender, DataInputStream in);
}
