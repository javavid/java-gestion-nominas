package Archivos_o_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class EjemploJavaNio2 {
    
    public static void main(String[] args) {
        
        try {
            // creamos un nuevo archivo y obtenemos un canal para escribir en el.
            FileOutputStream fos = new FileOutputStream("integers.bin");
            FileChannel canal = fos.getChannel();

            // creamos un buffer y ponemos algunos enteros en el.
            ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES * 4);
            for (int i = 0; i < 4; i++) {
                buffer.putInt(i);
            }

            // prepara el buffer para escribir.
            buffer.flip();

            // escribe el buffer en el archivo atravez del canal.
            canal.write(buffer);
            fos.close();


            FileInputStream fis = new FileInputStream("integers.bin");
            canal = fis.getChannel();

            buffer = ByteBuffer.allocate(Integer.BYTES * 4);

            canal.read(buffer);

            buffer.flip();

            while (buffer.hasRemaining()) {
                System.out.println(buffer.getInt());
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un Error " + e.getMessage());
        }
    }
}
