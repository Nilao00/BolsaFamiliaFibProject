package br.fib.bolsafamilia;

import java.util.Objects;

public class BolsaFamilia {
	
    public BolsaFamilia(String cpf) {
		this.cpf = cpf;
	}

	public BolsaFamilia(String mesCompetencia,
                        String mesReferencia,
                        String uf,
                        String SIAFI,
                        String nomeMunicipio,
                        String NIS,
                        String cpf,
                        String nome,
                        Double valor) {
        this.mesCompetencia = mesCompetencia;
        this.mesReferencia = mesReferencia;
        this.uf = uf;
        this.SIAFI = SIAFI;
        this.nomeMunicipio = nomeMunicipio;
        this.cpf = cpf;
        this.NIS = NIS;
        this.nome = nome;
        this.valor = valor;
    }

    private String mesCompetencia;

    private String mesReferencia;

    private String uf;

    private String SIAFI;

    private String nomeMunicipio;

    private String cpf;

    private String NIS;

    private String nome;

    private Double valor;

    public String getMesCompetencia() {
        return mesCompetencia;
    }

    public void setMesCompetencia(String mesCompetencia) {
        this.mesCompetencia = mesCompetencia;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSIAFI() {
        return SIAFI;
    }

    public void setSIAFI(String SIAFI) {
        this.SIAFI = SIAFI;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		BolsaFamilia bolsaFamilia = (BolsaFamilia) obj;
		return this.cpf.equals(bolsaFamilia.cpf);
	}

	@Override
	public String toString() {
		return "BolsaFamilia [mesCompetencia=" + mesCompetencia + ", mesReferencia=" + mesReferencia + ", uf=" + uf
				+ ", SIAFI=" + SIAFI + ", nomeMunicipio=" + nomeMunicipio + ", cpf=" + cpf + ", NIS=" + NIS + ", nome="
				+ nome + ", valor=" + valor + "]";
	}
}
