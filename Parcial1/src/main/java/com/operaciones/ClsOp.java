/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operaciones;

import com.materiales.ClsMaterial;

/**
 *
 * @author carlo
 */
public class ClsOp {
    private static String[][] operaciones = new String [4][8];
    
    private static final int MATERIAL = 0;
    private static final int NO_UNIDADES = 1;
    private static final int VAL_FACTURA = 3;
    private static final int GASTO_VALOR = 4;
    private static final int PESO = 2;
    private static final int GASTO_PESO = 5;
    private static final int COSTO_UNIDAD = 6;
    private static final int COSTO_TOTAL = 7;
    
    private static final int SEGURO_LOCAL = 3500;
    private static final int FLETES = 2500;
    private static final int IMPUESTOS = 5000;
    private static final int ACARREO = 5000;
    private static final int COM_BANCARIAS = 200;
    
    private static final int TOTAL_GASTOV = SEGURO_LOCAL + IMPUESTOS + COM_BANCARIAS;
    private static final int TOTAL_GASTOP = FLETES + ACARREO;
    
    private int filaActual = 0;
    private double var = 0;
    
    private final int MAX_FILAS = 4;
    private final int MAX_COLUMNAS = 8;
    private double Coeficiente = 0;
    private double CoeficienteP = 0;
    
    private int totalFilas = 0;
    
    public ClsOp (int filas){
        if (filas > MAX_FILAS){
            throw(new IllegalArgumentException());
        }else{
            totalFilas = filas;
            operaciones = new String[totalFilas][MAX_COLUMNAS];
        }
    }
    public static void imprimirDecorado(){
        for (int x=0; x<operaciones.length; x++){
            System.out.print("|");
            for(int y=0; y<operaciones[x].length; y++){
                System.out.print(operaciones[x][y]);
                if(y!=operaciones[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    public String AddMaterial(ClsMaterial mat){
        if (filaActual >= MAX_FILAS){
            return "Ya llegaste al tope";
        }else{
            operaciones[filaActual][MATERIAL] = mat.getMaterial();
            operaciones[filaActual][NO_UNIDADES] = mat.getNo_unidades()+"";
            operaciones[filaActual][VAL_FACTURA] = mat.getVal_factura()+"";
            operaciones[filaActual][PESO] = mat.getPeso()+"";
            filaActual ++;
        }
        return "Ok!";
    }
    
    public double PesoTotal(){
        double total = 1;
        double TotalP = 0;
         
        for (int x = 0; x < MAX_FILAS; x++){
             for (int y = 2; y < 3; y++){
             String fil = operaciones[x][y];
             total = Double.parseDouble(operaciones[x][1]);
             total = total*Double.parseDouble(fil);
             TotalP = TotalP + total;
         }
        }
        CoeficienteP = TOTAL_GASTOP/TotalP;
        return TotalP;
    }
    public double ValorTotal(){
         double total = 1;
         double TotalM = 0;
         
        for (int x = 0; x < MAX_FILAS; x++){
             for (int y = 3; y < 4; y++){
             String fil = operaciones[x][y];
             total = Double.parseDouble(operaciones[x][1]);
             total = total*Double.parseDouble(fil);
             TotalM = TotalM + total;
         }
        }
        Coeficiente = TOTAL_GASTOV/TotalM;
        return TotalM;
     }
    public double GastosAlValor(){
        double total = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            total = Double.parseDouble(operaciones[y][VAL_FACTURA])*Coeficiente;
            operaciones[y][GASTO_VALOR] = total+"";
        }
        return total;
    }
    public double GastosAlPeso(){
       double total = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            total = Double.parseDouble(operaciones[y][PESO])*CoeficienteP;
            operaciones[y][GASTO_PESO] = total+"";
        }
        return total;
    }
    
    public double Sumatoria(){
        double total = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            for (int x = 3; x < COSTO_UNIDAD; x++){
                total = total + Double.parseDouble(operaciones[y][x]);
            }
            operaciones[y][COSTO_UNIDAD] = total+"";
            total = 0;
        }
        return total;
    }
    public double CostoTotal(){
        double total = 0;
        double GranTotal = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            total = Double.parseDouble(operaciones[y][COSTO_UNIDAD])*Double.parseDouble(operaciones[y][NO_UNIDADES]);
            operaciones[y][COSTO_TOTAL] = total+"";
            GranTotal = total + GranTotal;
        }
        System.out.println("El Gran Total es de: "+GranTotal);
        return total;
    }
    
    
}
