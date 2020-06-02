package Lucene1;

import java.io.File;
import java.io.FileFilter;

public class TextFileFilter implements FileFilter {
    @Override
    // Extenstion des fichiers à indexer
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".doc");
    }
}
