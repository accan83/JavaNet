import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
	public static void main(String[] args) throws IOException {
		Socket sc=new Socket("localhost", 9000);
		BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
		System.out.println(br.readLine());
		PrintWriter out=new PrintWriter(sc.getOutputStream(), true);
		out.println("TES KONTA");
	}
}
