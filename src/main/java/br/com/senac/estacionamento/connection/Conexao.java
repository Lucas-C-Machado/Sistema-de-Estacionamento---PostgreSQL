
package br.com.senac.estacionamento.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexao JDBC com PostgreSQL.
 * Configure DB_URL, DB_USER e DB_PASSWORD
 * no ambiente de execucao.
 */
public class Conexao {

    public static Connection conectar() throws SQLException {

        String url = System.getenv("DB_URL");
        String usuario = System.getenv("DB_USER");
        String senha = System.getenv("DB_PASSWORD");

        if (url == null || url.isBlank()
                || usuario == null || usuario.isBlank()
                || senha == null || senha.isBlank()) {

            throw new SQLException(
                "Configure DB_URL, DB_USER e DB_PASSWORD nas variaveis de ambiente."
            );
        }

        if (!url.startsWith("jdbc:postgresql://")) {
            throw new SQLException(
                "DB_URL deve ser uma URL JDBC PostgreSQL."
            );
        }

        return DriverManager.getConnection(url, usuario, senha);
    }
}
