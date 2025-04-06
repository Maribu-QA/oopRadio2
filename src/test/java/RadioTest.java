import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // выбрать станцию
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetBeforeMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAfterMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // граничные значения станции
    @Test
    public void shouldSetStationBeforeMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetExactMinEdgeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAfterMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBeforeMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetExactMaxEdgeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAfterMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // установить next станцию
    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    // граничные значения next станции
    @Test
    public void shouldSetNextStationAfterMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationToMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAfterMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // установить prev станцию
    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prev();
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    // граничные значения prev станции
    @Test
    public void shouldSetPrevStationBeforeMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetFromPrevStationToMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationBeforeMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    // установить громкость
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        Assertions.assertEquals(40, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetBeforeMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-40);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetAfterMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(140);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    // увеличить громкость
    @Test
    public void shouldSetVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);

        radio.volumeUp();
        Assertions.assertEquals(41, radio.getCurrentVolume());
    }

    // граничные значения увеличения громкости
    @Test
    public void shouldVolumeUpExactMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeUp();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUpAfterMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeUp();
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUpExactMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeUp();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUpBeforeMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeUp();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    // уменьшить громкость
    @Test
    public void shouldSetVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);

        radio.volumeDown();
        Assertions.assertEquals(39, radio.getCurrentVolume());
    }

    // граничные значения уменьшения громкости
    @Test
    public void shouldVolumeDownExactMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownAfterMinEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeDown();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownExactMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeDown();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownBeforeMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeDown();
        Assertions.assertEquals(98, radio.getCurrentVolume());
    }
}
