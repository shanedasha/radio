package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldShowCurrentRadioStation() {
        radio.currentRadioStation = 2;

        int expected = 2;
        int actual = radio.currentRadioStation;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentRadioStationLowerZero() {
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentRadioStation() {
        radio.setCurrentRadioStation(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentRadioStationOverNine() {
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.increaseRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.decreaseRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationOverNine() {
        radio.setCurrentRadioStation(11);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationOverNine() {
        radio.setCurrentRadioStation(11);
        radio.increaseRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldShowCurrentVolume() {
        radio.currentVolume = 2;

        int expected = 2;
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentVolumeLowerZero() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentVolume() {
        radio.setCurrentVolume(4);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentVolumeOverTen() {
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTenVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverTen() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}