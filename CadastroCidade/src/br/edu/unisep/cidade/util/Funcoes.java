package br.edu.unisep.cidade.util;


import br.edu.unisep.cidade.model.Cidade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {

    public static List<Cidade> lerArquivoCidade(){
        File pasta = new File("C:\\cidade");
        if (!pasta.exists()){
            pasta.mkdir();
        }
        File arquivo = new File(pasta, "cidades.txt");
        List<Cidade> cidades = new ArrayList<Cidade>();
        try{
            if (arquivo.exists()){
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                String linha = "";
                while((linha = br.readLine()) != null){
                    Cidade cidade = new Cidade();
                    cidade.toObject(linha);
                    cidades.add(cidade);
                }
                br.close();
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  cidades;
    }

    public static boolean salvarArquivoCidade(
            List<Cidade> cidades
    ){
        try{
            File arquivo = new File("C:\\cidade", "cidades.txt");
            arquivo.createNewFile();
            FileWriter fw = new FileWriter(arquivo, false);
            PrintWriter pw = new PrintWriter(fw);
            for (Cidade cidade : cidades){
                pw.println(cidade.toFileString());
            }
            pw.flush();
            pw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
