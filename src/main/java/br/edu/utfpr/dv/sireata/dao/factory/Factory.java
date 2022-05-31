package br.edu.utfpr.dv.sireata.dao.factory;
import br.edu.utfpr.dv.sireata.dao.*;


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

        if(tipo.equals("Pauta")) {
            return new PautaDAO();
        }
        return null;
    }
}
