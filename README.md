# SISTEMA DE ASSINATURA DE CESTAS DE ALIMENTOS

## Descrição do Projeto
Este sistema foi desenvolvido em **Java** para gerenciar assinaturas semanais de alimentos orgânicos. A solução cobre todo o fluxo de negócio, desde o cadastro inicial até a validação financeira com operadora de cartão.

---

## Estrutura de Pastas (Arquitetura)
O projeto utiliza o padrão de camadas para separar as responsabilidades:

* **`src/boundary/`**: Interface com o usuário via terminal (CLI).
    * `TelaCadastro.java`, `TelaCatalogo.java`, `TelaCheckout.java`.
* **`src/control/`**: Lógica de negócio e intermediários.
    * `CadastroController.java`, `CheckoutController.java`.
* **`src/entity/`**: Modelos de dados.
    * `Assinante.java`, `Compra.java`, `CestaDaSemana.java`, `Pagamento.java`, `CartaoDeCredito.java`, `OperadoraDoCartao.java`...
* **`src/persistence/`**: Camada de acesso a dados.
    * `GerenciadorArquivo.java` (Manipulação de arquivos `.txt`).
* **`src/main/`**: Ponto de entrada do sistema.
    * `Main.java`.

---

## Banco de Dados (Arquivos .txt)
O sistema utiliza persistência em arquivos de texto, simulando um banco de dados relacional:
1.  **`banco_assinantes.txt`**: Dados cadastrais dos clientes.
2.  **`banco_cestas.txt`**: Itens selecionados e valores.
3.  **`banco_compras.txt`**: Registro de pedidos e status (CONCLUÍDA/CANCELADA).
4.  **`banco_enderecos.txt`**: Dados de logradouro para entrega.
5.  **`banco_pagamentos.txt`**: Histórico de transações financeiras.
6.  **`banco_preferencias.txt`**: Agendamento de dia/horário de entrega.

---


## Como Executar o Sistema (Direto no GitHub)

Como este projeto está hospedado no GitHub, você pode rodá-lo diretamente pelo navegador usando o **GitHub Codespaces**, sem precisar instalar nada na sua máquina!

### Passo a Passo
1. Na página principal deste repositório no GitHub, clique no botão verde **`<> Code`**.
2. Selecione a aba **`Codespaces`** e clique em **`Create codespace on main`** (ou abra um ambiente já existente).
3. Aguarde o editor carregar (um VS Code abrirá diretamente no seu navegador).
4. No menu lateral esquerdo (Explorer), navegue até o arquivo **`src/main/Main.java`**.
5. Abra o arquivo e clique no botão de **"Play" (Run Java)** no canto superior direito da tela.
6. Interaja com o sistema respondendo aos menus diretamente no terminal que se abrirá na parte inferior da tela!

## Via Terminal
1. **Entre na pasta do código-fonte:** cd src
2. **Compile o projeto:** javac Main.java
3. **Execute o sistema:** java Main

---



## Documentação e Planejamento
A implementação seguiu  os **Diagramas de Classes e de Fluxo** produzidos no início do projeto. A rastreabilidade entre o planejamento e o código garante que todos os requisitos de negócio foram atendidos.

---
