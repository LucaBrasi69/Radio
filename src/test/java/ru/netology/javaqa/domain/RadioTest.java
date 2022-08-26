package ru.netology.javaqa.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.prevRadioStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-13);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-14);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(69);
        assertEquals(69, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSetNextRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(98);
        radio.nextRadioStation();
        assertEquals(99, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSetPrevRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(45);
        radio.prevRadioStation();
        assertEquals(44, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSetPrevMinRadioStationWithCustomAmountBelowMin() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(99, radio.getCurrentRadioStation());


    }
    @Test
    public void shouldSetNextMaxRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(99);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetOverMaxRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(102);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetBelowMinRadioStationWithCustomAmount() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(-11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

}




