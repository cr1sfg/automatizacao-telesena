package grauB;

import java.util.*;

public class Telesena {
    protected List<Integer> jogoUm;
    protected List<Integer> jogoDois;

    public Telesena() {
        this.jogoUm = new ArrayList<>();
        this.jogoDois = new ArrayList<>();
    }

    public void gerarJogos() {
        List<Integer> numerosSorteados = new ArrayList<>();
        Random rand = new Random();
        for (int cont = 1; cont <= 25; cont++) {
            int numero = rand.nextInt(1, 60);
            while (numerosSorteados.contains(numero)) {
                numero = rand.nextInt(1, 60);
            }
            jogoUm.add(numero);
            numerosSorteados.add(numero);
        }
        Collections.sort(jogoUm);
        numerosSorteados = new ArrayList<>();
        for (int cont = 1; cont <= 25; cont++) {
            int numero = rand.nextInt(1, 60);
            while (numerosSorteados.contains(numero)) {
                numero = rand.nextInt(1, 60);
            }
            jogoDois.add(numero);
            numerosSorteados.add(numero);
        }
        Collections.sort(jogoDois);
    }

    public List<Integer> getJogoUm() {
        return jogoUm;
    }

    public void setJogoUm(List<Integer> jogoUm) {
        this.jogoUm = jogoUm;
    }

    public List<Integer> getJogoDois() {
        return jogoDois;
    }

    public void setJogoDois(List<Integer> jogoDois) {
        this.jogoDois = jogoDois;
    }

	@Override
	public String toString() {
		return "Telesena [jogoUm=" + jogoUm + ", jogoDois=" + jogoDois + "]";
	}
}