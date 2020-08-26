ppublic class Cliente {
    String Nombre,Apellido,CC;
    String Residencia,Profesion;

    int Celular, TC, ClaveTC, TD, ClaveTD, CA, Cc, Prest;

    public Cliente(String nombre, String apellido, String CC, String residencia, String profesion, int celular, int TC, int claveTC, int TD, int claveTD, int CA, int cc, int prest) {
        Nombre = nombre;
        Apellido = apellido;
        this.CC = CC;
        Residencia = residencia;
        Profesion = profesion;
        Celular = celular;
        this.TC = TC;
        ClaveTC = claveTC;
        this.TD = TD;
        ClaveTD = claveTD;
        this.CA = CA;
        Cc = cc;
        Prest = prest;
    }

    public Cliente(String nombre, String apellido, String CC, String residencia, String profesion, int celular, int claveTC, int TD, int claveTD, int CA, int cc, int prest) {
        Nombre = nombre;
        Apellido = apellido;
        this.CC = CC;
        Residencia = residencia;
        Profesion = profesion;
        Celular = celular;
        this.TC = TC;
        ClaveTC = claveTC;
        this.TD = TD;
        ClaveTD = claveTD;
        this.CA = CA;
        Cc = cc;
        Prest = prest;
    }

    public void AgregarCliente(){


    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String residencia) {
        Residencia = residencia;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String profesion) {
        Profesion = profesion;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public int getClaveTC() {
        return ClaveTC;
    }

    public void setClaveTC(int claveTC) {
        ClaveTC = claveTC;
    }

    public int getTD() {
        return TD;
    }

    public void setTD(int TD) {
        this.TD = TD;
    }

    public int getClaveTD() {
        return ClaveTD;
    }

    public void setClaveTD(int claveTD) {
        ClaveTD = claveTD;
    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        this.CA = CA;
    }

    public int getCc() {
        return Cc;
    }

    public void setCc(int cc) {
        Cc = cc;
    }

    public int getPrest() {
        return Prest;
    }

    public void setPrest(int prest) {
        Prest = prest;
    }

    public String EditName(){
        return "ss";
    }

    public String EditApellido(){
        return "ss";
    }

    public int Celular(){
        return 123;
    }
}
