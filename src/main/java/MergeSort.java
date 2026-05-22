
public class MergeSort implements SortingStrategy {

    /**
    * Implemente o método abaixo, que recebe dois arrays ordenados em forma crescente
    * e retorna um novo array também ordenado em forma crescente.
    */
    public int[] mergeOrdenadosCrescente(int[] a, int[] b) {
        int[] v = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                v[k] = a[i];
                i++;
            }
            else {
                v[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            v[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            v[k] = b[j];
            j++;
            k++;
        }
        return v;
    }
    
    /**
    * Implemente o método abaixo, que recebe dois arrays ordenados em forma decrescente
    * e retorna um novo array ordenado em forma crescente.
    */
    public int[] mergeOrdenadosDecrescente(int[] a, int[] b) {
        int[] v = new int[a.length + b.length];
        int i = a.length - 1;
        int j = b.length - 1;
        int k = 0;
        while (i >= 0 && j >= 0) {
            if (a[i] <= b[j]) {
                v[k] = a[i];
                i--;
            }
            else {
                v[k] = b[j];
                j--;
            }
            k++;
        }
        while (i >= 0) {
            v[k] = a[i];
            i--;
            k++;
        }
        while (j >= 0) {
            v[k] = b[j];
            j--;
            k++;
        }
        return v;
    }
   
    /**
    * Implemente o método abaixo, que recebe dois arrays: a, ordenado em forma crescente e b, ordenado
    * em forma descrescente. Seu método deve retornar um array ordenado em forma crescente.
    */
    public int[] mergeOrdenadosDistintos(int[] a, int[] b) {
        int[] v = new int[a.length + b.length];
        int i = 0;
        int j = b.length - 1;
        int k = 0;
        while (i < a.length && j >= 0) {
            if (a[i] <= b[j]) {
                v[k] = a[i];
                i++;
            }
            else {
                v[k] = b[j];
                j--;
            }
            k++;
        }
        while (i < a.length) {
            v[k] = a[i];
            i++;
            k++;
        }
        while (j >= 0) {
            v[k] = b[j];
            j--;
            k++;
        }
        return v;
    }
   
    /**
    * Implemente a versão clássica do merge sort que vimos em sala de aula. Você pode
    * criar métodos auxiliares se precisar.
    */
    public void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int middle = (ini+fim)/2;
            sort(v, ini, middle);
            sort(v, middle+1, fim);

            merge(v, ini, middle, fim);
        }
    }
    private void merge(int[] v, int left, int meio, int right) {
        int[] helper = new int[v.length];
        for (int i = left; i <= right; i ++) {
            helper[i] = v[i];
        }
        int i = left;
        int j = meio + 1;
        int k = left;

        while (i <= meio && j <= right) {
            if (helper[i] <= helper[j]) {
                v[k] = helper[i];
                i++;
            }
            else {
                v[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            v[k] = helper[i];
            i++;
            k++;
        }
    }
}