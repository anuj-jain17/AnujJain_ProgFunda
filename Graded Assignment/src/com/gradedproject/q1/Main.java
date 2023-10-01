package com.gradedproject.q1;

public class Main{
  public static void main(String[] args) {
		AdminDepartment admin= new AdminDepartment();
		HrDepartment hr= new HrDepartment();
		TechDepartment tech= new TechDepartment();
		
		//For Admin Department
		System.out.println("Welcome to the " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		
		//For HR Department
		System.out.println("Welcome to the " + hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		//For Tech Department
		System.out.println("Welcome to the " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
	}

}
