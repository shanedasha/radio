package ru.netology.domain;

public class Radio {
    protected int currentRadioStation;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation(int currentRadioStation) {
        if (currentRadioStation < 10) {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void setNineRadioStation(int currentRadioStation) {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
        }
    }

    public void setZeroRadioStation(int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    protected int currentVolume;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void setTenVolume(int currentVolume) {
        if (currentVolume == 10) {
            return;
        }
    }

    public void setZeroVolume(int currentVolume) {
        if (currentVolume == 0) {
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}