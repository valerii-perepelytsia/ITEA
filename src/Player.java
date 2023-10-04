public class Player implements Playable, Recordable {
    public void play() {
        System.out.println("Відтворення музики");
    }

    public void pause() {
        System.out.println("Пауза");
    }

    public void stop() {
        System.out.println("Зупинка");
    }

    public void record() {
        System.out.println("Запис музики");
    }
}