package lesson.lesson_13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

/**
 * Created by Anna on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
        final int MAX_RGB = 255;

        // создаем массив, в котором будет содержаться текущий пиксель
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        // цикл по строкам картинки
        for (int j = 0; j < height; ++j) {
            // цикл пикселям строки
            for (int i = 0; i < width; ++i) {
                // получаем текущий пиксель с координатами i,j
                raster.getPixel(i, j, pixel);

                // инвертируем цвет для каждой компоненты, т.е. делаем 255 минус текущее значение
              /*  for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = MAX_RGB - pixel[k];
                }*/

              // перевод в черно-белое
                int value = (int) (0.3 * pixel[0] + 0.59 * pixel[1] + 0.11 * pixel[2]);
                for(int k = 0; k < COLORS_COUNT_IN_RGB; ++k){
                    pixel[k] = value;
                }

                raster.setPixel(i, j, pixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }
}
