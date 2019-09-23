package uk.ac.belfastmet.topTen.domain;

public class ToDo {
	
	
	
	private int tasknumber;
	private String description;
	private String date;
	private String assignedPerson;
	private String priority;
	private String deadline;
	private boolean complete;
	
	
	public String getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(String assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public ToDo()
	{
		super();
	}
	
	
	public ToDo(int tasknumber, String description, String date, String assignedPerson,
			String priority, String deadline, boolean complete) {
		super();
		this.tasknumber = tasknumber;
		this.description = description;
		this.date = date;
		this.assignedPerson = assignedPerson;
		this.priority = priority;
		this.deadline = deadline;
		this.complete = complete;
	}

	/**
	 * @return the tasknumber
	 */
	public int getTasknumber() {
		return tasknumber;
	}
	/**
	 * @param tasknumber the tasknumber to set
	 */
	public void setTasknumber(int tasknumber) {
		this.tasknumber = tasknumber;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the complete
	 */
	public boolean isComplete() {
		return complete;
	}
	/**
	 * @param complete the complete to set
	 */
	public void isComplete(boolean complete) {
		this.complete = complete;
	}
	
	
}
