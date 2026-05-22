import java.util.Arrays;

public class QuickSort implements SortingStrategy {

  
    /*
       A mediana de uma sequência de tamanho ímpar é o valor que divide uma sequência ao meio, isto é, 
       metado dos valores são menores que ela, enquanto metade são maiores. Implemente o método abaixo
       que recebe uma sequência de tamanho ímpar e retorna a mediana dessa sequência.
    */
    public int mediana(int[] v) {
        Arrays.sort(v);
        return v[v.length / 2];
    }

    /**
    * Implemente a versão do quick sort usando o particionamento Hoare, que está descrito
    * neste material: https://joaoarthurbm.github.io/eda/posts/particionamento-hoare/
    */
    public void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int posPivot = particiona(v, ini, fim);

            sort(v, ini, posPivot - 1);
            sort(v, posPivot + 1, fim);
        }
        }
    public int particiona(int[] v, int ini, int fim) {
        int pivot = v[ini];
        int i = ini + 1;
        int j = fim;

        while (i <= j) {
            while (i <= j && v[i] <= pivot) {
                i++;
        }
            while (j >= i && v[j] > pivot) {
                j--;
        }
            if (i < j) {
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
        }
    }
        int temp = v[ini];
        v[ini] = v[j];
        v[j] = temp;
        return j;
    }


    /**
    * Nós discutimos em sala de aula que uma tentativa para melhorar a escolha do pivot é
    * decidir usar o valores mediano (não média, cuidado) entre o primeiro elemento do array,
    * o elemento central e o último.

    * Implemente o método abaixo que retorna o valor que seria escolhido como pivot seguindo
    * a abordagem acima.
    * 
    * Interprete os testes para saber qual valor usar como elemento central para calcular a mediana de três.
    */
    public int medianaDeTres(int[] v) {
        int meio = v[(v.length - 1) / 2];
        int[] tres = {v[0], meio, v[v.length - 1]};
        Arrays.sort(tres);
        return tres[1];
    }

}