package ru.netologi.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

        @Test
        void shouldSetStationInRange() {
            Radio rad = new Radio();
            rad.setCurrentStation(4);
            int actual = rad.getCurrentStation();
            int expected = 4;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetStationOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentStation(0);
            int actual = rad.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetStationOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentStation(9);
            int actual = rad.getCurrentStation();
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetStationOverMaximum() {
            Radio rad = new Radio();
            rad.setCurrentStation(10);
            int actual = rad.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetStationUnderMinimum() {
            Radio rad = new Radio();
            rad.setCurrentStation(-10);
            int actual = rad.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetVolumeInRange() {
            Radio rad = new Radio();
            rad.setCurrentVolume(0);
            int actual = rad.getCurrentVolume();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetVolumeOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(10);
            int actual = rad.getCurrentVolume();
            int expected = 10;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetVolumeOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(0);
            int actual = rad.getCurrentVolume();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetVolumeOverMaximum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(11);
            int actual = rad.getCurrentVolume();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldSetVolumeUnderMinimum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(-5);
            int actual = rad.getCurrentVolume();
            int expected = 0;
            assertEquals(expected, actual);
        }


        @Test
        void shouldNextStationInRange() {
            Radio rad = new Radio();
            rad.setCurrentStation(8);
            rad.nextStation();
            int actual = rad.getCurrentStation();
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        void shouldNextStationOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentStation(0);
            rad.nextStation();
            int actual = rad.getCurrentStation();
            int expected = 1;
            assertEquals(expected, actual);
        }

        @Test
        void shouldNextStationOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentStation(9);
            rad.nextStation();
            int actual = rad.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldPrevStationInRange() {
            Radio rad = new Radio();
            rad.setCurrentStation(1);
            rad.prevStation();
            int actual = rad.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldPrevStationOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentStation(0);
            rad.prevStation();
            int actual = rad.getCurrentStation();
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        void shouldPrevStationOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentStation(9);
            rad.prevStation();
            int actual = rad.getCurrentStation();
            int expected = 8;
            assertEquals(expected, actual);
        }

        @Test
        void shouldIncreaseVolumeInRange() {
            Radio rad = new Radio();
            rad.setCurrentVolume(3);
            rad.increaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 4;
            assertEquals(expected, actual);
        }

        @Test
        void shouldIncreaseVolumeOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(0);
            rad.increaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 1;
            assertEquals(expected, actual);
        }

        @Test
        void shouldIncreaseVolumeOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(10);
            rad.increaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 10;
            assertEquals(expected, actual);
        }

        @Test
        void shouldDecreaseVolumeInRange() {
            Radio rad = new Radio();
            rad.setCurrentVolume(6);
            rad.decreaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        void shouldDecreaseVolumeOnMinimum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(0);
            rad.decreaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        void shouldDecreaseVolumeOnMaximum() {
            Radio rad = new Radio();
            rad.setCurrentVolume(10);
            rad.decreaseVolume();
            int actual = rad.getCurrentVolume();
            int expected = 9;
            assertEquals(expected, actual);
        }

}