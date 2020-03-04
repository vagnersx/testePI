
**Identificação**

Funcionário do Serviço Federal de Processamento de Dados (SERPRO) e integrante da equipe responsável pela integração do SPI com o sistema recebedor de pagamentos do Tesouro Nacional.

  

**Assunto**

Alternativa à proposta que foi enviada referente a "Iniciação de Pagamento por Link".

> Observação: Não sei se essa alternativa já foi abordada e rejeitada previamente pelo GT, se já, fica o registro.  

  

**Contexto**

O QR Code não passa de uma forma de representação de alguma informação, neste caso ele representa o conjunto de informações necessárias para a iniciação de um pagamento via Pix. Uma vez que um usuário esteja utilizando um dispositivo móvel, o QR Code não poderá ser utilizado de forma direta para disponibilizar esse conjunto de informações. Sendo assim uma alternativa simples seria fazer uso de um dos primeiros e mais importantes paradigmas na Interação homem-computador, o "Copiar e Colar",

  

**Proposta**

A ideia seria enviar ("Copiar") esse conjunto de informações (presentes dentro do QR Code) para a "área de transferência" do dispositivo e uma vez que o usuário acessasse o app de seu PSP para efetuar o pagamento, o app do PSP de forma automática consultaria ("Colar") esse conjunto de informações, faria as validações já previstas e mostraria as informações do pagamento para confirmação.

  

Com relação ao fornecimento de uma boa usabilidade para o usuário final, no contexto onde o usuário está utilizando um  *E-commerce*, não teria muita diferença do cenário onde ele teria um QR Code para ler na câmera de seu dispositivo (onde o usuário procura pelo app de seu PSP e seleciona a opção para pagar com Pix) . A única diferença seria que ele teria que selecionar alguma opção para "copiar" o conjunto de informações para a área de transferência. No contexto menos usual onde o usuário recebe o QR Code por meio digital (e-mail, mensagens etc.), ele poderia continuar recebendo a imagem do QR Code, porém além dela também iria o código presente dentro do QR Code (em um formato a ser decidido, por exemplo, Base64), juntamente das orientações de como utilizá-lo.

  

Com relação à garantia da segurança do processo, por ser praticamente o mesmo fluxo usando QR Code já idealizado hoje, a única observação seria apenas avaliar a possibilidade de manipulação da área de transferência; porém as informações presentes na área de transferência também passarão pelas validações já previstas no app do psp pagador.

  

Destaca-se também que por se tratar da utilização da "área de transferência" que é um recurso existente praticamente em todo dispositivo, essa abordagem também poderia ser utilizada para pagamentos via "internet banking" e não apenas via app (todos os cenários de uso através de QR Code - cenários que se iniciam pelo usuário recebedor - exigem a utilização de um app em algum momento do fluxo).

  

**Vantagens da abordagem**  

-   Utilização de praticamente a mesma experiência atingida no uso de QR Codes, onde o usuário busca pelo app de seu PSP e seleciona a opção para pagar.
-   Simplicidade de implementação tanto por parte dos PSPs dos pagadores quanto por parte dos PSPs dos recebedores (não precisando de ações por parte do Banco Central).
-   A solução não fica dependente de uma tecnologia ou sistema operacional (android, ios etc.).
-   O app do PSP do usuário pagador já poderá reconhecer as informações do Pix copiadas na "Área de transferência" de forma automática.

**Exemplo de uso**

Para exemplificar o uso dessa abordagem em um cenário de *E-commerce*, disponibilizamos no endereço "[http://teste.vsxapps.com](http://teste.vsxapps.com/)" uma aplicação que simula de uma forma bem simples uma loja virtual e um app no endereço "[https://play.google.com/store/apps/details?id=br.com.testePI](https://play.google.com/store/apps/details?id=br.com.testePI)" que também de forma simples simula o app de um PSP Pagador. Nesta simulação poderá ser observada como pode ser realizada a comunicação entre sistemas heterogêneos por meio da "Área de transferência".

> Observação: Deve ser utilizado um smartphone para realização desse testes.
