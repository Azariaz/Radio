package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    int getCurrentRadioStationNumber() {  // геттер номера текущей радиостанции
        return currentRadioStationNumber;
    } // геттер номера текущей радиостанции

    void setCurrentRadioStationNumber(int newRadioStationNumber) { // сеттер номера текущей радиостанции
        if (newRadioStationNumber < 0 || newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    void nextCurrentRadioStationNumber() { // кнопка NEXT
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    void prevCurrentRadioStationNumber() { // кнопка PREV
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    int getCurrentVolume() { // геттер громкости звука
        return currentVolume;
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