<p align="right"><img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/></p>
<h1 align="center">  Projeto SOLID - Aplicação dos Princípios SOLID em Java </h1>


<h2 align=""> 📌 Descrição do Projeto:  </h2>
Este é um projeto didático que demonstra a aplicação dos princípios SOLID no desenvolvimento de software com Java e Spring Boot. Cada princípio é aplicado de forma prática para garantir um código mais modular, flexível e fácil de manter.

## 🛠 Princípios SOLID Aplicados

- **S - Princípio da Responsabilidade Única (SRP):**
  - `PagamentoService` somente processa pagamentos.
  - `NotificacaoService` somente envia notificações.

- **O - Princípio Aberto/Fechado (OCP):**
  - Novos métodos de pagamento podem ser adicionados sem modificar `PagamentoServiceImpl`, usando o **Strategy Pattern**.

- **L - Princípio de Substituição de Liskov (LSP):**
  - `CartaoCreditoPagamento` e `PixPagamento` podem substituir `MetodoPagamento` sem alterar o comportamento esperado.

- **I - Princípio da Segregação de Interface (ISP):**
  - O repositório não foi incluído, mas poderia ser segregado para evitar métodos desnecessários.

- **D - Princípio da Inversão de Dependência (DIP):**
  - `PagamentoServiceImpl` depende de abstrações (`MetodoPagamento` e `NotificacaoService`), garantindo menor acoplamento.

---

## 🛠 Tecnologias Utilizadas

Aqui está uma lista das tecnologias e ferramentas utilizadas neste projeto. Sinta-se à vontade para adicionar mais conforme necessário:

- **Java**
- **Spring Boot**
- **Maven**
- **Strategy Pattern**
- **Outras bibliotecas e frameworks** (adicione aqui)

---

## 🚀 Como Executar o Projeto

Siga os passos abaixo para executar o projeto na sua máquina:

1. **Clone o repositório:**
   ```bash
   
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. **Navegue até o diretório do projeto:**
   ```bash  
   cd nome-do-repositorio

3. **Compile o projeto com Maven**
  ```bash
   mvn clean install
