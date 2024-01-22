package com.hee.home.dto;

public class PageDto {
	private int startPage;//화면에서 보여질 시작 페이지 번호
	private int endPage;//화면에서 보여질 마지막페이지번호
	private boolean next;//현재 페이지 더 이상 페이지가 있는지 여부'>'
	private boolean prev;//현재 페이지 더 이하 페이지가 있는지 여부'<'
	private int total;//총 글의 개수
	private Criteria criteria;//Criteria 내의 값들을 불러오기 위한 객체선언
	
	public PageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//별도 생성자 추가
	public PageDto(Criteria criteria, int total ) {
		
		this.criteria=criteria;
		this.total=total;
		
		this.endPage=(int) (Math.ceil((criteria.getPageNum()/10.0))*10);//(형변환)올림
	
		this.startPage=this.endPage -9;
		
		int realEndPage =(int) Math.ceil (total / criteria.getAmount());
		
		if(realEndPage<this.endPage) {
			this.endPage=realEndPage;
		}
		this.prev=this.startPage>1;
		//스타트 페이지 값은 1,11,21,,,, 나가기 때문에 1보다 크면 무조건 표시
		this.next=this.endPage<realEndPage;
		//마지막페이지가 실제 페이지보다 작으면 표시
	}
	
	
	public PageDto(int startPage, int endPage, boolean next, boolean prev, int total, Criteria criteria) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.next = next;
		this.prev = prev;
		this.total = total;
		this.criteria = criteria;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	

	
}
