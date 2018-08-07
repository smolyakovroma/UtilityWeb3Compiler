package com.web3example.web3;

import org.web3j.codegen.SolidityFunctionWrapperGenerator;

import java.io.File;

public class Wrapper {
    public static void main(String[] args) throws Exception {
//
//        File folder = new File("C:/tmp");
//        File[] folderEntries = folder.listFiles();
//        for (File entry : folderEntries) {
//            System.out.println(entry.getAbsolutePath());
//        }

//        $ solc <contract>.sol --bin --abi --optimize -o <output-dir>/

        String[] args2 = {
                "c:/tmp/UnicornPrices.bin",
                "c:/tmp/UnicornPrices.abi",
                "-p",
                "com.generated",
                "-o",
                "./src/main/java",};

        SolidityFunctionWrapperGenerator.main(args2);


    }

    public void processFilesFromFolder(File folder) {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                processFilesFromFolder(entry);
                continue;
            }
            // иначе вам попался файл, обрабатывайте его!
        }
    }
}
