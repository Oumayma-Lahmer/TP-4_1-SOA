package serveur;

import javax.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
	public static void main(String[] args) {
		CalculatriceWS calculatrice =new CalculatriceWS();
		// on specifie l'adresse d'accès
		String url ="http://localhost:8084/";
		
		//Pour publier le service web, on fait appel à la méthode appartenent à JAX-WS
		//on publie le service web dans l'url est service web est une instance de CalculatriceWS
		Endpoint.publish(url, calculatrice);
		
		//pour le test
		System.out.println("Server url:"+ url);

		}
}
