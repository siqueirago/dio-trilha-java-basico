Desafio de Controle de Fluxo

Este projeto foi desenvolvido como parte do módulo de Controle de Fluxo, seguindo o desafio proposto. O objetivo é criar um sistema que receba dois números inteiros e realize a impressão de uma contagem com base na diferença entre eles.

🚀 Objetivo

O sistema recebe dois números inteiros do usuário e:

Caso o primeiro número seja menor que o segundo, imprime a contagem incremental.

Caso contrário, lança uma exceção personalizada informando que o segundo número deve ser maior que o primeiro.

🛠 Estrutura do Projeto

O projeto contém as seguintes classes:

Contador.java: Classe principal que recebe os números do usuário, valida e executa a contagem.

ParametrosInvalidosException.java: Classe de exceção personalizada para validar a regra de negócio.

🏗 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/seu-usuario/DesafioControleFluxo.git

Navegue até o diretório do projeto:

cd DesafioControleFluxo

Compile o código:

javac Contador.java ParametrosInvalidosException.java

Execute o programa:

java Contador

Insira os números conforme solicitado e observe o resultado.

📌 Exemplo de Entrada e Saída

✅ Caso válido:

Entrada:

Digite o primeiro número:
12
Digite o segundo número:
15

Saída:

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3

❌ Caso inválido:

Entrada:

Digite o primeiro número:
20
Digite o segundo número:
10

Saída:

Erro: O segundo parâmetro deve ser maior que o primeiro

📝 Tecnologias Utilizadas

Java (JDK 8 ou superior)

Scanner para entrada de dados via terminal

Exceções Personalizadas para tratamento de erros

📌 Autor

Desenvolvido por Julio Siqueira como parte dos estudos na área de Tecnologia.