package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Patient patients[]=new Patient[4];
        patients[0]=new Patient(1,"Zhndos","Nur","3540","rak");
        patients[1]=new Patient(1,"Zhndar","Alm","3546","pnevm");
        patients[2]=new Patient(1,"Zhnbol","Kokwetau","3548","orvi");
        patients[3]=new Patient(1,"Zhnbas","Krg","3549","rak");
        System.out.println("a) spisok patients diag");
        String diagnoz=sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(patients[i].getDiagnoz().equalsIgnoreCase(diagnoz)){
                System.out.println(patients[i].toString());
            }
        }
        System.out.println("b) spisok nomer medkart");
        String medkart=sc.nextLine();
        System.out.println("от:");
        int a = sc.nextInt();
        System.out.println("до:");
        int b = sc.nextInt();
        for (int i = 0; i <4 ; i++) {
            if(patients[i].getMedkart().equalsIgnoreCase(medkart)){
                System.out.println(patients[i].toString());
            }
        }

    }
}

class Patient {
    private    int id;
    private      String FIO,
            addres,
            medkart,
            diagnoz;
    public Patient(){
    }
    public int getId() {
        return id;
    }
    public String getFIO() {
        return FIO;
    }

    public String getAddres() {
        return addres;
    }
    public String getMedkart() {
        return medkart;
    }
    public String getDiagnoz() {
        return diagnoz;
    }

    public Patient(int ID, String FIO, String addres, String medkart, String diagnoz) {
        this.id = id;
        this.FIO = FIO;

        this.addres = addres;
        this.medkart = medkart;
        this.diagnoz = diagnoz;

    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", addres='" + addres + '\'' +
                ", medkart='" + medkart + '\'' +
                ", diagnoz='" + diagnoz + '\'' +
                '}';
    }
}