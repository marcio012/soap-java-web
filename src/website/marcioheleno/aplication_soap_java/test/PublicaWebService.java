package website.marcioheleno.aplication_soap_java.test;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

    public static void main(String[] args) {


        Estoque servico = new Estoque();
        String url = "http://localhost:8080/estoque";

        Endpoint.publish(url, servico);

    }
}
