import java.net.*;
import java.io.*;
// Rakaipaka Smiler 1623336
public class SimpleClient{
    public static void main(String[] args) {
        // Creates InetAddress and socket objects
        InetAddress ia;
        Socket sock;
        // declears varialbes for port and client name
        String port = "";
        String name = "";
        if(args.length == 2){
             name = args[0];
             port = args[1];
        }else{
            System.out.println("Usage: SimpleClient <hostname> <port>");
        }

        try{
            // gets the ip address of the host 
            ia = InetAddress.getByName(name);
        }catch(UnknownHostException e){
            System.out.println("Unknown host");
            return;
        }
        try{
            // turns the port number into an integer
            int p = Integer.parseInt(port);
            // creates a socket object with passed values
            sock = new Socket(ia, p);
            // creates a buffered reader object to read the input stream
            BufferedReader read = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            // reads the input stream
            String line = read.readLine();
            String ip = read.readLine();
            // prints the output    
            System.out.println(line);
            System.out.println(ip);
        }catch(IOException e){
            // prints an IO exception
            System.out.println("IO Exception");
            return;
        }
        
    }
}