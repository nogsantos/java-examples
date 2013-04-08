/**
 *
 * Descrição:Classe ChatServer
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

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatServer {

    public static void main(String args[]) throws Exception {
        MulticastSocket server = new MulticastSocket(1234);
        InetAddress group = InetAddress.getByName("234.5.6.7");
        //getByName - retorna o endereço IP dado para o host
        server.joinGroup(group);
        boolean infinite = true;
        /*
         * O servidor recebe continuamente os dados e imprimindo-os
         */
        while (infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data = new DatagramPacket(buf, buf.length);
            server.receive(data);
            String msg = new String(data.getData()).trim();
            System.out.println(msg);
        }
        server.close();
    }
}
