import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomAgeException extends Exception {
    CustomAgeException(String message) {//конструктор
        super(message);//вызывает конст. с параметром message исп. ключ.сл. super
        loggError(message);//запись ошибки
    }
    public static void loggError(String error) {
        File log = new File("errors.txt");
        try {//true-запись в конец файла
            FileWriter writer = new FileWriter(log, true);//log- в какой файл будет запись
            writer.write(error + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
