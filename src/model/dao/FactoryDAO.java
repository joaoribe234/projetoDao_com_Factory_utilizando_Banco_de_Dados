package model.dao;

import model.db.DB;

public class FactoryDAO {

	public static CursoDAO createCursoDAO() {
		return new CursoDAOImp(DB.getConexao());
	}
	
	public static AlunoDAOImp createAlunoDAO() {
		return new AlunoDAOImp(DB.getConexao());
	}
	
	public static DisciplinaDAOImp createDisciplinaDAO() {
		return new DisciplinaDAOImp(DB.getConexao());
	}
	

}
