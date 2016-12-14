package exercicio15;

public class ArvoreEnaria {

	public No criaNovoNo(boolean chave) {
		if (chave == false) {
			return null;
		}
		No novo = new No();
		novo.getPrimFilho();
		novo.getProxIrmao();
		return novo;
	}
}
