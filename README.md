# SRM Interview Test

### PREMISSA

Desenvolver camada visual com AngularJS e um serviço para tratar das regras de negócio

Fique à vontade para definir a arquitetura e o modelo de persistência.

- Linguagem: Java

- Front-end: AngularJS

- Injeção de dependência: Spring

- Informações devem ser persistidas em um banco de dados.

### FLUXO DE TELA

Criar um formulário com os seguintes campos:

- Nome Cliente

Tipo: texto

- Limite de credito

Tipo: numérico (R$)

- Risco

Tipo: lista

Valores possíveis: A, B e C

### REGRAS DE NEGÓCIO

- Todas informações devem ser persistidas mais um campo indicando a taxa de juros.

- Todos campos são obrigatórios

- Se o risco for do tipo A manter os dados informados

- Se o risco for do tipo B, a taxa de juros deve ser de 10%

- Se o risco for do tipo C, a taxa de juros deve ser de 20%

______

# ARQUITETURA

Foi definida uma arquitetura modular de microserviços e RESTFUL com objetivo de desacoplar totalmente o backend do frontend, e bem como, independente da tecnologia do client.

O Banco de dados escolhido para esta solução foi o PostgreSQL uma solução de banco de dados objeto-relacional de código aberto com licença BSD, podendo ser utilizado livremente no projeto.

______

# INFORMÇÕES PARA TESTE

### BANCO DE DADOS
Usuário: srm
Senha: 20190317

### JSON

{
"name":"Thiago",
"creditLimit":10.000,
"risk":"A",
"interestRate":12
}


