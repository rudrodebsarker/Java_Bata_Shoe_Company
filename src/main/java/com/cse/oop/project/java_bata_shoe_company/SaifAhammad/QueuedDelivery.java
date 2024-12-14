package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class QueuedDelivery {
    private String queue;
    private int deliveryTime;

    public QueuedDelivery(String queue, int deliveryTime) {
        this.queue = queue;
        this.deliveryTime = deliveryTime;
    }
    public String getQueue() {
        return queue;
    }
    public void setQueue(String queue) {
        this.queue = queue;
    }
    public int getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
