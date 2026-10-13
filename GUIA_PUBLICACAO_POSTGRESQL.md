# Copia de trabalho: PostgreSQL e publicacao

Esta copia foi preparada a partir do ZIP enviado pelo docente.
A versao original MySQL nao foi modificada.

## O que mudou
- Driver MySQL substituido pelo PostgreSQL no `pom.xml`.
- `Conexao.java` usa `DB_URL`, `DB_USER` e `DB_PASSWORD` do ambiente.
- `application.properties` aceita a porta `PORT` definida pelo provedor.
- `database/estacionamento_postgresql.sql` cria a tabela `veiculo` no PostgreSQL.
- `Dockerfile` permite empacotar o Spring Boot em um conteiner Java.
- Arquivos `.git/`, `target/` e configuracoes locais nao foram copiados.

## Antes de executar
1. Crie um banco PostgreSQL de teste e execute `database/estacionamento_postgresql.sql`.
2. Configure as variaveis de ambiente no terminal ou na plataforma:
   - `DB_URL=jdbc:postgresql://HOST:5432/BANCO`
   - `DB_USER=USUARIO`
   - `DB_PASSWORD=SENHA`
3. Em PostgreSQL gerenciado, verifique exigencias de SSL e a URL JDBC do provedor.
4. Execute `mvn spring-boot:run` e teste cadastrar, listar, editar e excluir.
5. Somente depois prepare a publicacao. A gratuidade SEM CARTAO do provedor
   ainda precisa ser confirmada; nenhum servico foi contratado ou publicado.

## Observacoes
- Este ZIP nao inclui historico Git; crie um novo repositorio ou aplique as
  alteracoes com cuidado em uma branch da copia original.
- O `README.md` do projeto original descreve uma fase antiga do sistema.
  Para esta copia, use este guia como referencia de configuracao.
- A tabela `veiculo` foi convertida. Nenhum dado do MySQL foi migrado.
- O modelo de permanencias/entrada e saida NAO foi implementado nesta copia.
- Se a senha anterior do MySQL foi enviada a repositorios ou compartilhada,
  altere-a e revise o historico Git original antes de publicar.
- O funcionamento em um servidor remoto ainda nao foi validado.
