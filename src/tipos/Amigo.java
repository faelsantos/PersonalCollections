package tipos;

import enums.Parentesco;

/**
 * Representa um amigo do usuário.
 * 
 * @author Douglas Rafael
 *
 */
public class Amigo extends Pessoa {
	private String endereco;
	private String Telefone;
	private String email;
	private Parentesco parentesco;
	
	/**
	 * Método construtor.
	 *  
	 * @param nome
	 * @param sexo
	 * @param endereco
	 * @param telefone
	 * @param email
	 * @param parentesco
	 */
	public Amigo(String nome, char sexo, String endereco, String telefone,
			String email, Parentesco parentesco) {
		super(nome, sexo);
		setEndereco(endereco);
		setTelefone(telefone);
		setEmail(email);
		setParentesco(parentesco);
	}

	/**
	 * Recupera o endereço do amigo do usuário.
	 * 
	 * @return O endereço
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Seta o endereço.
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Recupera o telefone do amigo do usuário.
	 * 
	 * @return o telefone
	 */
	public String getTelefone() {
		return Telefone;
	}

	/**
	 * Seta o telefone.
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	/**
	 * Recupera o email do amigo do usuário.
	 * 
	 * @return O email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Seta o email.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Recupera o parentesco do amigo do usuário.
	 * 
	 * @return O parentesco
	 */
	public Parentesco getParentesco() {
		return parentesco;
	}

	/**
	 * Seta o parentesco do amigo.
	 * 
	 * @param parentesco
	 */
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Amigo)) {
			return false;
		} else {
			Amigo outroAmigo = (Amigo) o;
			return getId() == outroAmigo.getId();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone()
				+ "\nE-Mail: " + getEmail()
				+ "\nParentesco: " + getParentesco().getNome();
	}
}
