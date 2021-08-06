/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial1;

import com.materiales.ClsMaterial;
import com.operaciones.ClsOp;

/**
 *
 * @author carlo
 */
public class ClsPrincipal {
    public static void main(String[] args) {
        ClsMaterial material = new ClsMaterial();
        ClsOp matrix = new ClsOp(4);
        
        material.setMaterial("Bolsa_cemento");
        material.setNo_unidades(50);
        material.setVal_factura(60);
        material.setPeso(50);
        matrix.AddMaterial(material);
        
        material.setMaterial("Bolsa_Cal");
        material.setNo_unidades(150);
        material.setVal_factura(40);
        material.setPeso(20);
        matrix.AddMaterial(material);
        
        material.setMaterial("Tubos_PC");
        material.setNo_unidades(200);
        material.setVal_factura(55);
        material.setPeso(10);
        matrix.AddMaterial(material);
        
        material.setMaterial("Quintales_Hierro");
        material.setNo_unidades(50);
        material.setVal_factura(350);
        material.setPeso(50);
        matrix.AddMaterial(material);
        System.out.println("=========== Imprime matrix ===========");
        matrix.imprimirDecorado();
        matrix.ValorTotal();
        matrix.PesoTotal();
        matrix.GastosAlValor();
        matrix.GastosAlPeso();
        matrix.Sumatoria();
        matrix.CostoTotal();
        System.out.println("=========== Imprime matrix ===========");
        matrix.imprimirDecorado();
    }
    
}
