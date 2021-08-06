/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materiales;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ClsMaterial {
    private String Material;
    private double Val_factura;
    private int No_unidades;
    private double Peso;
    
    
     public static void llenaInformacion(){
        Scanner t = new Scanner(System.in);
        
        
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.Material = Material;
    }

    /**
     * @param Val_factura the Val_factura to set
     */
    public void setVal_factura(double Val_factura) {
        this.Val_factura = Val_factura;
    }

    /**
     * @param No_unidades the No_unidades to set
     */
    public void setNo_unidades(int No_unidades) {
        this.No_unidades = No_unidades;
    }

    /**
     * @return the Material
     */
    public String getMaterial() {
        return Material;
    }

    /**
     * @return the Val_factura
     */
    public double getVal_factura() {
        return Val_factura;
    }

    /**
     * @return the No_unidades
     */
    public int getNo_unidades() {
        return No_unidades;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
}
