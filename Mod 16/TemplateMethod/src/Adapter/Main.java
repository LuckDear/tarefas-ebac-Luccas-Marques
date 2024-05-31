package Adapter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "Teste.txt";
        DropBox  drop =  new DropBox();
        PersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));

        GoogleDrive drive = new GoogleDrive();
        arquivos = new GoogleDriveAdapter(drive);
        arquivos.gravar(new File(file));
    }
}
