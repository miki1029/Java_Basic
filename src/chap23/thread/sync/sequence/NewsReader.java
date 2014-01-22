package chap23.thread.sync.sequence;

public class NewsReader extends Thread {
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	
	public void run() {
		System.out.println("오늘의 뉴스 : " + paper.getTodayNews());
	}
}
