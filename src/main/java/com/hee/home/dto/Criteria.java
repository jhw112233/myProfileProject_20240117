package com.hee.home.dto;

public class Criteria {
	private int amount=9; //한페이지 당 출력될 개수/고정 
	private int pageNum=1;//현재 페이지 번호가 저장될 변수 (게시판 클릭시 첫화면 보여질 페이지가 1페이지이므로 1로 초기 설정)
	private int stratNum;//유저가 선택한 페이지에서 시작할 글의 번호
	
	public Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Criteria(int amount, int pageNum, int stratNum) {
		super();
		this.amount = amount;
		this.pageNum = pageNum;
		this.stratNum = stratNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getStratNum() {
		return stratNum;
	}
	public void setStratNum(int stratNum) {
		this.stratNum = stratNum;
	}
	
	

}
