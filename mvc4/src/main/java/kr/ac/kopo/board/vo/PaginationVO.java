package kr.ac.kopo.board.vo;

public class PaginationVO {
	private int page;
	
	private int itemSizePerPage;
	
	private int start;
	
	private int end;
	
	private int lastStart;
	
	private int lastEnd;
	
	private int lastPage;
	
	private int leftPage;
	
	private int rightPage;
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getItemSizePerPage() {
		return itemSizePerPage;
	}
	
	public void setItemSizePerPage(int itemSizePerPage) {
		this.itemSizePerPage = itemSizePerPage;
	}
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getEnd() {
		return end;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getLastStart() {
		return lastStart;
	}
	
	public void setLastStart(int lastStart) {
		this.lastStart = lastStart;
	}
	
	public int getLastEnd() {
		return lastEnd;
	}
	
	public void setLastEnd(int lastEnd) {
		this.lastEnd = lastEnd;
	}
	
	public int getLastPage() {
		return lastPage;
	}
	
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	
	public int getLeftPage() {
		return leftPage;
	}
	
	public void setLeftPage(int leftPage) {
		this.leftPage = leftPage;
	}
	
	public int getRightPage() {
		return rightPage;
	}
	
	public void setRightPage(int rightPage) {
		this.rightPage = rightPage;
	}
	
	
}
