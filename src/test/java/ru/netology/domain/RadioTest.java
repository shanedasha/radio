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
        radio.setNineRadioStation(9);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNotNineRadioStation() {
        radio.setNineRadioStation(8);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        radio.increaseRadioStation(8);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseRadioStationOverTen() {
        radio.increaseRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStation() {
        radio.setZeroRadioStation(0);
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
        radio.setTenVolume(10);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNoTenVolume() {
        radio.setTenVolume(9);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.increaseVolume(8);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeOverTen() {
        radio.increaseVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() {
        radio.setZeroVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}