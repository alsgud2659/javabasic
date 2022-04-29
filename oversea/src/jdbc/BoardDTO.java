package jdbc;

public class BoardDTO {
	private String bid;
	private String btitle;
	private String bcontent;
	private String buser;
	private String bdate;
	private String bimage;
	
	
	public String getBid() {
		return bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public String getBdate() {
		return bdate;
	}
	public String getBcontent() {
		return bcontent;
	}
	public String getBuser() {
		return buser;
	}
	public String getBimage() {
		return bimage;
	}
	public BoardDTO(String bid, String btitle, String bcontent, String buser,String bdate, String bimage) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bdate = bdate;
		this.bcontent = bcontent;
		this.buser = buser;
		this.bimage = bimage;
	}
	
	
	
	
	
	
}
