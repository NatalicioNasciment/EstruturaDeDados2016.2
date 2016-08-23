package exercicio03;

public class TestVeiculos {

	public static void main(String[] args) {
		Veiculos ls = new Veiculos(19000, 12, 2);
		ls.setModelo("LS");
		ls.setMarca("Guerra");
		ls.setAno(1999);
		System.out.println("Caminhão da marca "+ls.getMarca() + " e o modelo " + ls.getModelo() + " e ano " + ls.getAno() + 
		" tem a capacidade de levar "+ ls.getCapacidade() + " kg e levou "+ ls.getTempo() + " h para cada viagem e portanto fez "
	    + ls.getNumVisitas() +" vizitas");
	}

}
