package ExCampeonatoFutebol;


public class MainCampeonatoFutebol {
	public static void main(String[] args) {
		
		CampeonatoFutebol camp = new CampeonatoFutebol();
		camp.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		String[] jogos = camp.criarCampeonato();
		for(String jogo : jogos) {
			System.out.println(jogo);
		}
	}
}
