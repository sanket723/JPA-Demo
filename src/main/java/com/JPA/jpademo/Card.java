package com.JPA.jpademo;

import javax.persistence.*;

@Entity                     //@Entity for making the below class as table
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)               //this to generate cardNo serial wise 1,2,3...and use it as primarykey
    private int cardNo;

    private String dob;

    @Enumerated(EnumType.STRING)
    private Status status;
                                                     //in our case User-Card relationship is One to One
    @OneToOne                                        //here first One for current class(Card) and second One for with which we want to join(User)
    @JoinColumn                                      //by default joins based on primary key until we write @JoinColumn(Column Name)
    User user;

    public Card() {
    }

    public Card(int cardNo, String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
