package Adapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GoogleDriveAdapter implements PersistenciaArquivos{
    String filePath = "/path/to/file";
    private GoogleDrive googleDrive;
    public GoogleDriveAdapter(GoogleDrive googleDrive) throws IOException {
        this.googleDrive = googleDrive;
    }
    File  file = new File(filePath);
    byte[] bytes = Files.readAllBytes(file.toPath());
    @Override
    public void gravar(File file) {
        googleDrive.send(bytes,"teste");
    }

    @Override
    public File ler(String caminho) {
        return null;
    }
}
