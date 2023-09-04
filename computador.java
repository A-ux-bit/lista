public class computador extends Equipamento{

    private String cpu;
    private String ram;
    private String software;

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getSoftware() {
        return software;
    }
    public void setSoftware(String software) {
        this.software = software;
    }

    public String toString(){
        return(
            /*\n\n\ncodigo.....:" + this.getId() +
            "\nnome....." + this.getNome()+
            "\nmodelo..." + this.getModelo()+
            "\nfornecedor...." + this.getFornecedor()+
            "\ndata de aquisição...." + this.getDataAquisicao()+
            "\nativo....."+ this.getAtivo()+ */
            "\nC.P.U....."+ this.getCpu()+
            "\nR.A.M....."+ this.getRam()+
            "\nSoftware...."+ this.getSoftware()
        );

    }
}
