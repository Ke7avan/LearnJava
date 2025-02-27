import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5000; // Port number
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                // Step 1: Accept client connection
                Socket socket = serverSocket.accept();
                System.out.println("New client connected.");

                // Step 2: Get input and output streams
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                // Step 3: Read client message
                String message = reader.readLine();
                System.out.println("Received: " + message);

                // Step 4: Respond to client
                writer.println("Hello, client! You sent: " + message);

                // Step 5: Close socket
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
