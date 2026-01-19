package grauB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pessoa {

    protected List<Telesena> telesenas;
    protected String nome;

    public Pessoa(String nome) {
        this.telesenas = new ArrayList<>();
        this.nome = nome;
    }

    public List<Telesena> getTelesenas() {
		return telesenas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void gerarTelesenas() {
        Random rand = new Random();
        int numeroDeTelesenas = rand.nextInt(1, 15);

        for (int cont = 1; cont <= numeroDeTelesenas; cont++) {
            Telesena telesena = new Telesena();
            telesena.gerarJogos();
            telesenas.add(telesena);
        }
    }

	@Override
	public String toString() {
		return "Pessoa [telesenas=" + telesenas.toString() + ", nome=" + nome + "]";
	}
}