package ua.com.juja.codeparser.parser;


import java.util.List;

public interface FolderParser {
    /**
     *
     * @param pathToFolder - путь к каталогу
     * @return - общее количество java файлов в проекте
     */
    Integer getJavaFilesCount (String pathToFolder);

    /**
     *
     * @return - общее количество строк во всех java файлах
     */
    Integer getAllRowsCount();

    /**
     *
     * @return - количество строк в самом маленьком файле
     */
    Integer getSmallFileRowCount();

    /**
     *
     * @return - количество строк в самом большом файле
     */
    Integer getBigFileRowCount();

    /**
     *
     * @return - среднее количество строк в файле
     */
    Double getAvgRowCount();

    /**
     *
     * @return - количество файлов с количеством строк от о до 10
     */
    List<String> getFilesRows_0_10();

    /**
     *
     * @return - количество файлов с количеством строк от 11 до 50
     */
    List<String> getFilesRows_11_50();

    /**
     *
     * @return - количество файлов с количеством строк от 51 до 100
     */
    List<String> getFilesRows_51_100();

    /**
     *
     * @return - количество файлов с количеством строк от 101 до 300
     */
    List<String> getFilesRows_101_300();

    /**
     *
     * @return - количество файлов с количеством строк от 301 до 500
     */
    List<String> getFilesRows_301_500();

    /**
     *
     * @return - количество файлов с количеством строк от 501 до 1000
     */
    List<String> getFilesRows_501_1000();

    /**
     *
     * @return - количество файлов с количеством строк от 1001 до 10000
     */
    List<String> getFilesRows_1001_10000();

    /**
     *
     * @return - количество файлов с количеством строк от 10001 до бесконечности
     */
    List<String> getFilesRows_10001_Plus();

    /**
     *
     * @return - количество методов во всех java файлах
     */
    Integer getAllMethodCount();

    /**
     *
     * @return - максимальное количество методов в файле
     */
    Integer getMaxMethodCount();

    /**
     *
     * @return - минимальное количество методов в файле
     */
    Integer getMinMethodCount();

    /**
     *
     * @return - среднее количество методов в файле
     */
    Integer getAvgMethodCount();

    /**
     *
     * @return - количество java файлов с количеством методов от 0 до 5
     */
    List<String> getFilesWithMethod_0_5 ();

    /**
     *
     * @return - количество java файлов с количеством методов от 6 до 10
     */
    List<String> getFilesWithMethod_6_10 ();

    /**
     *
     * @return - количество java файлов с количеством методов от 11 до 20
     */
    List<String> getFilesWithMethod_11_20 ();

    /**
     *
     * @return - количество java файлов с количеством методов от 21 до 50
     */
    List<String> getFilesWithMethod_21_50 ();

    /**
     *
     * @return - количество java файлов с количеством методов от 50 до бесконечности
     */
    List<String> getFilesWithMethod_51_Plus ();

//    count rows in the smallest java method: <количество строк в самом маленьком методе>
//    count rows in the biggest java method: <количество строк в самом большом методе>
//    average count rows in java method: <среднее количество строк в методе>
//    count java method with count rows from 0 to 10: <количество java методов с количеством строк от 0 до 10>
//    count java method with count rows from 11 to 20: <количество java методов с количеством строк от 11 до 20>
//    count java method with count rows from 21 to 30: <количество java методов с количеством строк от 21 до 30>
//    count java method with count rows from 31 to 50: <количество java методов с количеством строк от 31 до 50>
//    count java method with count rows from 51 to 100: <количество java методов с количеством строк от 51 до 100>
//    count java method with count rows from 101 to 500: <количество java методов с количеством строк от 101 до 500>
//    count java method with count rows from 501 to infinity: <количество java методов с количеством строк от 501 до бесконечности>
//    count TODO comments in all java files: <количество TODO комментариев во всех java файлах>
//<наименование файла : номер строки в которой содержится TODO комментарий>
//<наименование файла : номер строки в которой содержится TODO комментарий>
//<наименование файла : номер строки в которой содержится TODO комментарий>
}
