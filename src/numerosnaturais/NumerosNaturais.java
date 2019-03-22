/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosnaturais;

/**
 *
 * @author aluno
 */
public class NumerosNaturais {

    private int numeroNatural = 0; 

    public int getNumeroNatural1() {
        return numeroNatural;
    }

    public void setNumeroNatural(int numeroNatural) {
        this.numeroNatural = numeroNatural;
    }

    public String verificarNumeroNatural() throws Exception {
        if (this.numeroNatural < 0) {
            throw new Exception("Valores negativos não esta no conjunto dos numeros naturais");
        }
        return null;
    }

    public long calcularFatorial() throws Exception {
        long fatorial = this.numeroNatural;
        if (fatorial > 20) {
            throw new Exception("Sistema só calcula ate o fatorial de 20");
        }

        int aux = this.numeroNatural;
        while (aux > 1) {
            fatorial = fatorial * (aux - 1);
            aux--;
        }
        return (long) fatorial;
    }

    public boolean verificarNumeroPerfeito() {
        double raiz = Math.sqrt(this.numeroNatural);
        int soma = 1;
        for (int i = 2; i < raiz; ++i) {
            if (this.numeroNatural % i == 0) {
                soma += i + this.numeroNatural / i;
            }
        }
        if (raiz == (int) raiz) {
            soma += (int) raiz;
        }
        return this.numeroNatural == soma;
    }

    public boolean verificarSeCapicua() {
        String inverso = Integer.toString(this.numeroNatural);
        String aux = Integer.toString(this.numeroNatural);
        char numeroString[] = inverso.toCharArray();
        String temporaria = "";
        for (int i = inverso.length() - 1; i >= 0; i--) {
            temporaria += String.valueOf(numeroString[i]);
        }
        return aux.equals(temporaria);
    }

    public boolean verificarQuadradoPerfeito(int numeroNatural) {
        double raiz = Math.sqrt(numeroNatural);
        int aux = (int) raiz;
        return Math.pow(aux, 2) == numeroNatural;
    }

    public boolean verificarNumeroPrimo() {
        int auxiliar = 0;
        for (int i = 1; i <= this.numeroNatural; i++) {
            if (this.numeroNatural % i == 0) {
                auxiliar++;
            }
        }
        return auxiliar == 2;
    }

    public int calcularMDC(int numeroNatural) throws Exception {
        int auxiliar = this.numeroNatural;
        if (auxiliar == 0 || numeroNatural == 0) {
            throw new Exception("MDC com um valor nulo, não é calculado ");
        }
        while (numeroNatural != 0) {
            int resto = auxiliar % numeroNatural;
            auxiliar = numeroNatural;
            numeroNatural = resto;
        }
        return auxiliar;
    }

    public int calcularMMC(int numeroNatural) throws Exception {
        int resultado = this.numeroNatural;
        if (resultado == 0 || numeroNatural == 0) {
            throw new Exception("MMC com um valor nulo, não é calculado");
        }
        if (this.numeroNatural < numeroNatural) {
            int aux = this.numeroNatural;
            this.numeroNatural = numeroNatural;
            numeroNatural = aux;
        }
        while (resultado % numeroNatural != 0) {
            resultado += this.numeroNatural;
        }
        return resultado;
    }
}
