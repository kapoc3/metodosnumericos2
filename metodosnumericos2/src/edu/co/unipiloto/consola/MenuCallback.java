/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.unipiloto.consola;

import java.util.EventListener;


public interface MenuCallback extends EventListener {

    /**
     * funcion que ejecutara el menu
     */
    public void ejecutar();
}
