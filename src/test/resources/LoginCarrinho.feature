# language: pt
Funcionalidade: Login para o Carrinho

  	Contexto: 
    Dado que eu acesse o site "https://www.advantageonlineshopping.com/#/shoppingCart"
    
@logincarrinho
Esquema do Cenario: Realizando Login para o Carrinho
    E clico em User para Login
    E digito o login "<username>"
    E digito a senha "<password>"
    E clico sign in
    E clico continue shopping
    
       
    Exemplos: 
      | username		   | password |
      | Caiovinicius10 | Caio123@ |
