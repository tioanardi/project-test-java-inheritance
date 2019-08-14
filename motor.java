class motor extends kendaraan {
   
       String keseluruhan ;
       motor (String mrk , String tip , int har , String ten, String a){
           super (mrk,tip,har,ten);
       keseluruhan = a;
    }  
       public String print(motor r){
           return   "\n Merek :" + r.Merek +
                    "\n Tipe :" + r.Tipe +
                    "\n Harga :"+ r.Harga +
                    "\n Tenaga : "+ r.Tenaga +
                    "\n Keseluruhan :" + r.keseluruhan;
    }
}
