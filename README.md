# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Ordenação $n*logn$

## Material Teórico 

[Merge Sort](https://joaoarthurbm.github.io/eda/posts/merge-sort/)

[Quick Sort](https://joaoarthurbm.github.io/eda/posts/quick-sort/)

[Particionamento Hoare](https://joaoarthurbm.github.io/eda/posts/particionamento-hoare/)

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

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação $n*logn$.

Você vai ver que o design do código do template envolve a interface SortingStrategy e que ambos, MergeSort e QuickSort implementam essa interface. Isso vai facilitar a minha vida no futuro.

## A tarefa. 

### Implementação e testes


**MergeSort.** Comece pelos variados métodos de merge que criei. A explicação do que fazer está como comentário no código. Depois passe para o método de ordenação clássico (que pode ou não usar os métodos que você fez anteriormente). Seu objetivo é passar nos testes que disponibilizei.

**QuickSort.** A explicação do que fazer está como comentário no código.

Ah...confira (sempre!) se você passa nos testes: `gradle test`.

Óbvio que você pode simplesmente copiar código da Internet e colar lá. Eu mesmo disponibilizo código. Mas, conselho, assim você não aprende :)

### Teoria

Perguntas importantes:
  
  * Qual o pior caso do merge sort? e o melhor? e o caso médio? Por que?

  > INSIRA AQUI SUA RESPOSTA
  
  * Qual o pior caso do quick sort?

  > INSIRA SUA RESPOSTA AQUI

  * Que estratégias discutimos para escolher bons pivots?

  > INSIRA AQUI SUA RESPOSTA

  * Explique a mediana de 3 como estratégia para escolher um pivot.

  > INSIRA SUA RESPOSTA AQUI

  * O merge sort é in-place? Explique.

  > INSIRA SUA RESPOSTA AQUI

  * O quick sort é in-place? Explique.

  > INSIRA SUA RESPOSTA AQUI
  
    
## Mais estudo

Implemente as seguintes questões no tst-eda:

* 
## Entregando o lab

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do gradle (compileJava e test).

> Passo 2. Certifique-se de que você respondeu as perguntas teóricas onde foi indicado aqui no README.

> Passo 3. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando o lab"`
  * `git push origin main`
