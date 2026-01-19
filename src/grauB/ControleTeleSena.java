package grauB;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ControleTeleSena {

    private List<Pessoa> pessoas;
    private List<Integer> numerosSorteados;

    public ControleTeleSena() {
        this.pessoas = new ArrayList<>();
        this.numerosSorteados = new ArrayList<>();
    }

	public void gerarPessoas() {
		File arquivoPessoas = new File("pessoas.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(arquivoPessoas);
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				Pessoa pessoa = new Pessoa(linha);
				pessoa.gerarTelesenas();
				pessoas.add(pessoa);
			}
		    
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
    }
    
    public int quantTelesenasVendidas() {
    	try{
    		Thread.sleep(1000);
    		} catch(Exception e){
    			System.out.println("Erro na execução do programa");
    		}
    	int quantTelesenas = 0;
    	for(Pessoa pessoa : pessoas) {
    		quantTelesenas += pessoa.getTelesenas().size();
    	}
		return quantTelesenas;
    }
    
    public double valorPremio() {
    	try{
    		Thread.sleep(1000);
    		} catch(Exception e){
    			System.out.println("Erro na execução do programa");
    		}
    	double valorPremio = 0.8 * quantTelesenasVendidas() * 10;	
    	return valorPremio;
    }
    
    public double lucroObtido() {
    	try{
    		Thread.sleep(1000);
    		} catch(Exception e){
    			System.out.println("Erro na execução do programa");
    		}
    	double lucroObtido = 0.2 * quantTelesenasVendidas() * 10;
		return lucroObtido;
    }
    
    public List<Integer> sorteador() {
    	try{
    		Thread.sleep(1000);
    		} catch(Exception e){
    			System.out.println("Erro na execução do programa");
    		}
    	Random rand = new Random();
    	for (int cont = 1; cont <= 25; cont++) {
            int numero = rand.nextInt(1, 60);
			while (numerosSorteados.contains(numero)) {
                numero = rand.nextInt(1, 60);
            }
            numerosSorteados.add(numero);
        }
    	Collections.sort(numerosSorteados);
		return numerosSorteados;
    }
    
    public List<Pessoa> verificadorGanhador() {
    	List<Pessoa> ganhadores = new ArrayList<Pessoa>();
    	try {
    		Thread.sleep(800);
    	} catch (Exception e) {
    		System.out.println("Erro na execução do programa");
    	}
	    for (Pessoa pessoa : pessoas) {
			for (Telesena telesena : pessoa.telesenas) { 
				if (numerosSorteados.containsAll(telesena.getJogoUm()) || numerosSorteados.containsAll(telesena.getJogoDois())) {
					ganhadores.add(pessoa);
				}
			}	
	    }
		return ganhadores;
	}
    
    public int sorteadorUnitario(){
		Random rand = new Random();
		int numero = rand.nextInt(1, 60);
		while(numerosSorteados.contains(numero)) {
			numero = rand.nextInt(1, 60);
		}
		numerosSorteados.add(numero);
		Collections.sort(numerosSorteados);
		return numero;
    }
    
    public double premioPorPessoa(int numeroDeGanhadores) {
    	return valorPremio() / numeroDeGanhadores;
    }
}