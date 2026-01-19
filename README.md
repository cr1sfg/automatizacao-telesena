# 🎲 Automatização Telesena

Projeto desenvolvido individualmente durante a graduação em **Análise e Desenvolvimento de Sistemas** na **Unisinos**, como parte da integralização do grau B.  
A proposta foi criar uma forma de **automatizar o sistema da Telesena**, onde todos os elementos (jogos, sorteios e resultados) são gerados de forma **aleatória e automática** na tela.

---

## 🎯 Objetivo
- Fixar conceitos de **Programação Orientada a Objetos (POO)**.  
- Simular o funcionamento da Telesena com geração automática de jogos e sorteios.  
- Implementar regras de negócio como cálculo de prêmios, lucro e verificação de ganhadores.  
- Utilizar arquivos `.txt` para armazenar os participantes.  

---

## 🛠️ Tecnologias Utilizadas
- **Java** → linguagem principal.  
- **POO** → abstração, encapsulamento, herança e polimorfismo.  
- **Arquivos TXT** → leitura e armazenamento dos participantes.  

---

## 📂 Estrutura do Projeto
O sistema foi dividido em classes para aplicar os conceitos de POO:

- **Pessoa.java**  
  - Representa cada participante.  
  - Possui atributos referentes ao indivíduo.  
  - Método `gerarTelesena()` → cria um objeto **Telesena** automaticamente para cada pessoa.  
  - Cada pessoa recebe **2 jogos**, cada jogo com **25 números aleatórios de 1 a 60**.  

- **Telesena.java**  
  - Contém o método `gerarJogo()` → responsável por gerar os números aleatórios de cada jogo.  
  - Representa os bilhetes da Telesena.  

- **ControleTelesena.java**  
  - Gerencia os objetos **Pessoa** e **Telesena**.  
  - Métodos principais:
    - `calculaQuantidadeVendida()` → quantidade de Telesenas vendidas.  
    - `calculaPremio()` → valor do prêmio.  
    - `calculaLucro()` → lucro obtido.  
    - `sorteador()` → sorteia os primeiros 25 números.  
    - `verificaGanhador()` → verifica se houve ganhador na primeira rodada.  
    - `sorteadorUnitario()` → gera novos números aleatórios até que haja ganhador.  
    - `premioPorPessoa()` → calcula o valor do prêmio por número de ganhadores.  

- **Principal.java**  
  - Classe `main`.  
  - Responsável por executar o sistema e chamar os métodos de **ControleTelesena**.  

---

## ✨ Funcionalidades
- Geração automática de jogos para cada pessoa.  
- Sorteio inicial de 25 números.  
- Verificação de ganhadores na primeira rodada.  
- Sorteio unitário contínuo até que haja vencedor.  
- Cálculo de prêmios e divisão entre ganhadores.  
- Cálculo de lucro obtido pela Telesena.  
- Listagem de participantes a partir de arquivo `.txt`.  

---

## 📚 Aprendizados
- Implementação prática de **POO** em Java.  
- Manipulação de arquivos `.txt` para simulação de dados reais.  
- Criação de métodos para regras de negócio complexas.  
- Estruturação modular de classes e responsabilidades.  

---

## 📜 Status
✅ Projeto concluído como parte da integralização do grau B.  
🚧 Futuras melhorias: expandir funcionalidades e integrar com interface gráfica ou front-end.  

---

## 🤝 Contribuição
Este projeto é de caráter acadêmico e pessoal, mas feedbacks e sugestões são sempre bem-vindos!
