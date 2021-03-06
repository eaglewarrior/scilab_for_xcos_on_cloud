/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.scilab.modules.ui_data;


/**
  * ui_data management
  * @author Vincent COUVERT
  * @author Allan CORNET
  * @copyright INRIA
  */
public class UI_data {

    /**
      * Constructor
      */
    protected UI_data() {
        throw new UnsupportedOperationException();
    }

    /**
    * Put a scilab variable as an array of strings in C envrionment
    * @param lines array of string
    * @param rows the number of rows
    * @param cols the number of cols
    */
    public static void putScilabVariable(String name, String[] lines, int rows, int cols) {
        UI_dataJNI.putScilabVariable(name, lines, rows, cols);
    }


    /**
    * Put a scilab variable as an array of strings in C envrionment
    * @param lines array of string
    * @param rows the number of rows
    * @param cols the number of cols
    */
    public static String getUnnamedVariable() {
        return UI_dataJNI.getUnnamedVariable();
    }

}
