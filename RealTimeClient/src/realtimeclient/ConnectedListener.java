/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realtimeclient;

import java.io.IOException;

/**
 *
 * @author USER
 */
public interface ConnectedListener {
    void connected(RealTimeClient sender) throws IOException;
    void connectionFailed(RealTimeClient sender, int failIndex);
}
