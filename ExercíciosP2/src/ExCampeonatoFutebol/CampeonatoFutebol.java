package ExCampeonatoFutebol;

public class CampeonatoFutebol {

	String[] times;

	void adicionarTimes(String times) {
		this.times = times.split(" ");
	}

	String[] criarCampeonato() {
		int qntdeJogos = (this.times.length - 1)*2;
		String[] campeonato = new String[qntdeJogos];
		
		int iCampeonato = 0;
		for(int iTimeCasa = 0; iTimeCasa < times.length - 1; iTimeCasa++) {
			String timeCasa = times[iTimeCasa];
			for(int iForaCasa = iTimeCasa +1 ; iForaCasa < times.length; iForaCasa++) {
				String timeFora = times[iForaCasa];
				
				campeonato[iCampeonato] = timeCasa + " x " + timeFora;
				iCampeonato ++;
			}
			
		}
		
		return campeonato;
	}
	
	
}
