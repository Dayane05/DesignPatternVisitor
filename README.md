#Design Pattern Visitor

##Introdução
O padrão Visitor permite que você adicione novas operações a uma estrutura de objetos sem modificar as classes dessas estruturas. Isso é especialmente útil quando você tem um conjunto de objetos de diferentes tipos e precisa realizar diferentes operações em cada um deles. Em vez de adicionar essas operações diretamente nas classes, o padrão Visitor permite que você as defina externamente em classes separadas, chamadas "Visitors".

##Definição
O padrão Visitor promove a separação de algoritmos de suas estruturas de dados. Em vez de implementar lógica diretamente nas classes dos objetos, você pode criar classes Visitor que encapsulam as operações. Isso resulta em um código mais flexível e fácil de manter.

##Exemplo
Neste projeto, demonstrei a implementação do padrão Visitor através de um exemplo prático. Sem o padrão, a lógica de cálculo do valor total de um carrinho de compras estaria diretamente dentro da classe CarrinhoCompras, o que criaria um acoplamento forte entre as classes.

Com o padrão Visitor, a lógica de cálculo é delegada para a classe CalculadoraValorTotal, que implementa a interface Visitor. Cada classe de produto, como Livro, Eletronico e Roupa, define o método aceitar, que recebe o Visitor e chama o método de visita correspondente. Isso torna o código mais modular e facilita a adição de novas operações no futuro.

##Estrutura do Projeto
CarrinhoCompras: Classe principal que contém os produtos.
Produto: Interface comum para todos os produtos.
Livro, Eletronico, Roupa: Classes que implementam a interface Produto.
Visitor: Interface para os Visitors.
CalculadoraValorTotal: Classe que implementa a interface Visitor e calcula o valor total dos produtos.
