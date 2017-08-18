/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplooo;

/**Abstract
 *pode ter emplementação de metodo;
 * pode atribuir atributos;
 * e obriga a usar os metodos dela;
 * @author Aluno:Cristhian Gustavo Lourenço, Data:07/12/2017;
 */
public abstract class PessoaAcao {
    private  String nome;
    public abstract void arrumarQuarto();
    public abstract void limparQuarto();
    public abstract void limparCozinha();
    public void limparBanheiro(){
        System.out.println("Limpando o banheiro");
    }
      
    
}
