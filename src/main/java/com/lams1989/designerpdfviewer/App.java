package com.lams1989.designerpdfviewer;

public class App 
{
    public static void main( String[] args )
    {
    	
    	int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    	String word = "luis";
    	
    	int prueba = DesignerPDFViewer.designerPdfViewer(h, word);
    	System.out.println(prueba);
    }
}
