import java.io.*;

public class ejercicio {

	public static void main(String[] args) {

		try {
			File fichero = new File("entrada");
			File ficheroS = new File("salida");
			FileReader fr = new FileReader(fichero);
			FileWriter frS = new FileWriter(ficheroS);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			BufferedWriter brS = new BufferedWriter(frS);

			while (linea != null) {
				StringBuilder stringBuilder = new StringBuilder(linea);
				
				String invertida = stringBuilder.reverse().toString();
				
				
				if (linea.contains("ae")) {
					brS.write(invertida, 0, invertida.length());
					brS.newLine();
					linea= br.readLine();
					
					
				}
				
				if (!linea.contains("ae")) {
					brS.write(linea, 0, linea.length());
					brS.newLine();
					linea= br.readLine();
					
				}
				
				
				
				br.close();
				brS.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
