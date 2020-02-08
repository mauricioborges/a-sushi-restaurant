# README

TDD + Domain modeling exercise.

I've added gitignore from github repository for IDEA with: ``curl https://raw.githubusercontent.com/github/gitignore/master/Global/JetBrains.gitignore >> .gitignore

## Context:

A really tiny sushi restaurant. You order and pay at the same time. Then they handle your paid order to the sushi chefs 
through a standard restaurant order system. Due to obvious regulations you have a limit of 35 people inside the building. 
If it's raining they have way less movement than the usual, because there's no shelter.

## Problem: 

After you pay the cashier who took your order, the cashier hand the "comanda" over to the waiter. The waiter puts it in 
the "Porta-comandas". From there the sushi maker takes the "comanda" in order of arrival and makes the sushi. When it's done, 
the sushi maker will put it on the balcony and rings a bell. There will be no computerized system, all of it just with paper.


## Resolution

#### People:
1. Cashier
2. Waiter
3. Sushi maker
4. Client

#### Stuff:
1. Order
2. Payment
3. Porta comanda
4. Balcony
1. Comanda
1. Sushi

#### Actions:
1. Make the order
1. Take the order
1. Payment
1. Fulfill the comanda
1. Hand over the comanda 
1. Put the comanda on porta comandas
1. Takes the comanda in the order arrival
1. Makes Sushi
1. Puts on the balcony
1. Rings a bell

##### Take the order action:

* take order of 1 item

##### Payment action:
o client pede uma coisa do menu, indo no caixa
o caixa verifica qual o preço do item pedido
qual a forma de pagamento do client
client escolhe dinheiro ou cheque
o caixa recebe o pagamento
o caixa preenche o pedido

#### Process?


## Notas

20/12/2019:

1. I noticed that order and comanda it's not the same thing - Book?
1. In a real project what we should be prioritize firts? - Book?
1. Interfaces are contracts.
1. Generics in Java. - [https://www.baeldung.com/java-generics]
1. Iterator - What is this? [https://www.geeksforgeeks.org/iterators-in-java/]
1. Install KeyPromoterX on InteliJ - DONE
1. Primitive Types on Java - [https://www.javatpoint.com/java-data-types]
1. BDD vs TDD - [https://www.softwaretestinghelp.com/tdd-vs-bdd/]
1. Specification by example - [https://www.amazon.com.br/Specification-Example-Successful-Deliver-Software/dp/1617290084/ref=cm_wl_huc_item] 
1. DDD [https://dzone.com/articles/ddd-part-i-introduction] / [https://dddcommunity.org/]

3/1/2020:

1. tipos de pareamento (driver/navigator)
1. escolas de teste unitário, quais existem? porque?
1. multiplos asserts no mesmo teste
1. TODO: definir um fluxo inteiro para testar (happy path) pensando em código. Sugestão, usar um fluxograma ou um diagrama de sequência:


"Simples": 
client chega no restaurante vai no balcão e pega o menu
client escolhe item do menu
client vai até o caixa e faz o pedido desse item
client paga com dinheiro pro caixa
client espera chamar pelo numero da invoice
cozinha prepara o pedido e avisa que o numero da invoice tá feito
client pega o pedido no balcão pronto 
client come

"Mais simples mas nem tanto":

Lucas pede hot roll no caixa do restaurante
Lucas paga com dinheiro e recebe a invoice numero 1
Restaurante prepara o pedido do Lucas e grita o numero 1 quando o pedido estive pronto
Lucas vai até o balcão, pega o prato e come