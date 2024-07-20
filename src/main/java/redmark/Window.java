package redmark;

import org.lwjgl.Version;

public class Window {
    private int height,width;
    private String title;

    private static Window window = null;

    private Window() {
        this.height = 1920;
        this.width = 1080;
        this.title = "The Life Of A Dreamer";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static Window getWindow() {
        if (Window.window == null) {
            Window.window = new Window();
        }

        return Window.window;
    }

    public static void runWindow() {
        System.out.println("Hello. This game is going to be awesome. LWJGL Version: " + Version.getVersion() + "!!!!");
    }
}
