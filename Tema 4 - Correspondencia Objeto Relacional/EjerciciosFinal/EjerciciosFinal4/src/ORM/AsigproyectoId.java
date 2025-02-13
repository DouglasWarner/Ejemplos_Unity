package ORM;
// Generated 6 feb. 2020 21:57:31 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AsigproyectoId generated by hbm2java
 */
@Embeddable
public class AsigproyectoId  implements java.io.Serializable {


     private Date FInicio;
     private String dniEmp;
     private int idProy;

    public AsigproyectoId() {
    }

    public AsigproyectoId(Date FInicio, String dniEmp, int idProy) {
       this.FInicio = FInicio;
       this.dniEmp = dniEmp;
       this.idProy = idProy;
    }
   


    @Column(name="f_Inicio", nullable=false, length=10)
    public Date getFInicio() {
        return this.FInicio;
    }
    
    public void setFInicio(Date FInicio) {
        this.FInicio = FInicio;
    }


    @Column(name="dni_Emp", nullable=false, length=9)
    public String getDniEmp() {
        return this.dniEmp;
    }
    
    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }


    @Column(name="id_Proy", nullable=false)
    public int getIdProy() {
        return this.idProy;
    }
    
    public void setIdProy(int idProy) {
        this.idProy = idProy;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AsigproyectoId) ) return false;
		 AsigproyectoId castOther = ( AsigproyectoId ) other; 
         
		 return ( (this.getFInicio()==castOther.getFInicio()) || ( this.getFInicio()!=null && castOther.getFInicio()!=null && this.getFInicio().equals(castOther.getFInicio()) ) )
 && ( (this.getDniEmp()==castOther.getDniEmp()) || ( this.getDniEmp()!=null && castOther.getDniEmp()!=null && this.getDniEmp().equals(castOther.getDniEmp()) ) )
 && (this.getIdProy()==castOther.getIdProy());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFInicio() == null ? 0 : this.getFInicio().hashCode() );
         result = 37 * result + ( getDniEmp() == null ? 0 : this.getDniEmp().hashCode() );
         result = 37 * result + this.getIdProy();
         return result;
   }   


}


