#Author: Samuel Rodrigues


Feature: Teste Keenggo

@testekeenggo
Scenario: Realizar Cadastro e login

Given que estou no site "http://advantageonlineshopping.com/#/"
When Preencher as informacoes de Cadastro  
And Cadastro sera efetivado
And Preencher informacoes de Login 
Then Login sera concluido com sucesso
