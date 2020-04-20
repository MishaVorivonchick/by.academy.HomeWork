package by.academy.homework.task3;

public class Lock {
    Key key;
    public void isOpenLock(Key key) {
        key.open();
    }
    public void isCloseLock(Key key) {
        key.close(); }
}
