package ar.edu.unju.fi.tp01_martinezlucas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Bisiesto;
import ar.edu.unju.fi.model.NOTA;
import ar.edu.unju.fi.model.Principal;
import ar.edu.unju.fi.model.mes;
import ar.edu.unju.fi.model.mes2;
import ar.edu.unju.fi.model.par_impar;

@SpringBootApplication
public class Tp01MartinezlucasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01MartinezlucasApplication.class, args);

		//prueba punto1
		Principal factoPrincipal = new Principal();
		factoPrincipal.setNum(4);
		System.out.println("El factorial es " + factoPrincipal.main());

		//prueba punto2
		Bisiesto biBisiesto = new Bisiesto();
		biBisiesto.setanio(2020);
		System.out.println("El año " + biBisiesto.Bi());

		//prueba punto3
		par_impar ppar = new par_impar();
		int aux=3;
		for(int i=0;i<5;i++){
			ppar.setNum(aux);
			System.out.println("El numero es "+ ppar.par());
			aux=aux+3;
		}

		//prueba punto4
		mes mmes = new mes();
		mmes.setNum(13);
		System.out.println(mmes.ME());

		//prueba punto5
		mes2 mmes2 = new mes2();
		mmes2.setNum(2);
		System.out.println(mmes2.ME());

		//prueba punto6
		NOTA nnota = new NOTA();
		aux=8;
		while(aux>0){
			nnota.setNum(aux);
			System.out.println(nnota.nota());
			aux--;
		}
	}

}
