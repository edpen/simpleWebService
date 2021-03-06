package glavni.dto;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class GradoviDto  {
        private  long id;
        @NotNull
        private  String grad;
        @NotNull
        private  String drzava;
        public GradoviDto ( long id,String grad,String drzava)
        {
            this.id=id;
            this.grad=grad;
            this.drzava=drzava;
        }
        public GradoviDto(){}

    public long getId(){
        return id;
    }
    public void setId(long id){ this.id=id;}
    public String getGrad(){
        return grad;
    }
    public void setGrad(String grad){this.grad=grad;}
    public String getDrzava(){
        return drzava;
    }
    public void setDrzava(String drzava){this.drzava=drzava;}

}
