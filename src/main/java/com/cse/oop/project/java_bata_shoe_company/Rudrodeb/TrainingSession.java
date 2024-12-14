package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import java.time.LocalDate;

public class TrainingSession {
    private String topic, trainer, time, agenda, objectives;
    private LocalDate DOB;

    public TrainingSession(String token, String trainer, String time, String agenda, String objectives, String s) {
    }

    public TrainingSession(String topic, String trainer, String time, String agenda, String objectives, LocalDate DOB) {
        this.topic = topic;
        this.trainer = trainer;
        this.time = time;
        this.agenda = agenda;
        this.objectives = objectives;
        this.DOB = DOB;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }


    @Override
    public String toString() {
        return "TrainingSession{" +
                "topic='" + topic + '\'' +
                ", trainer='" + trainer + '\'' +
                ", time='" + time + '\'' +
                ", agenda='" + agenda + '\'' +
                ", objectives='" + objectives + '\'' +
                ", DOB=" + DOB +
                '}';
    }

    public String toString(String reason) {
        return topic+","+trainer+","+time+","+agenda+","+objectives+","+DOB+"\n";
    }

}
