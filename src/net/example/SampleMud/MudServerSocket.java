package net.example.SampleMud;

import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.server.RMIServerSocketFactory;

/**
 * Created by Paul on 2/14/2015.
 */
public class MudServerSocket implements RMIServerSocketFactory {
    @Override
    public ServerSocket createServerSocket(int i) throws IOException {
        return null;
    }
}
