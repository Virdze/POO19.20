package ExTele;

public class Telemovel {
    private String marca;
    private String modelo;
    private Resolucao resolucao;
    private int sms_Storage;
    private int f_apsStorage;
    private int f_storage;
    private int apsStorage;
    private byte totalStorage;
    private int num_fotos;
    private int num_Aps;
    private String[] nomesAps;

    public Telemovel(){
        this.marca = "";
        this.modelo = "";
        this.resolucao = new Resolucao();
        this.sms_Storage = 0;
        this.f_apsStorage = 0;
        this.f_storage = 0;
        this.apsStorage = 0;
        this.totalStorage = 0;
        this.num_fotos = 0;
        this.num_Aps = 0;
        this.nomesAps = new String[0];
    }

    public Telemovel(String ma, String mod, Resolucao res, int smsS, int fAps, int fS, int apsS,byte tS, int nf, int nAps, String[] nomAps){
        this.marca = ma;
        this.modelo = mod;
        this.resolucao = res;
        this.sms_Storage = smsS;
        this.f_apsStorage = fAps;
        this.f_storage = fS;
        this.apsStorage = apsS;
        this.totalStorage = tS;
        this.num_fotos = nf;
        this.num_Aps = nAps;
        this.nomesAps = nomAps;
    }

    public Telemovel(Telemovel t){
        this.marca = t.getMarca();
        this.modelo = t.getModelo();
        this.resolucao = t.getResolucao();
        this.sms_Storage = t.getSMStorage();
        this.f_apsStorage = t.getFAPStorage();
        this.f_storage = t.getFStorage();
        this.apsStorage = t.getAPStorage();
        this.totalStorage = t.getTStorage();
        this.num_fotos = t.getNumFotos();
        this.num_Aps = t.getNumAps();
        this.nomesAps = t.getNomesAps();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Resolucao getResolucao() {
        return resolucao;
    }

    public int getSms_Storage() {
        return sms_Storage;
    }

    public int getF_apsStorage() {
        return f_apsStorage;
    }

    public int getF_storage() {
        return f_storage;
    }

    public int getApsStorage() {
        return apsStorage;
    }

    public byte getTotalStorage() {
        return totalStorage;
    }

    public int getNum_fotos() {
        return num_fotos;
    }

    public int getNum_Aps() {
        return num_Aps;
    }

    public String[] getNomesAps() {
        return nomesAps;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setResolucao(Resolucao resolucao) {
        this.resolucao = resolucao;
    }

    public void setSms_Storage(int sms_Storage) {
        this.sms_Storage = sms_Storage;
    }

    public void setF_apsStorage(int f_apsStorage) {
        this.f_apsStorage = f_apsStorage;
    }

    public void setF_storage(int f_storage) {
        this.f_storage = f_storage;
    }

    public void setApsStorage(int apsStorage) {
        this.apsStorage = apsStorage;
    }

    public void setTotalStorage(byte totalStorage) {
        this.totalStorage = totalStorage;
    }

    public void setNum_fotos(int num_fotos) {
        this.num_fotos = num_fotos;
    }

    public void setNum_Aps(int num_Aps) {
        this.num_Aps = num_Aps;
    }

    public void setNomesAps(String[] nomesAps) {
        this.nomesAps = nomesAps;
    }



}
