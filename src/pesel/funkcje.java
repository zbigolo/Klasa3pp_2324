/**********
 * @Author: Hubert Strączewski *
 * @Data: 01.03.2024 *
 **********/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class funkcje {
    protected String Pesel;

    public void Pesel(String Pesel) {
        this.Pesel = Pesel;
    }

    String isValidPesel(String pesel) {
        if (pesel.length() != 11) {
            return "Numer PESEL powinien mieć dokładnie 11 cyfr.";
        }
        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(pesel.charAt(i)) * weights[i];
        }
        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }
        if (checksum != Character.getNumericValue(pesel.charAt(10))) {
            return "Numer PESEL jest niepoprawny.";
        }else {
            return "Numer PESEL jest poprawny.";
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    String Plec(String pesel){
        String gender = getPlec(pesel);
        return "Płeć: " + gender + ".";
    }

    private String getPlec(String pesel) {
        int genderDigit = Character.getNumericValue(pesel.charAt(9));
        return (genderDigit % 2 == 0) ? "Kobieta" : "Mężczyzna";
    }
//----------------------------------------------------------------------------------------------------------------------
    String Data(String pesel){
        String data = getData(pesel);
        return "Data Urodzenia: " + data + ".";
    }

    private String getData(String pesel) {
        String year = pesel.substring(0, 2);
        String month = pesel.substring(2, 4);
        String day = pesel.substring(4, 6);
        int yearPrefix = Integer.parseInt(year);
        if (month.charAt(0) == '0' || month.charAt(0) == '1') {
            yearPrefix += 1900;
        } else if (month.charAt(0) == '2' || month.charAt(0) == '3') {
            yearPrefix += 2000;
            month = String.valueOf(Integer.parseInt(month) - 20);
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(yearPrefix + "-" + month + "-" + day);
            return dateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Nieznana data";
        }
    }

    public funkcje(String SprawdzPesel) {
        Pesel(SprawdzPesel);

    }
}
