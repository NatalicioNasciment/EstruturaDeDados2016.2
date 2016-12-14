package exercicio16;

public class ArvoreBinaria {
	private No root;

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public int getAltura() {
		return getAltura(this.root);
	}

	private int getAltura(No root) {
		if (root == null) {
			return 0;
		}
		int altEsq = getAltura(root.getNoEsquerda());
		int altDir = getAltura(root.getNoDireita());
		if (altEsq > altDir) {
			return altEsq + 1;
		} else {
			return altDir + 1;
		}
	}

	public int getQtdNode() {
		return getQtdNode(root);
	}

	private int getQtdNode(No root) {
		if (root == null) {
			return 0;
		}
		int qtdNodeEsq = getQtdNode(root.getNoEsquerda());
		int qtdNodeDireita = getQtdNode(root.getNoDireita());
		return qtdNodeEsq + qtdNodeDireita + 1;
	}

	public void inserir(int valor) {
		inserir(this.root, valor);
	}

	public void inserir(No node, int valor) {
		if (this.root == null) {
			this.root = new No(valor);
		} else {
			if (valor < node.getValor()) {
				if (node.getNoEsquerda() != null) {
					inserir(node.getNoEsquerda(), valor);
				} else {
					node.setNoEsquerda(new No(valor));
				}
			} else if (valor > node.getValor()) {
				if (node.getNoDireita() != null) {
					inserir(node.getNoDireita(), valor);
				} else {
					node.setNoDireita(new No(valor));
				}
			}
		}
	}

	public No remover(int valor) throws Exception {
		return remover(this.root, valor);
	}

	private No remover(No node, int valor) throws Exception {
		if (this.root == null) {
			throw new Exception("Árvore vazia");
		} else {
			if (valor < node.getValor()) {
				node.setNoEsquerda(remover(node.getNoEsquerda(), valor));
			} else if (valor > node.getValor()) {
				node.setNoDireita(remover(node.getNoDireita(), valor));
			} else if (node.getNoEsquerda() != null && node.getNoDireita() != null) {
				System.out.println("  Removeu No " + node.getValor());
				node.setValor(encontraMinimo(node.getNoDireita()).getValor());
				node.setNoDireita(removeMinimo(node.getNoDireita()));
			} else {
				System.out.println("  Removeu No " + node.getValor());
				node = (node.getNoEsquerda() != null) ? node.getNoEsquerda() : node.getNoDireita();
			}
			return node;
		}
	}

	private No removeMinimo(No node) {
		if (node == null) {
			System.out.println("  ERRO ");
		} else if (node.getNoEsquerda() != null) {
			node.setNoEsquerda(removeMinimo(node.getNoEsquerda()));
			return node;
		} else {
			return node.getNoDireita();
		}
		return null;
	}

	private No encontraMinimo(No node) {
		if (node != null) {
			while (node.getNoEsquerda() != null) {
				node = node.getNoEsquerda();
			}
		}
		return node;
	}
}
