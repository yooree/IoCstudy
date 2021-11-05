package ioc.score.service.impl;

import ioc.score.service.SubjectScoreService;

public class KorScoreServiceImpl implements SubjectScoreService {

	private int scoreA;
	
	private int scoreB;
	
	@Override
	public String getGrade(int score) {
		if (score >= scoreA ) {
			return "A";
		} else if (score >= scoreB) {
			return "B";
		} else {
			return "C";
		}
	}

	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}

	public int getScoreB() {
		return scoreB;
	}

	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}

}
