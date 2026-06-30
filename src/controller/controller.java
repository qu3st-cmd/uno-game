package controller;

import model.Baralho;
import view.Janela;

public class Controller {

    private Baralho baralho;
    private Janela janela;

    public Controller() {
        this.baralho = new Baralho();
        this.janela = new Janela();
    }

    public void mostrarBaralho() {
        for(int i = baralho.getCartas().size() - 1; i >= 0; i--) {
            if(baralho.getCartas().get(i) instanceof model.CartaNumerada) {
                System.out.println(baralho.getCartas().get(i).getCor() + " " + baralho.getCartas().get(i).getTipo() + " " + ((model.CartaNumerada) baralho.getCartas().get(i)).getNumero());
            } else if(baralho.getCartas().get(i) instanceof model.CartaEspecial) {
                System.out.println(baralho.getCartas().get(i).getCor() + " " + baralho.getCartas().get(i).getTipo() +" " + ((model.CartaEspecial) baralho.getCartas().get(i)).getEfeito());
            }
        }
    }

}
