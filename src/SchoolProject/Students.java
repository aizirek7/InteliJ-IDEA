package SchoolProject;

public class Students {
    private String name;
    private String lastName;
    private String klass;
    private int contract;
    private int id;

    public int getContractDebt() {
        return contractDebt;
    }

    public void setContractDebt(int contractDebt) {
        this.contractDebt = contractDebt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public int  getContract() {
        return contract;
    }

    public void setContract(int  contract) {
        this.contract = contract;
    }

    public int getId() {
        return id;
    }
    private int contractDebt;
    public Students(String name, String lastName, String klass, int contract) {
        this.name = name;
        this.lastName = lastName;
        this.klass = klass;
        this.contract = contract;
        this.id = getId();
        this.contractDebt = contract;
    }
}
