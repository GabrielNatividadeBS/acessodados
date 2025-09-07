package bo;

import dao.CursoDAO;
 

public class CursoBo {
    public void incluir(Curso curso){
        CursoDAO cursoDAO = new CursoDAO();
        cursoDAO.incluir( curso);
    }
}
