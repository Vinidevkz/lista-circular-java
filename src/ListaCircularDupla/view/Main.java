package ListaCircularDupla.view;

import ListaCircularDupla.controllers.DoublyCircleListController;
import ListaCircularDupla.models.DoublyCircleList;
import ListaCircularDupla.models.Pagina;

public class Main {

	public static void main(String[] args) {
		
		DoublyCircleListController<Pagina> doublyCircleListController = new DoublyCircleListController<>();
		
		DoublyCircleList<Pagina> list = doublyCircleListController.criarLista();
		
		doublyCircleListController.adicionarValor(list, new Pagina("google.com", "{code}", "//"));
		doublyCircleListController.adicionarValor(list, new Pagina("amazon.com", "{code}", "//"));
		doublyCircleListController.adicionarValor(list, new Pagina("twitter.com", "{code}", "//"));
		doublyCircleListController.adicionarValor(list, new Pagina("instagram.com", "{code}", "//"));
		System.out.println(list.getSize());
		
		Pagina pagina1 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina1);
		System.out.println(list.getSize());
		
		Pagina pagina2 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina1);
		System.out.println(list.getSize());
		
		Pagina pagina3 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina1);
		System.out.println(list.getSize());

	}

}
