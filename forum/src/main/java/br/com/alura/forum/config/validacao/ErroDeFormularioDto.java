package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {

 String campo;
	private String erro;
	
	
	public ErroDeFormularioDto(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.erro = mensagem;
	}
	
	
	public String getCampo() {
		return campo;
	}


	public String getMensagem() {
		return erro;
	}
	
	

}
