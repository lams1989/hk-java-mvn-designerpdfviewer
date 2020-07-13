package com.lams1989.designerpdfviewer;

public class DesignerPDFViewer {

	// 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
	// z

	public static int designerPdfViewer(int[] h, String word) {
		int base = word.length();
		int resultado;
		int max = 0;
		for (int i = 0; i < word.length(); i++) {
			int index = word.codePointAt(i) - 97;
			int aux = h[index];
			if (aux > max ) {
				max = aux;

			}

		}

		resultado = base * max;

	return resultado;
	}

}
