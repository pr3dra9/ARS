/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.fon.ars;

import rs.fon.ars.domain.Event;
import rs.fon.ars.factory.EventFactory;

import java.sql.Date;

/**
 *
 * @author student2
 */
public class ARS {

    public static void main(String[] args) {
        Event e1 = EventFactory.createEvent(1, 100, "Prvi", "first event desc", new Date(System.currentTimeMillis()));
        System.out.println(e1);
        System.out.println(e1);
    }
}