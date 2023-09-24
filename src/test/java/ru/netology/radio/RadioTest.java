package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldCreateSumOfRadioStations() {
        Radio radio = new Radio(7);

        int expected = 6;
        int actual = radio.getSumOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notShouldSetCurrentRadioStationNumberAbove9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(33);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notShouldSetCurrentRadioStationNumberLess0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-5);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pressNextCurrentRadioStationNumberBefore9() {
        Radio radio = new Radio();

        radio.nextCurrentRadioStationNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pressNextCurrentRadioStationNumberAfter9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.nextCurrentRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pressPrevCurrentRadioStationNumberAfter0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(2);
        radio.prevCurrentRadioStationNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pressPrevCurrentRadioStationNumberEqual0() {
        Radio radio = new Radio();

        radio.prevCurrentRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notShouldSetCurrentVolumeBefore0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notShouldSetCurrentVolumeAfter100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(122);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeBefore100() {
        Radio radio = new Radio();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeEqual100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeEqual44() {
        Radio radio = new Radio();

        radio.setCurrentVolume(44);
        radio.reduceVolume();
        int expected = 43;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeEqual0() {
        Radio radio = new Radio();

        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}