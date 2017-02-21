package ua.com.juja.codeparser;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dima on 21.02.17.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * args[0] - каталог с java-файлами
         * arg[1] - результирующий файл
         */
        if(args == null || args.length < 1){
            return;
        }

        Collection<String> javaFileList = getJavaFiles(args[0]);
        File resultFile = parserJavaFiles(javaFileList, args[1]);
    }

    private static Collection<String> getJavaFiles(String pathCatalogue){
        Collection<String> outList = new ArrayList<String>();
        // TODO
        return outList;
    }
    private static File parserJavaFiles(Collection<String> javaFileList, String pathResultFile) {
        File outFile = new File(pathResultFile);
        // TODO
        return outFile;
    }
}
