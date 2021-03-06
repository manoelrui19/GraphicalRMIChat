package ufc.br.interfaces;

import ufc.br.model.ChatMessage;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by rui on 10/12/15.
 */
public interface ChatClient extends Remote {
    // Callback function
    public void receiveMessageFromServer(ChatMessage chatMessage) throws RemoteException;
    public Boolean isAlive() throws RemoteException;
}
