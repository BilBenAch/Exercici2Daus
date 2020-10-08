import java.util.Arrays;
public class JocDaus {
        private Dau [] daus = new Dau[3];

        public JocDaus() {
                for(int i = 0; i<3; ++i){
                        daus[i] = new Dau();
                }

        }

        public void  Jugar(){
                for(int i = 0; i<3; ++i){
                        daus[i].tirar();
                }
        }
        public int comprobarVictoria(){
                int victoria= 0;
                if(daus[0].getDau() == daus[1].getDau() && daus[0].getDau() == daus [2].getDau()){
                        victoria = 1;
                }
                return victoria;
        }
        public Dau[] getDaus() {
                return daus;
        }


        public void setDaus(Dau[] daus) {
                this.daus = daus;
        }

        @Override
        public String toString() {
                return "JocDaus{" +
                        "dau=" + Arrays.toString(daus) +
                        '}';
        }
}
