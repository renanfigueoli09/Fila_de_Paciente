/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_de_Paciente;

import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class menu {
    Queue <String> Fila = new LinkedList<>();
    
    public int menu(){
         
        
    int escolha = (int) Float.parseFloat(JOptionPane.showInputDialog("1 – Inserir Pacientes \n"+
            "2 – Chamar o paciente para ser atendido \n"+
            "3 – Visualizar Fila (cheia ou vazia)? \n"+
            "4 – Próximo Paciente a ser atendido \n"+
            "5 – Quantidade de Pacientes na fila \n"+
            "6 – Sair"));

    switch(escolha){
               case 1:
                     String nome = JOptionPane.showInputDialog("Insira o nome do paciente");
                     Fila.add(nome);

                   break;
                   
               case 2:
                    String nomeBuscado = JOptionPane.showInputDialog("Pesquise o nome do paciente");
                  Fila.contains(nomeBuscado);
                  String mensagem2 = "chamando o paciente "+nomeBuscado;
            JOptionPane.showMessageDialog(null, mensagem2);
                   break;
                   
               case 3:
            String mens = ""+Fila;
            JOptionPane.showMessageDialog(null, mens);
                   break;
               case 4:
                    String mensagem = "O paciente "+Fila.poll()+" será atendido agora";
            JOptionPane.showMessageDialog(null, mensagem);
                    break;
               case 5:
                   int numeroDePacientes;
                   String mensagem3 = "O número de pacientes na fila é: "+Fila.size();
                   JOptionPane.showMessageDialog(null, mensagem3);
                   break;

                case 6:
                exit(0);
    }
    return menu();
}
}