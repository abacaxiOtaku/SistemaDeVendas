/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class TestarConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarconexao();
            JOptionPane.showMessageDialog(null, "conectado com sucesso ao banco de dados!");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null, "erro ao tentar conectar ao banco de dados!"+ erro.getMessage());
        }
    }
    
}
