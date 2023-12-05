import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        // Nilai yang telah ditentukan untuk username dan password
        String usernameTersimpan = "atrinlinggau";
        String passwordTersimpan = "crislampung";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah input sesuai dengan nilai yang telah ditentukan
        if (usernameInput.equals(usernameTersimpan) && passwordInput.equals(passwordTersimpan)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}