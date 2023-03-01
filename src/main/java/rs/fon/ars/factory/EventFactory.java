package rs.fon.ars.factory;

import rs.fon.ars.domain.Event;

import java.sql.Date;

public class EventFactory {
    public static Event createEvent(int id, int budget, String name, String description, Date endDate){
        return new Event(id, budget, name, description, new Date(System.currentTimeMillis()), endDate);
    }
}
