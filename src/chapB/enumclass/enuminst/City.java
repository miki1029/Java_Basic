package chapB.enumclass.enuminst;

public enum City {
	SEOUL(200), BUSAN(100), JEJU(50);	// 인스턴스 생성
	
	private City(int popu) { // private 생략 가능
		population = popu;
	}
	
	int population;
	public int getPopulation() {
		return population;
	}
}
