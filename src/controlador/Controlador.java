package controlador;

import view.Tela;
import model.ModelBean;
import model.ModelDao;

public class Controlador extends ModelBean {
	
	public static void main(String[] args) {
        Tela tela = new Tela();
        tela.criartela();
    }
    
    public void setsalvar(String nome){
        this.setNome(nome);
        ModelDao modelDao = new ModelDao();
        modelDao.salvar(this);
    }
}
