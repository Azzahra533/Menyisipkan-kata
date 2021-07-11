import java.util.Scanner;
/**
 *
 * @author 26218
 * 
 */
public class Tambahkata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a[]={"Saya","Sedang","Belajar","Struktur","Data"},element; 
        int posisi = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Array asli:");
        for(int i=0;i<a.length;i++){ //cara perulangan spesifik
            System.out.println(a[i]+" ");
        }
        System.out.println("\nMasukan elemen untuk ditambahkan : ");
        element = sc.next();
        System.out.println("\nMasukan posisi array dari elemen : ");
        posisi = sc.nextInt();
        String b[]=new String [a.length+1];
        System.arraycopy(a, 0, b, 0, posisi-1);
        b[posisi-1]=element;
        System.arraycopy(a, posisi-1, b, posisi, a.length - posisi+1);
        System.out.println("\nArray setelah data disisipkan : ");
        for(int i=0;i<b.length;i++){//cara perulangan praktis tampil data saja
            System.out.println(b[i]+" ");
        }
    }
    
}
