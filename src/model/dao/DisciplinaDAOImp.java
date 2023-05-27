package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.entities.Disciplina;

public class DisciplinaDAOImp {

	private Connection conexao;
	
	public DisciplinaDAOImp(Connection conexao) {
		this.conexao = conexao;
	}

	public void insert(Disciplina obj) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			String sql = "INSERT INTO disciplina (nomealuno) VALUES (?)";
			pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, obj.getNomeDisciplina());
			int linhas = pst.executeUpdate();
			
			if (linhas > 0) {
				rs = pst.getGeneratedKeys();
				rs.next();
				obj.setIdDisciplina(rs.getInt(1));
				System.out.println(obj.toString() + " foi criado com sucesso !");
			}
			else {
				System.out.println("Não foi possível cadastrar a disciplina !");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Disciplina obj) {
		
		
	}

	public void deleteById(Integer id) {
		
		
	}

	public Disciplina findById(Integer id) {
		return null;
	}

	public List<Disciplina> findAll() {
		return null;
	}
}
