/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_poste;

/**
 *
 * @author lucascarabattoli
 */
public class MainPosta {
    
public static void main (String[] args) {

ListaClienti listaClienti = new ListaClienti ();

Thread arriviThread = new Thread (new Arrivi (listaClienti)) ;

Thread sportelloThread = new Thread (new Sportello (listaClienti));

arriviThread. start () ;

sportelloThread. start ();

}
}