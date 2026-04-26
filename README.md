
# Jogo Termo (Clone) - Java
Projeto simples em Java que replica a mecânica do popular jogo de palavras Termo (Wordle). O jogador deve adivinhar uma palavra secreta de 6 letras, recebendo dicas visuais a cada tentativa.
## Como funciona
O jogo escolhe uma palavra-alvo e o jogador tem tentativas ilimitadas para adivinhar, seguindo as seguintes regras de feedback:

    A própria letra: Indica que a letra está na posição correta.

    Sinal de interrogação (?): Indica que a letra existe na palavra, mas está na posição errada.

    Asterisco (*): Indica que a letra não existe na palavra ou já foi contabilizada em outra posição.

## Exemplo de Jogo

(A resposta é "Cartas")

Ao digitar uma palavra, digamos que seja "Travas", o sistema retornará algo como:

???*AS

## Lógica de Verificação

O código utiliza um sistema de duas passagens para garantir precisão nas dicas:

    Primeiro loop: Identifica as letras nas posições exatas e as marca para não serem contadas novamente.

    Segundo loop: Identifica as letras que existem em posições trocadas ou aquelas que estão totalmente incorretas.

