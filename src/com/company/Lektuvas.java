package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle(){

        try {
            vaziuokle();
            System.out.println("Ok, vaziuokle isskleista");

        }catch (LaikinaKlaida e){
            System.out.println("Svarbumas: laikina klaida " + e.getPriezastis());

        }catch (SvarbiKlaida e) {
            System.out.println("Svarbimas: svarbi klaida " + e.getPriezastis());

        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("Svarbumas: nezinoma klaida " + e.getPriezastis());
        } finally {
            System.out.println("Info : lektuvas skrenda vis dar skreenda :) ");
        }


    }
    private void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random random = new Random();
        int skaicius = random.nextInt(10);

        switch ( skaicius ){
            case 1:
                throw new VaziuoklesIsskleidimoKlaida("Neatsidare durys");
            case 3:
                throw new LaikinaKlaida("Nenusileido ratai");
            case 5:
                throw new SvarbiKlaida("Nuluzo sparnas");
            case 7:
                throw new LaikinaKlaida("Neveikia valytuvai");
            case 9:
                throw new SvarbiKlaida("neveikia abu varikliai");
        }
    }



}
