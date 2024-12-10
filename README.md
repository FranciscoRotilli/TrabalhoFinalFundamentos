### Trabalho avaliado com grau 10,0/10,0 ###

## PONTIFÍCIA UNIVERSIDADE CATÓLICA DO RIO GRANDE DO SUL

## Escola Politécnica - Computação- 2024/2

Fundamentos de Programação - turma 30 -Enunciado do TF- Profa. Ana Paula

A empresa de equipamento médicos "Less is More" oferece um serviço de empréstimo para consultórios que não desejam investir na compra de equipamentos e contratou sua dupla/trio para desenvolver um software para organizar o sistema de empréstimo dos seus equipamentos.

A empresa empresta aparelhos de raio laser, aparelhos de eletroencefalograma, aparelhos de tratamentos dermatológicos variados.


![](https://web-api.textin.com/ocr_image/external/89dc85244350d141.jpg)

Ela deseja fazer o sistema padrão e abriu concorrência para escolher quem fara o desenvolvimento do sistema. Ela está interessada em ter um diferencial e pede que você além de surpreender, com alguma inovação o seu modelo de negócio, considere um sistema com estes itens:

### 1. Parte mandatória

Para orientar a sua modelagem do dados a serem processados crie as seguintes classes:

#### Classe *Equipamento* que terá os seguintes atributos:

 - código(int)
 - nome (String)
 - tipo: eletro, raio laser, audiometria, etc.
 - quantidade de horas do emprestimo (int).

Crie os métodos básicos para os atributos da classe (construtor, getters, setters e toString).

 - Valor (double) do empréstimo por 1 hora ou mais. Mínimo é 3 horas e o
   valor tem desconto de 5% se for por 24 horas ou mais e 10% se for por
   36 horas ou mais.
 - Seguro(boolean): se optar por seguro o valor e acrescido de 2%

Inclua na classe os seguintes métodos:

 - retirar: realiza a retirada de um equipamento
 - devolver: que realiza a devolução de um equipamento.

A retirada altera o status do equipamento para emprestado, apenas quando a retirada for possível (quanto o equipamento estiver disponível).

#### Classe *CadastroEquipa* (ela faz o gerenciamento dos equipamentos)

Nesta classe, serão armazenados os equipamentos disponíveis para o serviço de empréstimo da empresa, que são objetos da classe Equipamento.

Crie um construtor que cria o cadastro (vetor de objetos) que pode armazenar até10 equipamentos. Vocês devem cadastrar previamente 6 equipamentos (2 de cada tipo) para que se possa testar seu programa.

Além do construtor, esta classe deve ter os seuintes métodos:

 - adicionaEquipa que insere um objeto equipamento no vetor (recebe o equipamento e retorna true se a inserção pode ser realizada ou false se a inserção não foi possível)

 - removeEquipa que remove um objeto equipamento no vetor (recebe o equipamento e retorna true se a remoção pode ser realizada ou false se a remoção não foi possível)

 - buscaEquipaPeloNome (recebe o nome do equipamento e retorna o objeto , ou seja todas as informações deste equipamento),

 - totalEquipamentos (retorna o somatório de todas as quantidades de equipamentos disponíveis para empréstimo)

 - mostraEquipamento (mostra os dados dos objetos armazenados).

#### Classe chamada *Cliente* que terá os seguintes atributos:

- matrícula (int)//gerada pelo sistema ...associada à posição do vetor(sugestão)

- nome do cliente (String)

- empresa do cliente (String)

- dados equipamento retirado, cuide que este dado é um objeto do tipo Equipamento 

Obs.: existe uma regra: cada empresa pode alugar no máximo 1 equipamento de cada tipo.

Crie os métodos básicos para os atributos da classe (construtor, getters, setters e toString).

#### Classe *CadastroCliente* (O gerenciamento dos empréstimos deve ser feito nesta classe).

Nesta classe, serão armazenados os clientes do serviço de empréstimo da empresa, que são objetos da classe Cliente.

Crie um construtor que cria o cadastro (vetor de objetos) que pode armazenar até 10 clientes Além do construtor, esta classe deve ter os seguintes métodos:

- adicionaCliente que insere um objeto leitor no vetor (recebe o leitor e retorna true se a inserção pode ser realizada ou false se a inserção não foi possível),

- buscaClientePeloNome (recebe o nome do leitor e retorna o objeto que contém o nome do leitor)

- mostraClientes (mostra os dados dos objetos armazenados).

### Crie uma classe Emprestimo (aplicação) que deverá ter o método main onde o funcionário iráinformar qual operação ele/ela deseja realizar e, para isto crie os métodos adequados para a realização de cada uma das operações constantes no menu abaixo.

Opções do menu:

1-Incluir Cliente

2 - Mostrar clientes cadastrados

3-Pesquisar cliente por nome

4-Incluir equipamento

5-Mostrar equipamentos

6-Pesquisar equipamento por nome

7- Retirar equipamento

8 - Devolver equipamento

9- Quantidade total de equipamento disponíveis no sistema de empréstimo

10-&lt;&lt;***Parte da inovação:surpreenda o seu contratante colocando neste menu uma opção que vocês julguem ser um diferencial do seus sistema de maneira a ganhar a concorrência com outras empresas***&gt;&gt;&gt;

11-Sair do programa

Informações importantes:

1) Seu programa deve executar enquanto o funcionário não informar a opção de saída (opção 10).Ou seja, enquanto o programa está funcionado podem ser atendidos mais de um cliente.

2) A retirada e a devolução do equipamento deverão são feitas a partir do nome do cliente;

3) A retirada somente pode ser realizada se houver equipamentos disponíveis. Quando ela puder ser feita, a quantidade de equipamentos deve ser atualizada e o equipamento retirado ou devolvido pelo cliente deve ser atualizado.

4) Importante: O item 10 do menu, que consiste na inserção de algo NOVO no programa, deve ser ÚNICO e envolver o acesso a dados contidos em uma classe estruturada como VETOR de objetos. Cada grupo deve CRIAR algo original e distinto. Se for necessário altere as classes base para realizar este itens, fique à vontade. Lembrar de que isto repercutirá nas demais partes do seu programa. Esse item será ANULADO para TODOS os grupos em que houver similaridade entre os projetos. Não adianta "adotar" a ideia de outro grupo e "mascará-la" trocando nomes de variáveis, substantivos ou verbos.Esta é a oportunidade de demonstrar que o seu grupo compreendeu corretamente esse tipo de acesso.


![](https://web-api.textin.com/ocr_image/external/69bd2377eccaca42.jpg)

Have Fun...and learn!

Como seu Tf será avaliado?


| TRABALHO | TF | Integrantedo grau G1 |
| -- | -- | -- |
| Nome (s) da dupla/trio e número de matricula |  | Comentários |
| Arquivo em padrão Word com descrição detalhadados seguintes itens:- Fontes de consulta/ajuda utilizadas paraelaboração do programa (colegas, monitoria,amigos,familiares.. explicitando em que arte aajuda foi utilizada e o tipo de ajuda recebida)- Tipo de IA usada (link)a sequência de prompts e o resultado do códigomostrando o caminho e os refinos realizados-justificar oporquê do uso deste recurso e o queele lhe auxiliou na execução do TF- Lições aprendidas com este trabalho- Dificuldades encontradas e como as superaram-Nome e número de matrícula dos autores(Valor 3 pontos) | 3- atende totalmente2.0-atende parcialmente faltam algunsdetalhes solicitados1.0-tentativa que necessitade revisãopois as justificativa estão superficiais0-não tende ao solicitado |  |
| Execução sem erros(Valor 3) | 3-funciona perfeitamente semnecessidade de consulta ao fonte2-atende mas precisei consultar o fontepara fazer funcionar1.5- pelo menos 1 das opções do menunão funciona1- somente o menu funciona e aschamadas dos métodos não0-programa não funciona e/ou apresentaerros de compilação(não serão corrigidos os erros para que seuprograma funcione) |  |
| Inovação (Valor 2 pontos) | 1 Utiliza acesso a dados de uma classeestruturada como vetor de objetos0-Similaridade a outro programaapresentado |  |
| PitchVideo gravadono fórum da sala Moodle de entrega de até 2minutos explicando a estratégia usada paraorganizar o programa quem foi responsável porque parte...os pontos positivos do programa..eventuais "fragilidades" ou pontos a melhorarque julgam importante registrar.E, importante,qual foi o diferencial escolhido para ser implantado(Valor 2) | 2-vídeo aparecem os/as autores/as eexplicam o funcionamento do programaconforme solicitado1-vídeo aparecem apenas um dos/dasautores/as e explica o funcionamento doprograma conforme solicitado0-vídeo não entregue |  |
| Nota total:10 |  |  |
