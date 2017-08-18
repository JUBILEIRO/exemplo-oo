/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplooo;

/**
 *
 * @author Aluno:Cristhian Gustavo Lourenço, Data:07/12/2017;
 */
public class Pessoa extends PessoaAcao implements LazerAcao{

    @Override
    public void arrumarQuarto() {
        System.out.println("Arrumar o Quarto");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Limpando o Quarto");
    }

    @Override
    public void limparCozinha() {
        System.out.println("Limpando a cozinha");
    }
    
        
    }
    
    
