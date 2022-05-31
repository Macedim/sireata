package br.edu.utfpr.dv.sireata.dao.factory;
import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.DAO;
import br.edu.utfpr.dv.sireata.model.Anexo;

public class Factory {

    public  DAO instance(String tipo ){
        if(tipo.equals("Anexo")) {
            return new AnexoDAO();
        }

        if(tipo.equals("Ataparticipante")) {
            return new AnexoDAO();
        }
        return null;
    }
}
