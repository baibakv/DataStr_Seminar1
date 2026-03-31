package service;

import java.util.Arrays;

import dataStr.MyArrayList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		System.out.println("======== DARBS AR SIMBOLIEM ========");
		MyArrayList<Character> symbols = new MyArrayList<Character>(3);
		symbols.add('a');// a
		symbols.add('b');// a b
		symbols.add('c');// a b c
		symbols.add('a');// a b c a
		try
		{
			System.out.println();
			System.out.println("Izvada izveidotos elementus:");
			symbols.print();// a b c a
			
			System.out.println();
			System.out.println("Pievieno jaunu elementu indeksā 1: ");
			symbols.add('Z', 1);// a Z b c a
			symbols.print();// a Z b c a
			
			System.out.println();
			System.out.println("Izdzēš elementu indeksā 2: ");
			symbols.remove(2);//a Z c a
			symbols.print();//a Z c a
			
			System.out.println();
			System.out.println("Izvada elementu indeksā 1: ");
			System.out.println(symbols.get(1));//Z
			
			System.out.println();
			System.out.println("Meklē elementu a: ");
			System.out.println(symbols.search('a'));//0 3
			
			System.out.println();
			System.out.println("Meklē elementu, kas atrodas aiz a: ");
			System.out.println(
					Arrays.toString(symbols.getNextElements('a')));//Z
			
			System.out.println();
			System.out.println("Kārto: ");
			symbols.sort();
			symbols.print();
			
			System.out.println();
			System.out.println("Iztukšo sarkstu, pievieno W");
			symbols.makeEmpty();//padaram tuksu
			symbols.add('W');
			symbols.print();//W
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("======== DARBS AR STUDENTIEM ========");
		MyArrayList<Student> allStudents = new MyArrayList<Student>();
		Student s1 = new Student("Janis", "Berzins", "121212-67890");
		Student s2 = new Student("Baiba", "Kvizikevica", "122323-23456");
		Student s3 = new Student("Liga", "Nejauka", "345675-34567");
		
		try
		{
			System.out.println();
			System.out.println("Pievienot studentus sarakstam:");
			allStudents.add(s1);//Jānis
			allStudents.add(s2);//Jānis Baiba
			allStudents.add(s3,0);//Līga Jānis Baiba
			allStudents.print();
			
			System.out.println();
			System.out.println("Atrast Jāni:");
			System.out.println(allStudents.get(1));//Jānis
			
			System.out.println();
			System.out.println("Kurā indeksā glabājas Līga:");
			System.out.println(allStudents.search(s3));//0 <-kura indeksā galbājās Līga
			
			System.out.println();
			System.out.println("padodot Līgu, aiz viņas ir Jānis:");
			System.out.println(
					Arrays.toString(allStudents.getNextElements(s3)));
			//^^ padodot Līgu, aiz viņas ir Jānis
			
			System.out.println();
			System.out.println("Kšrtot studentus:");
			allStudents.sort();
			allStudents.print();//Liga Baiba Janis
			
			System.out.println();
			System.out.println("Izdzēš Baibu:");
			allStudents.remove(1);//izdzēšu Baibu
			allStudents.print();//Liga Janis
			
			System.out.println();
			System.out.println("Iztukšo sarakstu, pievieno Karinu:");
			allStudents.makeEmpty();
			allStudents.add(new Student("Karina", "Skirmante", "121234-12212"));
			allStudents.print();//Karina
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}