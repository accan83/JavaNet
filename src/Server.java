import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket listener=new ServerSocket(9000);
		System.out.println("Server sedang bekerja pada port "+listener.getLocalPort()+"...");
		Socket sc=listener.accept();
		try{
			String s="";
			while(!s.equalsIgnoreCase("TES KONTAK")){
				try{
					PrintWriter out=new PrintWriter(sc.getOutputStream(), true);
					out.println("Tanggal Server : "+new Date().toString());
					BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
					s=br.readLine();
					System.out.println(s);
				}finally{
				}
			}
		}finally{
			sc.close();
			listener.close();
		}
	}
}
