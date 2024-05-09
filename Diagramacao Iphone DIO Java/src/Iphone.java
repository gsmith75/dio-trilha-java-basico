import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
	public void ligar() {
		System.out.println("Fazendo ligação");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
