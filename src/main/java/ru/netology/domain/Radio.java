package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    protected int currentVolume;
    protected int countRadioStation = 10;


    public void setCurrentRadioStation(int countRadioStation) {
        if (countRadioStation < 0) {
            return;
        }
        if (countRadioStation > 9) {
            return;
        }
        this.countRadioStation = countRadioStation;
    }

    public void increaseRadioStation() {
        if (countRadioStation>= 9) {
            this.countRadioStation = 0;
        } else {
            this.countRadioStation = countRadioStation + 1;
        }
    }

    public void decreaseRadioStation() {
        if (countRadioStation == 0) {
            this.countRadioStation = 9;
        } else {
            this.countRadioStation =countRadioStation - 1;
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

}
