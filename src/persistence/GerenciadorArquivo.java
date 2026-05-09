package persistence;
import entity.Assinante;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorArquivo{
    public void salvarAssinante(Assinante assinante){
        String caminhoArquivo = "banco_assinantes.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            String linhaDeDados = assinante.getIdAssinante() + ";" + assinante.getNome() + ";" +
            assinante.getNumeroCelular() + ";" + assinante.getDataCadastro(); 
        

        bw.write(linhaDeDados);
        bw.newLine(); 
        System.out.println("SUCESSO: Assinante salvo!");
        }
    
        catch (IOException e){
            System.out.println("ERRO: erro ao salvar assinante!" + e.getMessage());
        }
    }

}
