package br.com.pessoal.games.dados

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object Banco {
    fun obterConexao(): Connection? {
        return try {
            DriverManager.getConnection("jdbc:mysql://localhost:3307/alugames", "root", "root")
        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }
}