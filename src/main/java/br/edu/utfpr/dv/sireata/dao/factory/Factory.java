package br.edu.utfpr.dv.sireata.dao.factory;
import br.edu.utfpr.dv.sireata.bo.CampusBO;
import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.AtaParticipanteDAO;
import br.edu.utfpr.dv.sireata.dao.CampusDAO;
import br.edu.utfpr.dv.sireata.dao.DAO;
import br.edu.utfpr.dv.sireata.model.Anexo;

public class Factory {

    public  DAO instance(String tipo ){
        if(tipo.equals("Anexo")) {
            return new AnexoDAO();
        }

        if(tipo.equals("Ataparticipante")) {
            return new AtaParticipanteDAO();
        }

        if(tipo.equals("Campus")) {
            return new CampusDAO();
        }
        return null;
    }
}
