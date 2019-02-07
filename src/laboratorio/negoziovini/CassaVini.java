package laboratorio.negoziovini;

public class CassaVini {
	
	private final String nomeVino;
	private final int annata;
	
	public CassaVini(String nomeVino, int annata) {
		this.nomeVino = nomeVino;
		this.annata = annata;
	}

	public String getNomeVino() {
		return nomeVino;
	}

	public int getAnnata() {
		return annata;
	}
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeVino == null) ? 0 : nomeVino.hashCode());
		return result;
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CassaVini other = (CassaVini) obj;
		if (nomeVino == null) {
			if (other.nomeVino != null)
				return false;
		} else if (!nomeVino.equals(other.nomeVino))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "CassaVini [nomeVino=" + nomeVino + ", annata=" + annata + "]";
	}
	
	
	
	

}
