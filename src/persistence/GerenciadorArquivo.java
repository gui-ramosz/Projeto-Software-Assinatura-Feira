package persistence;

import entity.*;
import java.io.*;
import java.util.List;

public class GerenciadorArquivo { 

    public int obterProximoId(String nomeArquivo) {
        int maxId = 0;
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists() || arquivo.length() == 0) return 1;
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                
                String primeiraParte = linha.split(";")[ 0 ].trim();
                
                if (primeiraParte.contains(":")) {
                    primeiraParte = primeiraParte.split(":")[ 1 ].trim();
                }
                
                try {
                    int idAtual = Integer.parseInt(primeiraParte);
                    if (idAtual > maxId) maxId = idAtual;
                } catch (Exception e) {}
            }
        } catch (IOException e) { return 1; }
        return maxId + 1;
    }



    public int buscarIdPorCelular(String celularProcurado) {
        File arquivo = new File("banco_assinantes.txt");
        if (!arquivo.exists()) return -1;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length >= 3) {
                    

                    String celularSalvo = partes[ 2 ].trim();
                    
                    if (celularSalvo.equals(celularProcurado.trim())) {
                        return Integer.parseInt(partes[ 0 ].trim());
                    }
                }
            }
        } catch (Exception e) {}
        return -1;
    }

    public double buscarPrecoPorIdAssinante(int idAssinante) {
        File arquivo = new File("banco_assinaturas.txt");
        if (!arquivo.exists()) return 49.90;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (Integer.parseInt(partes[ 0 ].trim()) == idAssinante) {
                    int plano = Integer.parseInt(partes[ 1 ].trim());
                    if (plano == 2) return 79.90;
                    if (plano == 3) return 109.90;
                }
            }
        } catch (Exception e) {}
        return 49.90; 
    }

    public void salvarAssinante(Assinante a) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_assinantes.txt", true))) {
            bw.write(a.getIdAssinante() + ";" + a.getNome() + ";" + a.getNumeroCelular() + ";" + a.getDataCadastro());
            bw.newLine();
        } catch (IOException ex) { }
    }

    public void salvarEndereco(EnderecoDeEntrega end) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_enderecos.txt", true))) {
            bw.write(end.getIdEndereco() + ";" + end.getCep() + ";" + end.getLogradouro() + ";" + end.getNumero());
            bw.newLine();
        } catch (IOException ex) { }
    }

    public void salvarPreferencia(PreferenciaDeEntrega pref) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_preferencias.txt", true))) {
            bw.write(pref.getIdPreferencia() + ";" + pref.getDiaDaSemana() + ";" + pref.getHorarioPreferencial());
            bw.newLine();
        } catch (IOException ex) { }
    }

    public void salvarCompra(Compra comp) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_compras.txt", true))) {
            bw.write(comp.getIdCompra() + ";" + comp.getStatus() + ";" + comp.getIdAssinante());
            bw.newLine();
        } catch (IOException ex) { }
    }

    public void salvarCesta(CestaDaSemana cesta, List<String> itens) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_cestas.txt", true))) {
            bw.write("CESTA_ID:" + cesta.getIdCesta() + ";VALOR:" + cesta.getValorTotalCesta() + ";COMPRA_ID:" + cesta.getIdCompra());
            bw.newLine();
            for (String item : itens) {
                bw.write("-> ITEM:" + item);
                bw.newLine();
            }
        } catch (IOException ex) { }
    }

    public void salvarPagamento(Pagamento pag) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("banco_pagamentos.txt", true))) {
            bw.write(pag.getIdPagamento() + ";" + pag.getValorTotal() + ";" + pag.getStatus() + ";" + pag.getIdCompra());
            bw.newLine();
        } catch (IOException ex) { }
    }
}