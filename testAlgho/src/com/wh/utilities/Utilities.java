package com.wh.utilities;

import java.util.List;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.wh.trees.Node;

public class Utilities {

	private static ArrayList<Integer> randomArrayList;
	private static Random random = new Random();
	static final int COUNT = 10;
	
	
	
	
	public static int[] RandomUniqueArray(int num)
	{
		Set<Integer> s = new HashSet<Integer>();
		int[] randomarray = new int[num];
		Random ran = new Random();
		
		int i = num;
		int value = 0;
		while(i>0) {
			
				value = ran.nextInt(num);
				if(s.add(value)) {
					i--;
					randomarray[i] =value;
				}
				 
				
		}
		return randomarray;
	}
	
	
	
	public static int[] RandomArray(int num)
	{
		int[] randomarray = new int[num];
		Random ran = new Random();
		
		for(int i = 0; i< num; i++)
		{
			randomarray[i] = ran.nextInt(num);
			//randomarray[i] = (int) Math.random();
		}
		
		return randomarray;
	}
	
	
	public static List<Integer> RandomUniqueArrayList(int num)
	{
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> randomarraylist = new ArrayList<>();
		Random ran = new Random();
		
		int i = num;
		int value = 0;
		while(i>0) {
			
				value = ran.nextInt(num);
				if(s.add(value)) {
					i--;
					randomarraylist.add(value); //[i] =value;
				}
				 
		}
		return randomarraylist;
	}
	
	public static ArrayList<Integer> RandomArrayList(int num)
	{
		randomArrayList = new ArrayList<>();
		
		for(int i=0; i < num;i++)
		{
			randomArrayList.add((int)(Math.random()*10));
			//System.out.print(" "+randomArrayList.get(i)+" ");
		}
				
		return randomArrayList;
	}
	
	public static void ShowArrayList(List<Integer> intArrayList){
		System.out.println("");
		for(int values : intArrayList){
			
			System.out.print(" "+ values + " ");
		}
	}
	
	public static String startLog(String algho, LocalTime start) {
		
		return " Inicio " + algho + ": " + LocalDate.now() + " " + start.toString();
	}
	
	public static String endsLog(String algho, LocalTime start, LocalTime end) {
		
		System.out.println(" Fin    " + algho + ": "+ LocalDate.now() + " " + end);
		Duration duration = Duration.between(start, end);
	    return System.out.printf(" Seconds between %s and %s is: %s seconds.%n",
	                start, end, duration.getSeconds()).toString();
		
	}

	public static char[] CharRandomArray(int num) {
		
		char[] randomarray = new char[num];
		Random ran = new Random();
		int random = 0;
		char str;
		
		for(int i = 0; i< num; i++)
		{
			random = ran.nextInt(91);
			
			if(random >=65 && random <= 90 ) {
				
				str = (char) random;
				randomarray[i] = str;
			}else
				i--;
		}
		
		return randomarray;
		
	}
	
	
	enum ISAPRES{
		COLMENA,
		BANMEDICA,
		CONSALUD
	}
	
	public static String ranIsapre(){
		
		String[] isapres = "COLMENA,BANMEDICA,CONSALUD".split(","); 
		
		int i = random.nextInt(isapres.length);
		
		return isapres[i];
		
		
	}
	
	public static String ranAFP(){
		String[] afp = "CUPRUM,HABITAD,MODELO,PLANVITAL".split(","); 
		
		int i = random.nextInt(afp.length);
		
		return afp[i];
	}
	
	public static int randWages(){
		return (int) (new Random().nextDouble() * 10000000);
	}
	
	public static int randDaylyWorkHours(){
		return new Random().nextInt(41);
	}
	
	
	public static String randRut(){
	
		Random random = new Random();
		
		Integer rut = (int) ( random.nextDouble() * 10000000);
		System.out.println(rut);
		char dv = calcularDV(rut.toString());
		System.out.println(dv);
		return rut.toString() + "-" + dv;
	}
	
	public static char calcularDV(String rut) {
		 
		
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() ));
			
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			
			return (char) (s != 0 ? s + 47 : 75);
			
			
		
	}

	public static boolean validarRut(String rut) {
	 
		boolean validacion = false;
		try {
			rut =  rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", "");
			
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
		 
			char dv = rut.charAt(rut.length() - 1);
		 
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			
			if (dv == (char) (s != 0 ? s + 47 : 75)) {
				validacion = true;
			}
		 
		} catch (java.lang.NumberFormatException e) {
		} catch (Exception e) {
		}
		return validacion;
	}
	
	static void print2DUtil(Node root, int space)  
	{  
	    // Base case  
	    if (root == null)  
	        return;  
	  
	    // Increase distance between levels  
	    space += COUNT;  
	  
	    // Process right child first  
	    print2DUtil(root.rightNode, space);  
	  
	    // Print current node after space  
	    // count  
	    System.out.print("\n");  
	    for (int i = COUNT; i < space; i++)  
	        System.out.print(" ");  
	    System.out.print(root.value + "\n");  
	  
	    // Process left child  
	    print2DUtil(root.leftNode, space);  
	}  
	  
	// Wrapper over print2DUtil()  
	public static void print2D(Node<? extends Object> root)  
	{  
	    // Pass initial space count as 0  
	    print2DUtil(root, 0);  
	}
	
	// (Left, Root, Right)
	public static void printInOrder(Node rootNode){
		
		if(rootNode != null) {
			printInOrder(rootNode.leftNode);
			
			System.out.print(rootNode.getValue());
						
			printInOrder(rootNode.rightNode);

		}		
	}
	
	//  (Root, Left, Right)
		public static void printPreOrder(Node rootNode){
			
			if(rootNode != null) {
				System.out.print(rootNode.getValue());
				
				printPreOrder(rootNode.leftNode);
							
				printPreOrder(rootNode.rightNode);
			}
		}

		//   Left, Right, Root
		public static void printPostOrder(Node rootNode){
			
			if(rootNode != null) {
				
				printPostOrder(rootNode.leftNode);
				
				printPostOrder(rootNode.rightNode);
				
				System.out.print(rootNode.getValue());
				
				
			}
		}
	
}
