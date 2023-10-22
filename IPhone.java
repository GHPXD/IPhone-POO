public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() { 
        System.out.println("Tocando música..."); 
    }
    public void pausar() { 
        System.out.println("Música pausada."); 
    }
    public void selecionarMusica(String musica) { 
        System.out.println("Selecionando a música: " + musica); 
    }
    public void ligar(String numero) { 
        System.out.println("Ligando para: " + numero); 
    }
    public void atender() { 
        System.out.println("Atendendo a chamada..."); 
    }
    public void iniciarCorreioVoz() { 
        System.out.println("Iniciando correio de voz..."); 
    }
    public void exibirPagina(String url) { 
        System.out.println("Exibindo a página: " + url); 
    }
    public void adicionarNovaAba(String url) {
         System.out.println("Adicionando nova aba com URL: " + url); 
        }
    public void atualizarPagina() {
        System.out.println("Atualizando a página..."); 
    }
}