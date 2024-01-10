import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        try {
            File currentFile = new File("file1.txt");
            File file = new File("newFile.txt");
            Scanner scanner = new Scanner(currentFile);
            scanner.close();
            try {
                FileWriter writer = new FileWriter(file);//записывать в файл
                while (scanner.hasNextLine()) {//проверка, есть ли строка в файле
                    writer.write(scanner.nextLine());
                    writer.write("\n");
                }
                writer.close();
            } catch (IOException e) {//возникают исключения
                System.err.println("ошибка при записи файла");
            }

        } catch (IOException e) {//пример:если файлов не сущ. или нет доступа
            System.err.println(e.getMessage());
        }
        catch (IllegalStateException e) {
            System.err.println("поток закрыт");
        }
    }
}
