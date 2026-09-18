package ListaCircularDupla.controllers;

import ListaCircularDupla.models.DoublyCircleList;
import ListaCircularDupla.models.Pagina;

public class DoublyCircleListController<T> {
	
	//criar lista
	public DoublyCircleList<T> criarLista() {
		DoublyCircleList<T> doublyCircleList = new DoublyCircleList<>();

		return doublyCircleList;
	}
	
	//add
	public void adicionarValor(DoublyCircleList<T> list, T valor) {
		list.append(valor);
	}
	
	//ler pagina
	public Pagina lerPagina(DoublyCircleList<T> list) {
		return (Pagina) list.ler();
	}

}
