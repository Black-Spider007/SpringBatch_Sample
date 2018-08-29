package jp.co.example.FileMapper.AntiPatternImpl;

import org.springframework.stereotype.Component;

@Component("AntiPatternEmployeeFileRow")
public class AntiPatternEmployeeFileRow {
	private String number;
	private String name;
	private String note;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id = ").append(this.number).append(", name = ").append(this.name).append(", note = ").append(this.note);
		return sb.toString();

	}

}
