# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Ordenação $n^2$

## Material Teórico

[Selection Sort](https://joaoarthurbm.github.io/eda/posts/selection-sort/)

[Insertion Sort](https://joaoarthurbm.github.io/eda/posts/insertion-sort/)

## O template

> Não altere o arquivo build.gradle

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `gradle compileJava` na raiz do projeto.

> Executando os testes: `gradle test` na raiz do projeto.

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação $O(n^2)$.

Você vai ver que o design do código do template envolve a interface SortingStrategy e que ambos, InsertionSort e SelectionSort implementam essa interface. Isso vai facilitar a minha vida no futuro.


## A tarefa. 

### Implementação e testes


**InsertionSort.** Comece pelo insertion. Mais precisamente, pelos dois métodos de inserção ordenada. Depois passe para o método de ordenação clássico (que pode ou não usar os métodos que você fez anteriormente) e a sua implementação recursiva. Seu objetivo é passar nos testes que disponibilizei.

**SelectionSort.** Nem sempre os testes serão entregues. Você deve ser capaz de fazer seus próprios testes. Para o selection, além de implementar os dois métodos que foram pedidos, você deverá criar também uma classe de teste no diretório `src/test/java`. Inspire-se nos testes que criei para o insertion.

Ah...confira (sempre!) se você passa nos testes: `gradle test`.

### Teoria

Perguntas importantes:
  * Qual o pior caso do insertion sort?

  > INSIRA SUA RESPOSTA AQUI

  * Qual o pior caso do selection sort?

  > INSIRA SUA RESPOSTA AQUI

  * Em termos de trocas, como você compararia o insertion sort e o selection sort?

  > INSIRA SUA RESPOSTA AQUI

  * Em termos de comparaçõeas, como você compararia o insertion sort e o selection sort?

  > INSIRA SUA RESPOSTA AQUI

  * Mostre com um exemplo concreto que o selection não é estável.

  > INSIRA SUA RESPOSTA AQUI

  * O insertion é estável? Argumente com um exemplo concreto.

    
## Mais estudo

Implemente as seguintes questões no tst-eda:

* Insere Último
* Insere Primeiro
* InsertionSort Recursivo
* Selection sort passo a passo
* SelectionSort Recursivo
* Mariana e os livros

## Entregando o lab

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do gradle (compileJava e test).

> Passo 2. Certifique-se de que você respondeu as perguntas teóricas onde foi indicado aqui no README.

> Passo 3. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando o lab"`
  * `git push origin main`
