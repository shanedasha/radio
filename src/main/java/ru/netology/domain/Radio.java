package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Radio {
    protected int currentVolume;
    protected int countRadioStation = 10;
    protected int currentRadioStation;

    public Radio() {
    }

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation >= 9) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public void setCountRadioStation(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}
