package com.wh.utilities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class Utilities {

	private static ArrayList<Integer> randomArrayList;
	private static Random random = new Random();
	
	
	
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
	
	public static void ShowArrayList(ArrayList<Integer> intArrayList){
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
}
