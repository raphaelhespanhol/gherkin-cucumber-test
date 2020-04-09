#language: pt
@criar_user @componente
Funcionalidade: Criar um novo produto
  Modelo de gherkin para análise

############################ CENÁRIO DE SUCESSO #############################
  @componente
  Esquema do Cenario: Validar cadastro de produto com sucesso
    Dado que desejo criar uma produto para <empreendimento>
    E com o cadastro via banco de dados retornando sucesso
    Quando solicito a criação do produto
    Então recebo na criação do produto o código http 204
    Exemplos:
      | empreendimento |
      | padaria        |
      | mercado        |