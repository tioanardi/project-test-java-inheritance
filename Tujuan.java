class Tujuan {
     public static void main (String[] args){
         Perjalanan p1,p2;
         p1 = new Perjalanan("Jalan Asia Afrika","Bandung",30,4);
         p2 = new Perjalanan("Jalan Malioboro","Jogjakarta",40,8);
         p1.setOrang("Tio Rizky Anardi");
         
         System.out.println("Yang Melakukan Perjalanan p1:" + p1.getOrang());
         System.out.println("Yang Melakukan Perjalanan p2:" + p1.getOrang());
     }
 }
