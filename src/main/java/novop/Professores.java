package novop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professores {
	@Id
	@GeneratedValue
	private Long id;

	private String nomeProfessor1;

	private String graducaoProfessor1;

	private String horasAlocadas1;
	// Segundo Professor
	private String nomeProfessor2;

	private String graducaoProfessor2;

	private String horasAlocadas2;
	// Terceiro Professor
	private String nomeProfessor3;

	private String graducaoProfessor3;

	private String horasAlocadas3;
	// Quarto Professor
	private String nomeProfessor4;

	private String graducaoProfessor4;

	private String horasAlocadas4;
	// Quinto Professor
	private String nomeProfessor5;

	private String graducaoProfessor5;

	private String horasAlocadas5;

	public Professores() {
	}

	public Professores(String nomeProfessor1, String graducaoProfessor1, String horasAlocadas1,
			String nomeProfessor2, String graducaoProfessor2, String horasAlocadas2, String nomeProfessor3,
			String graducaoProfessor3, String horasAlocadas3, String nomeProfessor4, String graducaoProfessor4,
			String horasAlocadas4, String nomeProfessor5, String graducaoProfessor5, String horasAlocadas5) {
		//this.id = id;
		this.nomeProfessor1 = nomeProfessor1;
		this.graducaoProfessor1 = graducaoProfessor1;
		this.horasAlocadas1 = horasAlocadas1;

		this.nomeProfessor2 = nomeProfessor2;
		this.graducaoProfessor2 = graducaoProfessor2;
		this.horasAlocadas2 = horasAlocadas2;

		this.nomeProfessor3 = nomeProfessor3;
		this.graducaoProfessor3 = graducaoProfessor3;
		this.horasAlocadas3 = horasAlocadas3;

		this.nomeProfessor4 = nomeProfessor4;
		this.graducaoProfessor4 = graducaoProfessor4;
		this.horasAlocadas4 = horasAlocadas4;

		this.nomeProfessor5 = nomeProfessor5;
		this.graducaoProfessor5 = graducaoProfessor5;
		this.horasAlocadas5 = horasAlocadas5;
	}
	
	// GETTERS and SETTERS
	public Professores(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProfessor1() {
        return nomeProfessor1;
    }

    public void setNomeProfessor1(String nomeProfessor1) {
        this.nomeProfessor1 = nomeProfessor1;
    }

    public String getGraducaoProfessor1() {
        return graducaoProfessor1;
    }

    public void setGraducaoProfessor1(String graducaoProfessor1) {
        this.graducaoProfessor1 = graducaoProfessor1;
    }

    public String getHorasAlocadas1() {
        return horasAlocadas1;
    }

    public void setHorasAlocadas1(String horasAlocadas1) {
        this.horasAlocadas1 = horasAlocadas1;
    }
    //2
    public String getNomeProfessor2() {
        return nomeProfessor2;
    }

    public void setNomeProfessor2(String nomeProfessor2) {
        this.nomeProfessor2 = nomeProfessor2;
    }

    public String getGraducaoProfessor2() {
        return graducaoProfessor1;
    }

    public void setGraducaoProfessor2(String graducaoProfessor2) {
        this.graducaoProfessor2 = graducaoProfessor2;
    }

    public String getHorasAlocadas2() {
        return horasAlocadas2;
    }

    public void setHorasAlocadas2(String horasAlocadas2) {
        this.horasAlocadas2 = horasAlocadas2;
    }
    //3
    public String getNomeProfessor3() {
        return nomeProfessor3;
    }

    public void setNomeProfessor3(String nomeProfessor3) {
        this.nomeProfessor3 = nomeProfessor3;
    }

    public String getGraducaoProfessor3() {
        return graducaoProfessor3;
    }

    public void setGraducaoProfessor3(String graducaoProfessor3) {
        this.graducaoProfessor3 = graducaoProfessor3;
    }

    public String getHorasAlocadas3() {
        return horasAlocadas3;
    }

    public void setHorasAlocadas3(String horasAlocadas3) {
        this.horasAlocadas3 = horasAlocadas3;
    }
    // 4
    public String getNomeProfessor4() {
        return nomeProfessor4;
    }

    public void setNomeProfessor4(String nomeProfessor4) {
        this.nomeProfessor4 = nomeProfessor4;
    }

    public String getGraducaoProfessor4() {
        return graducaoProfessor4;
    }

    public void setGraducaoProfessor4(String graducaoProfessor4) {
        this.graducaoProfessor4 = graducaoProfessor4;
    }

    public String getHorasAlocadas4() {
        return horasAlocadas4;
    }

    public void setHorasAlocadas4(String horasAlocadas4) {
        this.horasAlocadas4 = horasAlocadas4;
    }
    // 5
    public String getNomeProfessor5() {
        return nomeProfessor5;
    }

    public void setNomeProfessor5(String nomeProfessor5) {
        this.nomeProfessor5 = nomeProfessor5;
    }

    public String getGraducaoProfessor5() {
        return graducaoProfessor5;
    }

    public void setGraducaoProfessor5(String graducaoProfessor5) {
        this.graducaoProfessor5 = graducaoProfessor5;
    }

    public String getHorasAlocadas5() {
        return horasAlocadas5;
    }

    public void setHorasAlocadas5(String horasAlocadas5) {
        this.horasAlocadas5 = horasAlocadas5;
    }
	
}
