package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		System.out.println("Введите данные:");
        Scanner scanner = new Scanner(System.in);
	Student student1 = new Student();
		System.out.println("Id:");
	student1.setId(scanner.nextLine());
		System.out.println("Фамилия:");
	student1.setSurname(scanner.nextLine());
		System.out.println("Имя:");
	student1.setName(scanner.nextLine());
		System.out.println("Отчество:");
	student1.setMiddleName(scanner.nextLine());
		System.out.println("Адрес:");
	student1.setAdress(scanner.nextLine());
		System.out.println("Номер телефона:");
	student1.setPhoneNumber(scanner.nextLine());
		System.out.println("Факультет:");
	student1.setFaculty(scanner.nextLine());
		System.out.println("Курс:");
	student1.setCourse(scanner.nextLine());
		System.out.println("Группа:");
	student1.setGroup(scanner.nextLine());
		System.out.println("Год Рождения:");
	student1.setYear(scanner.nextInt());


        Scanner scanner2 = new Scanner(System.in);
		System.out.println("Введите данные:");
		Student student2 = new Student();
		System.out.println("Id:");
		student2.setId(scanner2.nextLine());
		System.out.println("Фамилия:");
		student2.setSurname(scanner2.nextLine());
		System.out.println("Имя:");
		student2.setName(scanner2.nextLine());
		System.out.println("Отчество:");
		student2.setMiddleName(scanner2.nextLine());
		System.out.println("Адрес:");
		student2.setAdress(scanner2.nextLine());
		System.out.println("Номер телефона:");
		student2.setPhoneNumber(scanner2.nextLine());
		System.out.println("Факультет:");
		student2.setFaculty(scanner2.nextLine());
		System.out.println("Курс:");
		student2.setCourse(scanner2.nextLine());
		System.out.println("Группа:");
		student2.setGroup(scanner2.nextLine());
		System.out.println("Год Рождения:");
		student2.setYear(scanner2.nextInt());

        Scanner scanner3 = new Scanner(System.in);
		System.out.println("Введите данные:");
		Student student3 = new Student();
		System.out.println("Id:");
		student3.setId(scanner3.nextLine());
		System.out.println("Фамилия:");
		student3.setSurname(scanner3.nextLine());
		System.out.println("Имя:");
		student3.setName(scanner3.nextLine());
		System.out.println("Отчество:");
		student3.setMiddleName(scanner3.nextLine());
		System.out.println("Адрес:");
		student3.setAdress(scanner3.nextLine());
		System.out.println("Номер телефона:");
		student3.setPhoneNumber(scanner3.nextLine());
		System.out.println("Факультет:");
		student3.setFaculty(scanner3.nextLine());
		System.out.println("Курс:");
		student3.setCourse(scanner3.nextLine());
		System.out.println("Группа:");
		student3.setGroup(scanner3.nextLine());
		System.out.println("Год Рождения:");
		student3.setYear(scanner3.nextInt());

		Student[] List = new Student[3];
		List[0] = student1;
		List[1] = student2;
		List[2] = student3;

		System.out.println("Пункт А");
		System.out.println("Введите Факультет");
		Scanner scanner4 = new Scanner(System.in);
		String CheckFaculty1 = scanner4.nextLine();
		for(int i = 0; i < 3; i++)
		{
			if (CheckFaculty1.equals(List[i].getFaculty()))
				System.out.println(" " + List[i].toString());
		}

		System.out.println("Пункт B");
		System.out.println("Введите");
		Scanner scanner6 = new Scanner(System.in);
		String groupCheck = scanner6.nextLine();
		String facultCheck = scanner6.nextLine();
		for(int i = 0; i < 3; i++)
		{
			if (facultCheck.equals(List[i].getFaculty()) && groupCheck.equals(List[i].getGroup()))
				System.out.println(" " + List[i].toString());
		}

		System.out.println("Пункт C");
        System.out.println("Введите год");
        int CheckYear = scanner4.nextInt();
        for(int i = 0; i < 3; i++)
        {
            if (CheckYear < List[i].getYear())
                System.out.println(" " + List[i].toString());
        }
		System.out.println("Пункт D");
		System.out.println("Введите группу");
		Scanner scanner5 = new Scanner(System.in);
		String CheckGroup = scanner5.nextLine();
		for(int i = 0; i < 3; i++)
		{
			if(CheckGroup.equals(List[i].getGroup()))
				System.out.println(" " + List[i].toString());
		}

	}
}
