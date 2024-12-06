package com.ieselrincon;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // Depuracion. Se detiene siempre
        almacenPabellon oProducto = new almacenPabellon("IES El Rincón",0,100);
        int resultRetirarArticulos;
        int resultDevolverArticulos;

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Centro Nombre : " + oProducto.sNomCentro);
        System.out.println("Núm. artículos en el almacén - (Inicial): " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados (Inicial): " + oProducto.iNumArticulosRetirados);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a retirar: -10");
        resultRetirarArticulos = oProducto.retirarArticulos(-10);
        System.out.println("resultRetirarArticulos: " + resultRetirarArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);


        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a retirar: 10");
        resultRetirarArticulos = oProducto.retirarArticulos(10);
        System.out.println("resultRetirarArticulos: " + resultRetirarArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);


        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a retirar: 20");
        resultRetirarArticulos = oProducto.retirarArticulos(20);
        System.out.println("resultRetirarArticulos: " + resultRetirarArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);


        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a retirar: 30");
        resultRetirarArticulos = oProducto.retirarArticulos(30);
        System.out.println("resultRetirarArticulos: " + resultRetirarArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a devolver: 5");
        resultDevolverArticulos = oProducto.devolverArticulos(5);
        System.out.println("resultDevolverArticulos: " + resultDevolverArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a devolver: 30");
        resultDevolverArticulos = oProducto.devolverArticulos(30);
        System.out.println("resultDevolverArticulos: " + resultDevolverArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retirados: " + oProducto.iNumArticulosRetirados);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Artículos a devolver: 300");
        resultDevolverArticulos = oProducto.devolverArticulos(300);
        System.out.println("resultDevolverArticulos: " + resultDevolverArticulos);
        System.out.println("Núm. artículos en el almacén: " + oProducto.iNumArticulosEnAlmacen);
        System.out.println("Núm. artículos retiradoss: " + oProducto.iNumArticulosRetirados);

    }
}