package com.emjay;

public class strings2 {
    public static void main(String[] args) {
        String mpesa="NBS12MTPK Confirmed.ksh 600000.00 sent to Tom Matata 0702424734 on 28/2/19 at 6.10PM. New M-PESA balance is ksh 3400. Transaction cost, ksh 15.00";

        int pos_ksh = mpesa.indexOf("ksh");
        int pos_sent = mpesa.indexOf("sent");
        String amount = mpesa.substring(pos_ksh, pos_sent);
        System.out.println(amount);

        int pos_on = mpesa.indexOf(" on ")+3;
        int pos_at = mpesa.indexOf(" at ");
        String date = mpesa.substring(pos_on, pos_at);
        System.out.println(date);

        Function.areaCircle(21);



    }
}
