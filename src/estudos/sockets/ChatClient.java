/**
 *
 * Descrição:Classe ChatClient
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 08-Apr-2013
 *
 * @version 1.0.0
 *
 */
package estudos.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatClient {

    public static void main(String args[]) throws Exception {
        MulticastSocket chat = new MulticastSocket(1234);
        InetAddress group = InetAddress.getByName("234.5.6.7");
        chat.joinGroup(group);
        String msg = "";
        System.out.println("Digite uma mensagem ao servidor:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
        DatagramPacket data = new DatagramPacket(msg.getBytes(),
                0, msg.length(), group, 1234);
        chat.send(data);
        chat.close();
    }
}
