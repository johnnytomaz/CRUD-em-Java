# Este é um CRUD todo feito em Java.

Neste projeto eu fiz um CRUD puro em Java.

A pasta Repository cuida de todo o CRUD e o Banco de Dados é um HashMap.
O projeto simula uma aplicação de Banco, e o POJO trata-se de duas classes (CashAccount e MarginAccount) que extendem uma interface TradeAccount.
Assim, pode-se criar duas Contas (Cash e Margin) e o Repository faz CRUD, enquanto a pasta Service chama o Repository através da Main.

Fiz o projeto todo em Java puro para entender realmente como funciona a Lógica de um CRUD, com a separação entre Service e Repository.

A partir disos, pretendo utilizar SpringBoot nos próximos projetos com a arquitetura padrão MVC.
