import java.net.*;
// Rakaipaka Smiler 1623336
public class reverse {
	public static void main(String[] args) {
        try{
            // if no arguments are passed
            if (args.length == 0) {
                // Prints instructions on how to use
                System.out.println("Usage: reverse <IPv4.1> <IPv4.2> ... <IPv4.N>");
                return;
            }
            // for each address passed
            for (int i = 0; i < args.length; i++) {
            
                    // Sets internet address to the ip passsed
                    InetAddress inetAddress = InetAddress.getByName(args[i]);

                    // if the address name is the same as the host name prints unknown host
                    if(args[i].compareTo(inetAddress.getHostName()) == 0){
                        System.out.println(args[i] + " : no Name" );
                    }else{
                            // if the address name is know prints the name
                    System.out.println(args[i] + " : " + inetAddress.getHostName());
                    }
                
               
            }
        }catch(Exception e){
            //  print the stack trace of an exception
            e.printStackTrace();
        }
		
	}
}