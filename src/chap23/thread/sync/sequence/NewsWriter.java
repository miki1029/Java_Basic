package chap23.thread.sync.sequence;

public class NewsWriter extends Thread {
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	
	public void run() {
		paper.setTodayNews("자바의 열기가 뜨겁습니다.");
	}
}
