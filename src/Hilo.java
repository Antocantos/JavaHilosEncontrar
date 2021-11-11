public class Hilo extends Thread{

    int[] miarray;
    int posicion;
    int valorBuscado;

    public int[] getMiarray() {
        return miarray;
    }

    public void setMiarray(int[] miarray) {
        this.miarray = miarray;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getValorBuscado() {
        return valorBuscado;
    }

    public void setValorBuscado(int valorBuscado) {
        this.valorBuscado = valorBuscado;
    }

    public Hilo(int[] paramArray, int valorBuscado){

        this.miarray = paramArray;

    }

    @Override
    public void run() {
        posicion=encontrar(valorBuscado);
    }

    public int encontrar(int valor){
        int p=0;
        int respuesta = 0;

        while(p < miarray.length && miarray[p]!=valor){
            p++;

        }
        respuesta = (p==miarray.length) ? -1 : p; // Valor = condicion ? true:false;
        return p;
    }

}
