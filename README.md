# Identificação

* Nome: Ewerthon Tavares
* Email (@ccc): ewerthon.tavares@ccc.ufcg.edu.br
* Matrícula: 121210726

# Roteiro: Ordenação $n*logn$

## Material Teórico 

[Merge Sort](https://joaoarthurbm.github.io/eda/posts/merge-sort/)

[Quick Sort](https://joaoarthurbm.github.io/eda/posts/quick-sort/)

[Particionamento Hoare](https://joaoarthurbm.github.io/eda/posts/particionamento-hoare/)

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/main/java/** no formato de asserts.

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `javac *.java` em **/src/main/java/**

> Executando os testes: `java -ea QuickSortAsserts` em **/src/main/java/**

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação $n*logn$.

Você vai ver que o design do código do template envolve a interface SortingStrategy e que ambos, MergeSort e QuickSort implementam essa interface. Isso vai facilitar a minha vida no futuro.

## A tarefa. 

### Implementação e testes


**MergeSort.** Comece pelos variados métodos de merge que criei. A explicação do que fazer está como comentário no código. Depois passe para o método de ordenação clássico (que pode ou não usar os métodos que você fez anteriormente). Seu objetivo é passar nos testes que disponibilizei.

**QuickSort.** A explicação do que fazer está como comentário no código.

Ah...confira (sempre!) se você passa nos testes: `java -ea QuickSortAsserts`.

Óbvio que você pode simplesmente copiar código da Internet e colar lá. Eu mesmo disponibilizo código. Mas, conselho, assim você não aprende :)

### Teoria

Perguntas importantes:
  
  * Qual o pior caso do merge sort? e o melhor? e o caso médio? Por que?

  > O merge sort é sempre n*log(n).
  
  * Qual o pior caso do quick sort?

  > Quando o pivot escolhido é o menor ou o maior valor, o que faz com que o particionamento seja pouco efetivo e o problema seja resolvido muito aos poucos.

  * Que estratégias discutimos para escolher bons pivots?

  > Usar o primeiro elemento do array, o que não é uma boa estratégia por resolver pouco o problema; Escolher por mediana de 3, o que é melhor do que o método anterior, mas tem um custo; Escolher aleatoriamente, o que tem baixo custo e garante um bom desempenho médio.

  * Explique a mediana de 3 como estratégia para escolher um pivot.

  > Pegamos os valores que estão no início, meio e fim do array, e comparamos para descartamos o maior e menor valor, e usamos o do meio como pivot. Assim, asseguramos que o pivot não vai ter viés em sua escolha.

  * O merge sort é in-place? Explique.

  > Não. Ele não faz as trocas dentro do próprio array, o que faz com que ele não seja in-place. Em seu algoritmo, ele utiliza uma estrutura auxiliar (array auxiliar) para a ordenação.

  * O quick sort é in-place? Explique.

  > Sim. O quick sort faz a ordenação dentro do próprio array.
  
    
## Mais estudo

Implemente as seguintes questões no tst-eda:

* 

