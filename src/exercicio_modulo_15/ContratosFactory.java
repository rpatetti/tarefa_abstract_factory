package exercicio_modulo_15;

public class ContratosFactory extends Factory {

	@Override
	exercicio_modulo_15.Car retrieveCar(String requestedGrade) {
		if ("A".equals(requestedGrade)) {
			return new CorolaCar(100, "Cheio", "Prata");
		}else {
			return null;
		}
	}

}
