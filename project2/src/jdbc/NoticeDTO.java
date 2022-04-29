package jdbc;

public class NoticeDTO {
	private String nid;
	private String nuser;
	private String ntitle;
	private String ncontent;
	private String nimage;
	private String ndate;
	public String getNid() {
		return nid;
	}
	public String getNuser() {
		return nuser;
	}
	public String getNtitle() {
		return ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public String getNimage() {
		return nimage;
	}
	public String getNdate() {
		return ndate;
	}
	public NoticeDTO(String nid, String nuser, String ntitle, String ncontent, String nimage, String ndate) {
		this.nid = nid;
		this.nuser = nuser;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.nimage = nimage;
		this.ndate = ndate;
	}
	
}
