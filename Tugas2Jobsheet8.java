import java.util.Scanner;

public class Tugas2Jobsheet8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nama, perguruanTinggi, semuaNama = "",cabor = "";
        
        for(int i = 1; true;i++){
            System.out.print("Asal perguruan tinggi ke-"+i+" (ketik 'done' untuk berhenti): ");
            perguruanTinggi = sc.nextLine();
            if (perguruanTinggi.equalsIgnoreCase("done")) {
                System.out.println("Pendaftaran diselesaikan\n");
                break;
            }
            for (int o = 1; o <= 4 ; o++){
                
                if (o == 1){
                    cabor = "badminton";
                }else if (o == 2){
                    cabor = "tenis";
                }else if (o == 3){
                    cabor = "basket";
                }else if (o == 4){
                    cabor = "voli";
                }
                
                System.out.println("Tim atlet "+cabor+": ");
                
                for(int j = 1; j <= 5;j++){
                System.out.print("Nama atlet ke-"+j+" : ");
                nama = sc.nextLine();
                
                semuaNama += " "+perguruanTinggi + "\t : " + "\t" + nama + "\t\t terdaftar cabor ke-"+ cabor +"\n";
                }
                System.out.println();
            }
            System.out.println();
        }System.out.println("\t\t===Perguruan Tinggi dan Mahasiswa Yang terdaftar===\n");
        System.out.println("Perguruan Tinggi\tNama peserta\t\tJenis Cabor" );
        System.out.println(semuaNama);

        sc.close();
    }
                    }