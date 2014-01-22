package chapB.enumclass.valueof;

import java.util.Scanner;
import chapB.enumclass.enuminst.City;

public class EnumValueOf {
	public static void main(String[] args) {
		System.out.print("SEOUL, BUSAN, JEJU >> ");
		Scanner keyboard = new Scanner(System.in);
		
		String where = keyboard.nextLine();
		where = where.toUpperCase();
		
		City dest = City.valueOf(City.class, where);
		
		switch(dest) {
		case SEOUL:
			System.out.println("가시려는 서울의 인구: " + dest.getPopulation());
			break;
		case BUSAN:
			System.out.println("가시려는 부산의 인구: " + dest.getPopulation());
			break;
		case JEJU:
			System.out.println("가시려는 제주의 인구: " + dest.getPopulation());
			break;
		}
	}
}
