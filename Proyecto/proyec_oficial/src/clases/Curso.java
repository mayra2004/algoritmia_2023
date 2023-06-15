package clases;

public class Curso {
	// Atributos privados
		private int codigoCurso, codigoDocente, nombre, horas;

		// Constructor
		public Curso(int codigoCurso, int codigoDocente, int nombre, int horas) {
			this.codigoCurso = codigoCurso;
			this.codigoDocente = codigoDocente;
			this.nombre = nombre;
			this.horas = horas;
		}
		
		// Métodos de acceso público set/get
		public void setCodigoCurso(int codigoCurso) {
			this.codigoCurso = codigoCurso;
		}

		public void setCodigoDocente(int codigoDocente) {
			this.codigoDocente = codigoDocente;
		}

		public void setNombre(int nombre) {
			this.nombre = nombre;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public int getCodigoCurso() {
			return codigoCurso;
		}

		public int getCodigoDocente() {
			return codigoDocente;
		}

		public int getNombre() {
			return nombre;
		}

		public int getHoras() {
			return horas;
		}

}
