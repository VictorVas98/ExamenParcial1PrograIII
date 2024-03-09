public class Main {

    public static void main(String[] args)
    {
        int[] arr = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        System.out.println("Arreglo original: ");
        imprimirArreglo(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Arreglo ordenado: ");
        imprimirArreglo(arr);
    }
    public static void quickSort(int[] arr, int largo, int alto){
        if(largo<alto){
            int pi = particion(arr,largo,alto);
            quickSort(arr, largo, pi-1);
            quickSort(arr, pi+1,alto);
        }
    }
    public static int particion(int[] arr, int largo, int alto){
        int pivote = arr[alto];
        int i = (largo -1);
        for (int j = largo; j < alto; j++){
            if ( arr[j]<pivote){
                i++;
                int temporal = arr[i];
                arr[i] = arr[j];
                arr[j] = temporal;
            }
        }
        int temporal = arr[i+1];
        arr[i+1] = arr[alto];
        arr[alto]= temporal;
        return i+1;
    }
    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}