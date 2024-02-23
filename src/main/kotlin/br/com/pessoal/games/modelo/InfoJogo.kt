package org.example.br.com.pessoal.games.modelo

data class InfoJogo(val info: InfoApiShark) {
    override fun toString(): String {
        return info.toString()
    }
}