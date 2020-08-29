package com.thegabdoosan.filestree;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'adresse d'un dossier de votre ordinateur :");
        String path = scanner.nextLine();

        File pathFolder = new File(path);

        filesArborescence(pathFolder, 0);

    }

    static void filesArborescence(File folder, int depth) {

        if(folder.isDirectory()) {

            for(File file : folder.listFiles()) {
                System.out.println(depthSpace(depth + 1) + " > " + file.getName());

                if(file.isDirectory()) {
                    filesArborescence(file, depth + 1);
                }

            }

        }

    }

    static String depthSpace(int depth) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < depth; i++) {
            builder.append("    ");
        }

        return builder.toString();

    }

}
