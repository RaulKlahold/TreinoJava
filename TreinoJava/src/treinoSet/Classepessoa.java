package treinoSet;

import java.util.Objects;

public class Classepessoa  {
private String nome;

public String getNome() {
	return nome;
}

public Classepessoa(String nome) {
	super();
	this.nome = nome;
}

@Override
public String toString() {
	return "Classepessoa [nome=" + nome + "]";
}

@Override
public int hashCode() {
	return Objects.hash(nome);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Classepessoa other = (Classepessoa) obj;
	return Objects.equals(nome, other.nome);
}

public void setNome(String nome) {
	this.nome = nome;
}

}
