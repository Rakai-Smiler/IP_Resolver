import java.net.*;
import java.io.*;
// Rakaipaka Smiler 1623336
public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket to available port
            ServerSocket serverSocket = new ServerSocket(0);
            // Print the port number to the console
            System.out.println("Listening on port " + serverSocket.getLocalPort());
            while (true) {
                // Accept a client connection
                Socket clientSocket = serverSocket.accept(); 


                // Create output stream to send data to the client
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

                InetAddress ia = clientSocket.getInetAddress();

                if(clientSocket.isConnected()){
                    System.out.println("Connection established");
                }  
                
                String clientname = ia.getHostName();
                String clientIP = ia.getHostAddress();
                writer.println("Hello:" + " " + clientname);
                writer.println("Your IP address is " + clientIP);
                // Close the client connection
                clientSocket.close();
                System.out.println("Connection closed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}