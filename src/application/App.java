
package application;

import controller.Controller;
/**
 *
 * @author Thiago Gabriel da Silva Oliveira
 * @author Coloquem os nomes aqui!
 */

public class App {
    
    public static void main(String[] args) {
        System.out.println("[System] Iniciando o Uno");
        Controller gerenciadorJogo = new Controller();
        
        gerenciadorJogo.mostrarBaralho();
        
        
    }
    
}
