package website.marcioheleno.aplication_soap_java.test;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import website.marcioheleno.aplication_soap_java.modelo.item.Item;
import website.marcioheleno.aplication_soap_java.modelo.item.ItemDao;
import website.marcioheleno.aplication_soap_java.modelo.item.ListaItens;

import java.util.List;

@WebService
public class Estoque {

    private ItemDao itemDao = new ItemDao();

    @WebMethod(operationName = "todosOsItens")
    @WebResult(name = "itens")
    public ListaItens getItens() {

        System.out.println("Chamando getItens()");

        List<Item> lista = itemDao.todosItens();
        return new ListaItens(lista);
    }


}
