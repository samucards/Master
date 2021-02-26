#Author: thamires_moreno@live.com

@tag
Feature: Shoestock

  @tag1
 Scenario: Realizar busca e validar produtos no carrinho
 Given que acesse o site "https://www.shoestock.com.br/"
 When Realizo um busca 
 And incluir o produto no carrinho
 Then Validar os Produtos includos no carrinho em tela de pagemento