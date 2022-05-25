## Algoritmo

Foram realizadas várias buscas e os artigos encontrados nessa busca foram adicionados em uma lista.
Para cada artigo encontrado, foi feito um mapeamento de quais consultas retornaram aquele
artigo em seu resultado.

Por exemplo:

| Artigo   | Consultas                          |
|----------|------------------------------------|
| Artigo 1 | Consulta 1, Consulta 2             |
| Artigo 2 | Consulta 2                         |
| Artigo 3 | Consulta 1, Consulta 3, Consulta 4 |
| Artigo 4 | Consulta 1, Consulta 2, Consulta 4 |
| Artigo 5 | Consulta 4                         |
| Artigo 6 | Consulta 2, Consulta 3, Consulta 4 |
| Artigo 7 | Consulta 2, Consulta 3             |

Foram filtrados somente os artigos que apareceram nas consultas definidas como essenciais e mais uma. 
Os artigos que não aparecem nessas consultas foram descartados.

Por exemplo, se a Consulta 2 for definida como essencial, a lista de artigos acima ficará conforme a seguir:

| Artigo   | Consultas                          |
|----------|------------------------------------|
| Artigo 1 | Consulta 1, Consulta 2             |
| Artigo 4 | Consulta 1, Consulta 2, Consulta 4 |
| Artigo 6 | Consulta 2, Consulta 3, Consulta 4 |
| Artigo 7 | Consulta 2, Consulta 3             |

Essa lista filtrada foi colocada na ordem decrescente da quantidade de consultas nas quais os artigos apareceram.

| Artigo   | Consultas                          |
|----------|------------------------------------|
| Artigo 4 | Consulta 1, Consulta 2, Consulta 4 |
| Artigo 6 | Consulta 2, Consulta 3, Consulta 4 |
| Artigo 1 | Consulta 1, Consulta 2             |
| Artigo 7 | Consulta 2, Consulta 3             |
| Artigo 2 | Consulta 2                         |

## Pesquisas Realizadas

* `(gut[Title/Abstract]) AND (microbiota[Title/Abstract]) AND (cardiovascular[Title/Abstract])`
* `(human[Title/Abstract]) AND (microbiota[Title/Abstract]) AND (dysbiosis[Title/Abstract])`
* `(intervention[Title/Abstract]) AND (studies[Title/Abstract])`
* `(microbiota[Title/Abstract]) AND (prevention[Title/Abstract]) AND (cardiovascular[Title/Abstract])`
* `(prebiotics[Title/Abstract])`
* `(probiotics[Title/Abstract])`
* `(symbiosis[Title/Abstract])`
* `(symbiotic[Title/Abstract]) AND (microbiota[Title/Abstract])`
* `(target[Title/Abstract]) AND (diet[Title/Abstract])`

## Pesquisas Essenciais

Foram definidas como essenciais as seguintes pesquisa: 
* `(human[Title/Abstract]) AND (microbiota[Title/Abstract]) AND (dysbiosis[Title/Abstract])`
* `(symbiotic[Title/Abstract]) AND (microbiota[Title/Abstract])`

## Resultado

Foram encontrados 109 artigos em que aparecem nas consultas essenciais e mais uma. Desses, foram selecionados
os artigos que aparecem em no mínimo 4 consultas, resultando em 24 artigos.

| Artigo   | Quantidade de consultas | Consultas |
| -------- | ----------------------- | --------- |
| 33166735 |                       5 | [human-microbiota-dysbiosis, gut-microbiota-cardiovascular, microbiota-prevention-cardiovascular, probiotics-microbiota, symbiotic-microbiota] |
| 27129691 |                       5 | [human-microbiota-dysbiosis, symbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 28131442 |                       5 | [human-microbiota-dysbiosis, gut-microbiota-cardiovascular, symbiosis, prebiotics, symbiotic-microbiota] |
| 28796176 |                       5 | [human-microbiota-dysbiosis, gut-microbiota-cardiovascular, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 34536490 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 35010297 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 30622429 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 32864300 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 32431782 |                       4 | [human-microbiota-dysbiosis, gut-microbiota-cardiovascular, microbiota-prevention-cardiovascular, symbiotic-microbiota] |
| 25469019 |                       4 | [human-microbiota-dysbiosis, symbiosis, probiotics-microbiota, symbiotic-microbiota] |
| 33965906 |                       4 | [human-microbiota-dysbiosis, symbiosis, probiotics-microbiota, symbiotic-microbiota] |
| 26175488 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 28421057 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 26366561 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 31190864 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 31586663 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 25400449 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 34449321 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 34712115 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 23159341 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 31205584 |                       4 | [human-microbiota-dysbiosis, gut-microbiota-cardiovascular, probiotics-microbiota, symbiotic-microbiota] |
| 32708743 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 35531940 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |
| 30639376 |                       4 | [human-microbiota-dysbiosis, prebiotics, probiotics-microbiota, symbiotic-microbiota] |