package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements Reader
{
    private String _protocol;
    private String _host;
    private String _file;

    public NetworkReader(String protocol, String host, String file)
    {
        _protocol = protocol;
        _host = host;
        _file = file;
    }

    @Override
    public String read() throws IOException
    {
        URL url = new URL(_protocol, _host, _file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }
}
