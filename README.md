# README

TDD + Domain modeling exercise.

I've added gitignore from github repository for IDEA with: ``curl https://raw.githubusercontent.com/github/gitignore/master/Global/JetBrains.gitignore >> .gitignore

## Context:

A really tiny sushi restaurant. You order and pay at the same time. Then they handle your paid order to the sushi chefs through a standard restaurant order system. Due to obvious regulations you have a limit of 35 people inside the building. If it's raining they have way less movement than the usual, because there's no shelter.

## Problem: 

Depois que tu paga a pessoa do caixa que tirou teu pedido entrega a comanda para o garçom e ele coloca a comanda no porta comandas. A partir daí a pessoa que faz o sushi pega os pedidos em ordem de chegada e faz o sushi. Depois de pronto, coloca no balcão e toca uma campainha. Não existirá sistema informatizado, tudo com papel.

## Resolution

Pessoas:
1. Caixa
2. Garçom
3. Pessoa que faz sushi
4. Cliente

Coisas:
1. Pedido
2. Pagamento
3. Porta comanda
4. Balcão
1. Comanda
1. Sushi

Ações:
1. Fazer o pedido
1. Tirar o pedido
1. Fazer pagamento
1. Preencher a comanda
1. Entregar a comanda 
1. Colocar a comanda no porta comandas
1. Pegar as comandas na ordem de chegada
1. Fazer o sushi
1. Colocar no balcão
1. Tocar camapainha

Processos?


## Notas

Observei que pedido e comanda não são a mesma coisa. Livro?
Num projeto teríamos que priorizar primeiro. Livro?
Interfaces são contratos.
Uso de Generics in Java.
Iterator - o que é?
Instalar o KeyPromoterX
Tipos Primitivos em Java
BDD vs TDD
Specification by example
DDD

