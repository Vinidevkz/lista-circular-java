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
		doublyCircleListController.adicionarValor(list, new Pagina("fatec.com", "{code}", "//"));
		System.out.println(list.getSize());
		
		Pagina pagina1 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina1);
		System.out.println(list.getSize());
		
		Pagina pagina2 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina2);
		System.out.println(list.getSize());
		
		Pagina pagina3 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina3);
		System.out.println(list.getSize());
		
		doublyCircleListController.adicionarValor(list, new Pagina("steam.com", "{code}", "//"));
		doublyCircleListController.adicionarValor(list, new Pagina("youtube.com", "{code}", "//"));
		
		Pagina pagina4 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina4);
		System.out.println(list.getSize());
		
		Pagina pagina5 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina5);
		System.out.println(list.getSize());
		
		Pagina pagina6 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina6);
		System.out.println(list.getSize());
		
		Pagina pagina7 = doublyCircleListController.lerPagina(list);
		System.out.println(pagina7);
		System.out.println(list.getSize());

	}

}
