class Perjalanan {
    String jalan;
    String kota;
    int jarak;
    int waktu;
    String ISBN; 
    String orang;
    Perjalanan(String jal,String kot,int jar, int wak){
        jalan = jal;
        kota = kot;
        jarak = jar;
        waktu = wak;
    }
    public void setOrang(String name){
        orang = name;
    }
     public String getOrang() {   
         return orang;
    }
}
