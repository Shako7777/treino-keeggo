# language: pt
Funcionalidade: Creat Account

  	Contexto: 
    Dado que eu acesse o site "https://advantageonlineshopping.com/#/register"
    
@criandoNovaConta 
Esquema do Cenario: Criando nova conta
    E digito "<username>"
    E digito "<email>" 
    E digito "<senha>"
  	E confirmo "<confirSenha>"
  	E digito "<primeironome>"
    E digito "<ultimonome>"
    E digito "<celular>"  
    E seleciono o "<pais>"
    E digito "<cidade>" 
    E digito "<endereco>"
    E digito "<regiao>"
    E digito "<cep>"
    Entao clico no check box eu concordo
    
    Exemplos: 
      |		username	   | 		email		    | senha 	 | confirSenha | primeironome | ultimonome | celular    | pais   | cidade | endereco       | regiao | cep 			 |
      | Caiovinicius10 | caio@gmail.com |	Caio123@ | Caio123@    |	Caio				| Santos     | 97537-8872 | Brazil | Mogi   | R.Sao Joao,200 | SP     | 08717-400 |