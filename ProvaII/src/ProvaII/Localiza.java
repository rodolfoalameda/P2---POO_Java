package ProvaII;

public class Localiza extends Locadora {

	public Localiza() {

	}

	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {

		if (carro.isAlugado() == true) {
			throw new CarroAlugadoException();
		}

		else {
			carro.setAlugado(true);
			double contaF = 0;
			double contaI = carro.getDiaria() * 1.2;

			int diaInicial = dataInicio.getDia();
			int mesInicial = dataInicio.getMes();

			int diaFinal = dataFim.getDia();
			int mesFinal = dataFim.getMes();

			if (mesInicial == mesFinal) {
				contaF = contaI * (diaFinal - diaInicial);
			} else {
				if (diaInicial > diaFinal) {
					contaF = contaI * ((30 - diaInicial) + diaFinal) + contaI * ((mesFinal - mesInicial - 1) * 30);
				} else if (diaInicial < diaFinal) {
					contaF = contaI * (diaFinal - diaInicial) + contaI * ((mesFinal - mesInicial) * 30);
				} else {
					contaF = contaI * ((mesFinal - mesInicial) * 30);
				}
			}
			return contaF;
		}

	}

	@Override
	public double alugarCarro(String string, Data dataInicio, Data dataFim) throws CarroAlugadoException {
		// TODO Auto-generated method stub
		return 0;
	}

}
