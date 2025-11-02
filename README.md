# Projeto Final de Programação Orientada a Objetos

Este projeto é para a avaliação final do módulo de POO, focado na aplicação prática dos pilares da Orientação a Objetos para a modelagem de um sistema simples de gestão de projetos.

## 🎯 Objetivo

O objetivo foi criar a estrutura de classes de um sistema de gestão, modelando as classes principais: **Usuário**, **Projeto** e **Tarefa**. O foco foi garantir o encapsulamento correto e as relações entre as classes.

## ✍️ Autor

* **Nome:** Israel Miguel dos Santos Quiroz
* **Curso:** Formação Full Stack - Treina Recife
* **Módulo:** POO
* **Professora:** Rebeca Valgueiro

## ✨ Conceitos Aplicados e Destaques

Para garantir um código limpo, funcional e robusto, os seguintes conceitos de Java e POO foram aplicados:

* **Pilares de POO:**
    * **Encapsulamento:** Todos os atributos das classes são `private`, acessados apenas por métodos `getters` e `setters`.
    * **Abstração:** Uso da interface `Exibicao` para definir uma regra (`exibirDetalhes()`) comum a todas as classes.
    * **Polimorfismo:** Demonstração na classe `App.java` de como `Usuario`, `Projeto`, e `Tarefa` são usados da mesma forma através da interface `Exibicao`.

* **Organização de Código (Pacotes):**
    * O projeto foi estruturado em pastas (`modelos`, `tipos`, `ajuda`, `main`) para separar responsabilidades e facilitar a manutenção.

* **Tratamento de Exceções:**
    * Criação de uma **Exceção Customizada** (`ErroDeLogica.java`) para lidar com regras de negócio (ex: impedir a adição de um participante duplicado).
    * O erro é tratado na classe `App.java` com um bloco `try-catch`, garantindo que o programa não pare de forma inesperada.

* **Enums:**
    * Uso de Enumerações para garantir a integridade dos dados de status e prioridade (ex: `StatusProjeto`, `StatusTarefa`, `Prioridade`).

## 🚀 Como Executar

1.  Este é um projeto Java padrão.
2.  A classe principal que contém a demonstração é a `App.java`, localizada em `src/main/`.
3.  Para executar, basta rodar o método `main()` dentro de `App.java`.
4.  O console exibirá o output de todas as operações, incluindo a captura do erro de lógica de negócio.
