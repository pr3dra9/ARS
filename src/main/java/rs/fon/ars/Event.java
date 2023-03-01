package rs.fon.ars;

import java.sql.Date;

public class Event {

	int id, budget;
	String name, description;
	Date startDate, endDate;

	public Event(int id, int budget, String name, String description, Date startDate, Date endDate) {
		this.id = id;
		this.budget = budget;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Event{" +
				"id=" + id +
				", budget=" + budget +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				'}';
	}
}
