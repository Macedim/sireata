package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public interface DAO<T> {

    default void excluir (int id) throws SQLException{
          throw new RuntimeException("Esse método não é implementado na classe");
    }

     T buscarPorId(int id ) throws SQLException;


}
