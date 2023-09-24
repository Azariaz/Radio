package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int sumOfRadioStations = 10;


    public Radio(int sumOfRadioStations) {
        this.sumOfRadioStations = sumOfRadioStations - 1;
    }


    void setCurrentRadioStationNumber(int newRadioStationNumber) { // сеттер номера текущей радиостанции
        if (newRadioStationNumber < 0 || newRadioStationNumber > sumOfRadioStations) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    void nextCurrentRadioStationNumber() { // кнопка NEXT
        if (currentRadioStationNumber == sumOfRadioStations - 1) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    void prevCurrentRadioStationNumber() { // кнопка PREV
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = sumOfRadioStations - 1;
        } else {
            currentRadioStationNumber--;
        }
    }

    void setCurrentVolume(int newCurrentVolume) { // сеттер громкости, нужен только для 100% покрытия
        if (newCurrentVolume < 0 || newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    void increaseVolume() { // увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    void reduceVolume() { // уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}