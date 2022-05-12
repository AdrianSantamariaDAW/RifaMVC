package jcolonia.daw2021.rifa;

import java.util.Scanner;

public class VistaMenúBásico extends Vista{
	
	Scanner sc=getEntrada();
	private int opciónElegida;
	private String[] OPCIONES_MENÚ_PRINCIPAL;

	public VistaMenúBásico(String título, Scanner scEntrada, String[] OPCIONES_MENÚ_PRINCIPAL) {
		super(título,scEntrada);
		this.OPCIONES_MENÚ_PRINCIPAL=OPCIONES_MENÚ_PRINCIPAL;
	}
	
	public void mostrarOpciones() {
		int j=1;
		System.out.println("\nIntroduce una de las siguientes opciones.");
		for (int i=0;i<OPCIONES_MENÚ_PRINCIPAL.length;i++) {
			System.out.print(j++ +" ");
			System.out.println(OPCIONES_MENÚ_PRINCIPAL[i]);
		}	
	}
	
	public int pedirOpción() {
		String líneaTexto;
		int número;
		
		boolean numEsCorrecto = false;

		while(!numEsCorrecto) {
			try {
				líneaTexto = sc.nextLine();
				número = Integer.parseInt(líneaTexto);
				if(número<0 || número>OPCIONES_MENÚ_PRINCIPAL.length) {
					System.out.println("No ha elegido una opcion valida.");
				}else {
					numEsCorrecto = true;
					opciónElegida = número;
				}
			}
			catch(NumberFormatException ex){
				System.out.printf("\tNo es una de las opciones validas: <%s>%n", ex.getMessage());
			}
		}
		
		return opciónElegida;
		
	}
}
