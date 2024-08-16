# AgendaSantander


O Agenda Santander é o projeto final do primeiro módulo de Lógica de Programação do Santander Coders 2024 da turma Back-End 1173.

## O projeto consiste em:

Criar uma agenda de contatos, onde pode ser registrados vários contatos e seus dados. A aplicação terá o
seguinte formato:

>
>##################
> 
>#####AGENDA#####
> 
>##################
>
> 
> <br>
>---- Contatos ------
> 
>Id | Nome | Telefone | E-mail
> 
>1 | Alex Araujo | 11977775555 | alex@gmail.com
> 
>2 | Joao Gomes | 11988887777 | joaogomes@gmail.com
> 
> <br>
>
>----  Menu Contato ----
> 
>1 - Adicionar Contato
> 
>2 - Detalhar Contato
> 
>3 - Editar Contato
> 
>4 - Remover Contato
> 
>5 - Sair
> 
>


## Requisitos funcionais

RN1: Não é permitido armazenar contatos com telefones ja cadastrados; <br>
RN2: Para realizar as ações (detalhar, editar e remover), será necessário informar o telefone do contato;

## Quais foram os desafios no projeto?

Um dos principais desafios deste projeto foi garantir que todos os componentes funcionassem corretamente sem causar problemas imprevistos. Por exemplo, ao tentar editar um contato, ocorre um erro quando o número de telefone do contato é alterado corretamente, mas o nome e o e-mail não são atualizados. Este problema requer uma revisão de código para garantir que todas as informações sejam corrigidas conforme solicitado, sem impactar negativamente outras partes do aplicativo.

Outro grande desafio é verificar o formato do telefone. Este projeto deve garantir que o número de telefone inserido tenha exatamente 11 dígitos e seja composto apenas por números. Isso é difícil porque ao importar chamadas fora desse formato, o programa deve tratar os erros adequadamente, sem interromper o programa. Uma parte importante da configuração é implementar uma lógica de validação forte e garantir que o aplicativo lide com erros sem lançar exceções indesejadas.

## O que foi mais interessante?

O aspecto mais interessante deste projeto é a implementação de funções de edição de endereços e validação de entrada, bem como tratamento de erros. Trabalhar com a modificação de endereços e garantir que as atualizações sejam executadas corretamente fornece uma compreensão prática de como gerenciar e manipular dados em programas Java. A integração de diversas partes da aplicação, como autenticação telefônica e atualização de informações, torna o desenvolvimento mais desafiador e gratificante.

Além disso, este projeto oferece uma oportunidade de trabalhar com conceitos básicos de programação, como tratamento de exceções e validação de entrada. Implementar esses componentes e observá-los interagir é uma experiência de aprendizado. Ser capaz de modificar e otimizar o código para garantir uma operação tranquila e sem erros é uma parte muito benéfica do processo de desenvolvimento.

## O que pode ser melhorado?

Uma área que pode ser melhorada é a gestão e organização dos regulamentos. Embora o código funcione atualmente, existe a oportunidade de refatorar e simplificar algumas partes. Por exemplo, combinar a lógica de validação com métodos reutilizáveis ​​pode tornar o código mais limpo e fácil de manter. Isso também pode ajudar a reduzir a redundância e melhorar a legibilidade do código, facilitando futuras manutenções e atualizações.

Além disso, a interface do usuário pode ser melhorada para tornar a experiência mais confortável. Adicionar mensagens detalhadas e instruções claras para os usuários pode ajudar a evitar confusões e erros. Melhorar a forma como os usuários interagem com o aplicativo, por exemplo, fornecendo feedback mais claro sobre as ações realizadas, pode tornar o aplicativo mais agradável e prazeroso para o usuário. A implementação dessas melhorias pode levar a uma experiência geral mais agradável para os usuários finais.

## São integrantes desse projeto:

[<img alt="foto Alecsandro Auer" height="75px" src="https://avatars.githubusercontent.com/u/54159302?v=4" width="75px"/>](https://github.com/aleschopf)
[<img alt="foto Christina Carvalho" height="75px" src="https://avatars.githubusercontent.com/u/175761726?v=4" width="75px"/>](https://github.com/ChristinaC-dev)
[<img alt="foto Lucas Moraes" height="75px" src="https://avatars.githubusercontent.com/u/106927402?v=4" width="75px"/>](https://github.com/lsmoraes16)
[<img alt="foto Maria Eduarda" height="75px" src="https://avatars.githubusercontent.com/u/134453107?v=4" width="75px"/>](https://github.com/mariaemrqs)
[<img alt="foto Matheus Lima" height="75px" src="https://avatars.githubusercontent.com/u/102155883?v=4" width="75px"/>](https://github.com/mathlimam)
