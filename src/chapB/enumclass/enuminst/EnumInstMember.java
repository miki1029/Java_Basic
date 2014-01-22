package chapB.enumclass.enuminst;

public class EnumInstMember {
	public static void main(String[] args) {
		System.out.println("서울의 인구 : " + City.SEOUL.getPopulation());
		System.out.println("부산의 인구 : " + City.BUSAN.getPopulation());
		System.out.println("제주의 인구 : " + City.JEJU.getPopulation());
	}
}
