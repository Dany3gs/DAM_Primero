package com.ieselrincon;

public class almacenPabellon {
    // Propiedades de la Clase almacen
    public String sNomCentro;
    public int iNumArticulosRetirados;

    public int iNumArticulosEnAlmacen;

    public almacenPabellon(String nomCentro, int numArticulosRetirados, int numArticulosEnAlmacen) {
        this.sNomCentro = nomCentro;
        this.iNumArticulosRetirados = numArticulosRetirados;
        this.iNumArticulosEnAlmacen = numArticulosEnAlmacen;
    }



    /* Método para retirar los articulos

    Posibles valores de códigos de respuesta:

    0-> Préstamo correcto
    1-> No se puede retirar un número de artículos <= 0
    2-> No se puede retirar un número de artículos mayor que el número de artículos disponibles
    */

    public int retirarArticulos(int cantidad)
    {
        int iCodResult;

        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar un número de artículos <= 0");
            iCodResult = 1;
        }
        else if (cantidad > iNumArticulosEnAlmacen)
        {
            System.out.println("No se puede retirar un número de artículos mayor que el número de artículos disponibles");
            iCodResult = 2;
        }
        else
        {
            iNumArticulosEnAlmacen = iNumArticulosEnAlmacen - cantidad;
            iNumArticulosRetirados = iNumArticulosRetirados + cantidad;
            iCodResult = 0;
        }

        return iCodResult;
    }

    /* Metodo para devolución de articulos . Modifica el número de artículos disponibles.

    Posibles valores de códigos de respuesta:

    6-> Artículo devuelto correctamente
    7-> No se puede devolver un número de artículos <= 0
    8-> No se puede devolver un número de artículos mayor que el número de artículos retirados

    */
    public int devolverArticulos(int cantidad)
    {
        int iCodResult;
        if (cantidad <= 0)
        {
            System.out.println("No se puede devolver un número de artículos <= 0");
            iCodResult = 7;
        }
        else if ( cantidad > iNumArticulosRetirados)
        {
            System.out.println("No se puede devolver un número de artículos mayor que el número de artículos retirados");
            iCodResult = 8;
        }
        else
        {
            iNumArticulosEnAlmacen = iNumArticulosEnAlmacen + cantidad;
            iNumArticulosRetirados = iNumArticulosRetirados - cantidad;
            iCodResult = 6;
        }
        return iCodResult;
    }


}

