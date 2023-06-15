package clases;

public class Matricula {
	// Atributos privados
		private int codigoMatricula, codigoAlumno, codigoCurso;
		
		// Constructor
		public Matricula(int codigoMatricula, int codigoAlumno, int codigoCurso) {
			this.codigoMatricula = codigoMatricula;
			this.codigoAlumno = codigoAlumno;
			this.codigoCurso = codigoCurso;
		}
		// Métodos de acceso público set/get
		public void setCodigoMatricula(int codigoMatricula) {
			this.codigoMatricula = codigoMatricula;
		}

		public void setCodigoAlumno(int codigoAlumno) {
			this.codigoAlumno = codigoAlumno;
		}

		public void setCodigoCurso(int codigoCurso) {
			this.codigoCurso = codigoCurso;
		}

		public int getCodigoMatricula() {
			return codigoMatricula;
		}

		public int getCodigoAlumno() {
			return codigoAlumno;
		}

		public int getCodigoCurso() {
			return codigoCurso;
		}

}
