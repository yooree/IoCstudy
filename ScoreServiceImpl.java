package ioc.score.service.impl;

import ioc.score.service.ScoreService;
import ioc.score.service.SubjectScoreService;

public class ScoreServiceImpl implements ScoreService {

	private SubjectScoreService korService;
	
	private SubjectScoreService engService;
	
	private SubjectScoreService matService;
	
	@Override
	public String getGrade(int kor, int eng, int mat) {

		String korGrade = korService.getGrade(kor);
		String engGrade = engService.getGrade(eng);
		String matGrade = matService.getGrade(mat);
		
		return korGrade + engGrade + matGrade;
	}

	public void setKorService(SubjectScoreService korService) {
		this.korService = korService;
	}

	public void setEngService(SubjectScoreService engService) {
		this.engService = engService;
	}

	public void setMatService(SubjectScoreService matService) {
		this.matService = matService;
	}
	

}
