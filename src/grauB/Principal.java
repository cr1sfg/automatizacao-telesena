package grauB;

import java.util.List;

public class Principal {
    public static void main(String args[]) {
        ControleTeleSena controlador = new ControleTeleSena();
        controlador.gerarPessoas();
        System.out.println("============================================");
        System.out.println("Ma oi!! Quem quer dinheiro??? \n");
        System.out.println("============================================");
        System.out.println("A quantidade de telesenas vendidas foi de: " + controlador.quantTelesenasVendidas() + "\n");
        System.out.println("O valor do prêmio é de: " + controlador.valorPremio() + "\n");
        System.out.println("O valor de lucro da casa é de: " + controlador.lucroObtido() + "\n");
        System.out.println("============================================");
        System.out.print("Os primeiros 25 numeros sorteados são: ");
        
        for(int numero : controlador.sorteador()) {
    		try{
        		Thread.sleep(500);
        		} catch(Exception e){
        			System.out.println("Erro na execução do programa");
        		}
    		System.out.print(numero + ", ");
    	}
    
        List<Pessoa> ganhadores = controlador.verificadorGanhador();
        if (!ganhadores.isEmpty()) {
        	if (ganhadores.size() == 1) {
        		System.out.println("Ganhador é " + ganhadores.getFirst().getNome());
        	} else {
        		System.out.println("Houveram " + ganhadores.size() + " ganhadores");
        		for (Pessoa pessoa : ganhadores) {
        			System.out.println("Ganhador: " + pessoa.getNome());
        		}
        	}
        	System.out.println("O premio por pessoa será: " + controlador.premioPorPessoa(ganhadores.size()));
        } else {
        	System.out.println("\n\nSem ganhadores, sorteando novo número: \n"); 
        	while (ganhadores.isEmpty()) {
        		System.out.println(controlador.sorteadorUnitario());
        		ganhadores = controlador.verificadorGanhador();
        	}
        	if (ganhadores.size() == 1) {
        		System.out.println("Ganhador é " + ganhadores.getFirst().getNome());
        	} else {
        		System.out.println("Houveram " + ganhadores.size() + " ganhadores");
        		for (Pessoa pessoa : ganhadores) {
        			System.out.println("Ganhador: " + pessoa.getNome());
        		}
        	}
        	System.out.println("O premio por pessoa será: " + controlador.premioPorPessoa(ganhadores.size()));
        }
    }
}