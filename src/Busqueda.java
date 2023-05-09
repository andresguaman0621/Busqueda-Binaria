public class Busqueda {
    public static int[] generarArreglos(int tamanio, int valorMin, int valorMax) {
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {

            arreglo[i] = valorMin + i % (valorMax - valorMin + 1);
        }
        return arreglo;
    }
    public int busquedaLineal(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        long t2 = System.nanoTime();


        return -1;
    }

    public int busquedaBinaria(int[] nums, int target) {
        int izq = nums[0];
        int dere = nums.length-1;

        while(izq<=dere){
            int medio = (izq+dere)/2;
            if(nums[medio]==target){
                return medio;
            }
            else if(nums[medio]>target){
                izq = medio-1;
            }

            else if(nums[medio]<target){
                izq = medio+1;
            }
        }
        return -1;
    }


}

