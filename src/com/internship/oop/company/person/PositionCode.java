package com.internship.oop.company.person;

public class PositionCode {
    private int positionCode;
    private String attribute;

    public PositionCode(int positionCode, String attribute) {
        this.positionCode = positionCode;
        this.attribute = attribute;
    }

    public int getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(int positionCode) {
        this.positionCode = positionCode;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
