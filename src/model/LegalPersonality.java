/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public  abstract class LegalPersonality{
	
	private String nit;
	private String address;
	private String phone;
	private int employees;
	private double assets;
	private String date;
	private String nameLR;
	
	public LegalPersonality(String nit, String address, String phone, int employees, double assets, String date, String nameLR){
		
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employees = employees;
		this.assets = assets;
		this.date = date;
		this.nameLR = nameLR;
		
	}
		
}