import java.net.*;
// Rakaipaka Smiler 1623336
public class resolve {
    public static void main(String[] args) {
        try {
            // if no command line arguments are passed  
            if (args.length == 0) {
                // return useage message
                System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
                return;
            }

            // Iterate through each command line argument of address names
            for (int i = 0; i < args.length; i++) {
                try {
                    // sets the IP address of the host name
                    InetAddress inetAddress = InetAddress.getByName(args[i]);
                    // Prints to the console the IP name host address
                    System.out.println(args[i] + " : " + inetAddress.getHostAddress());
                } catch (UnknownHostException e) {
                    // prints that the host is unknown when there is an exception
                    System.out.println(args[i] + " : unknown host");
                }
            }
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}