package com.lams1989.designerpdfviewer;

import junit.framework.TestCase;

public class DesignerPDFViewerTest extends TestCase{

	public void testdesignerPdfViewer(){

    	int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    	String word = "zaba";
    	
    	int prueba = DesignerPDFViewer.designerPdfViewer(h, word);
    	assertEquals(28, prueba);
	}
	
	public void testdesignerPdfViewer2(){

    	int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    	String word = "luis";
    	
    	int prueba = DesignerPDFViewer.designerPdfViewer(h, word);
    	assertEquals(20, prueba);
	}
	
	public void testdesignerPdfViewer3(){

    	int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    	String word = "abc";
    	
    	int prueba = DesignerPDFViewer.designerPdfViewer(h, word);
    	assertEquals(9, prueba);
	}
	
}
