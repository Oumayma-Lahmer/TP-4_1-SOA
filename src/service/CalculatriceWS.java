package service;

import javax.jws.*;

/*pour rendre cette class un service web, il faut ajouter les annotations JAX-WS pour auto-générer
 *  le document WSDL par le serveur d'application au moment du déploiement
 */
@webService(name="CalculWS")
public class CalculatriceWS {

	@webMethod(operationName="somme")
	public double somme(@webParam(name="valeur1") double a, @webParam(name="valeur2")  double b) {
		return a+b;
	}
}
