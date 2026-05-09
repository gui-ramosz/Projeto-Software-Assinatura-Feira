import entity.Assinante;
import persistence.GerenciadorArquivo;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        //Assinante teste
        Assinante teste = new Assinante(1, "Guilherme Alves", "11912346789", new Date());
        //Tentando salvar
        GerenciadorArquivo g = new GerenciadorArquivo();
        g.salvarAssinante(teste);
    }
}