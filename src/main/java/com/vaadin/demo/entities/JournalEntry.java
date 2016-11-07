package com.vaadin.demo.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class JournalEntry {

    @Id @GeneratedValue
    private Long id;

    private Date date;
    @Column(length = 10000)
    private String entry;
    private AppointmentType appointmentType;
    @ManyToOne
    private Doctor doctor;

    public JournalEntry(Date date, String entry, AppointmentType appointmentType) {
        this.date = date;
        this.entry = entry;
        this.appointmentType = appointmentType;
    }

    public JournalEntry() {
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
