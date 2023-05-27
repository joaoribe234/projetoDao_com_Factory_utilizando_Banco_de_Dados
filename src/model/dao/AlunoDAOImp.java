package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.entities.Aluno;

public class AlunoDAOImp {

private Connection conexao;
	
	public AlunoDAOImp(Connection conexao) {
		this.conexao = conexao;
	}

	public void insert(Aluno obj) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			String sql = "INSERT INTO aluno (nomealuno) VALUES (?)";
			pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, obj.getNomeAluno());
			int linhas = pst.executeUpdate();
			
			if (linhas > 0) {
				rs = pst.getGeneratedKeys();
				rs.next();
				obj.setIdAluno(rs.getInt(1));
				System.out.println(obj.toString() + " foi criado com sucesso !");
			}
			else {
				System.out.println("Não foi possível cadastrar o aluno !");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Aluno obj) {
		
		
	}

	public void deleteById(Integer id) {
		
		
	}

	public Aluno findById(Integer id) {
		
		return null;
	}

	public List<Aluno> findAll() {
		
		return null;
	}
	
}
