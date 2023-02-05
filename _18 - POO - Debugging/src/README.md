<h1>Debugging Java</h1>
<p>Curso que apresenta conceitos introdutórios sobre como podemos trabalhar com debugging na linguagem Java. 
Curso este ministrado por mim em nome da <strong> <a href="https://web.digitalinnovation.one/home"> DIGITAL INNOVATION ONE  </a></strong> ?? e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

<h2>
? Pré-requistos
</h2>

- [x] Java JDK 8 ou superior
- [x] IDE para desenvolvimento Java

<h2> ? Ementa</h2>
<ol>
    <li>Visão Geral</li>
    <li>Pilha de Execução de um programa Java</li>
</ol>

<h2>Visão Geral</h2>

<p>Erros de programação são denominados bugs e o processo de encontrar e corrigir bugs é chamado de depuração ou debugging.</p>
<p>De forma geral, a depuração é uma tarefa difícil e trabalhosa, e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.</p>

<p>Existem duas grandes categorias que englobam a natureza do erro:</p>
<ul>
    <li><h3>Erros de Sintaxe:</h3>É um erro nas regras estabelecidas da linguagem:
        <ol>
            <li>Parênteses, chaves, colchetes que abrem mas não fecham.</li>
            <li>Duas instruções sem um ponto-e-vírgula entre elas;</li>
            <li>Uma palavra-chave sendo usada numa posição inesperada.</li>        
        </ol>
    </li>
    <li><h3>Erros de Semântica:</h3>  É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
        <ol>
            <li>Tentar dividir um número por uma String ou por zero.</li>
            <li>Atribuir um valor incoerente a um tipo de dado.</li>
            <li>Tentar fechar um arquivo que não foi aberto.</li>
        </ol>
    </li>
</ul>

<div align="center">
    <img src="https://media1.giphy.com/media/9o9dh1JRGThC1qxGTJ/giphy.gif?cid=ecf05e47e4eg6hhx3ku1sec3j55c616p31sgn63m6kf0kcmu&rid=giphy.gif&ct=g" width="600" height="400">
</div>

<h2>Depuração/Debugging</h2>
<p>Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções. </p>
<p>Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.</p>

<h2>Pilha de Execução de um Programa Java/Stack Trace</h2>
<p><h3>Pilha de Execução:</h3> Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.</p>
<p><h3>Stack Trace:</h3> É a matriz onde encontramos a pilha de excecução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.</p>

<h2>? Links Úteis</h2>
<ul>
    <li>https://confluence.jetbrains.com/display/IntelliJIDEA/14.+Depurador</li>
    <li>https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php</li>
</ul>

<h2>? Referências </h2>
<ul>
    <li>https://www.hostgator.com.br/blog/debug-desenvolvimento-web/</li>
    <li>https://www.alura.com.br/conteudo/java-excecoes</li>
    <li>https://pt.wikipedia.org/wiki/Depura%C3%A7%C3%A3o</li>
    <li>https://www.sentinelone.com/blog/java-stack-trace-understanding/</li>
    <li>https://www.caelum.com.br/apostila-java-orientacao-objetos/excecoes-e-controle-de-erros#exercicio-para-comecar-com-os-conceitos</li>
</ul>

<h2>? ?Redes Socias</h2>
<p align="center">
<a href="https://www.youtube.com/channel/UCqchrwxLd023IrA8KlCpH9g">YouTube</a> ??
<a href="https://www.instagram.com/estudant.i/">Instagram 1</a> ??
<a href="https://www.instagram.com/camimi_la/">Instagram 2</a> ??
<a href="https://www.linkedin.com/in/cami-la/">LinkedIn</a>
</p>


<h2> ? Contribuindo </h2>

Este repositório foi criado para fins de estudo, então contribua com ele.
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

??  Star o projeto

? Encontrar e relatar issues


------------

Disponibilizado com ? por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").
Gratidão a professora Camila Cavalcanti!