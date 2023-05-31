package pessoa_casa_aluguel;

public class Casa {
	private Pessoa proprietario;
	private String endereco;
	private String bairro;
	
	public Casa(Pessoa proprietario, String endereco, String bairro, double precoVenda) {
		super();
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.bairro = bairro;
		this.precoVenda = precoVenda;
	}
	@Override
	public String toString() {
		return "Casa [proprietario=" + proprietario + ", endereco=" + endereco + ", bairro=" + bairro + ", precoVenda="
				+ precoVenda + "]";
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	private double precoVenda;
	
}
