package pack.mc_controller;

import java.util.Calendar;

public class MCBoardBean {
	private int mc_no, mc_brightness, mc_like, mc_comment;
	private String mem_nick, mem_email, mc_content, mc_color, mc_date;
	private String searchParam, searchValue;
	
	public String getSearchParam() {
		return searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
	public void setMc_date() {
	Calendar calender=Calendar.getInstance();
	int year=calender.get(Calendar.YEAR);
	int month=calender.get(Calendar.MONTH)+1;
	int day=calender.get(Calendar.DATE);
	this.mc_date=year+"-"+month+"-"+day;
	}
	
	public String getMc_date() {
		return mc_date;
	}

	public void setMc_date(String mc_date) {
		this.mc_date = mc_date;
	}

	public int getMc_no() {
		return mc_no;
	}

	public void setMc_no(int mc_no) {
		this.mc_no = mc_no;
	}

	public int getMc_brightness() {
		return mc_brightness;
	}

	public void setMc_brightness(int mc_brightness) {
		this.mc_brightness = mc_brightness;
	}

	public int getMc_like() {
		return mc_like;
	}

	public void setMc_like(int mc_like) {
		this.mc_like = mc_like;
	}

	public int getMc_comment() {
		return mc_comment;
	}

	public void setMc_comment(int mc_comment) {
		this.mc_comment = mc_comment;
	}

	public String getMem_nick() {
		return mem_nick;
	}

	public void setMem_nick(String mem_nick) {
		this.mem_nick = mem_nick;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMc_content() {
		return mc_content;
	}

	public void setMc_content(String mc_content) {
		this.mc_content = mc_content;
	}

	public String getMc_color() {
		return mc_color;
	}

	public void setMc_color(String mc_color) {
		this.mc_color = mc_color;
	}
}
