package barmej.com;

import android.content.Context;

import java.util.Random;

public class RecyclingFactsGenerator {
    String[] facts;
    public RecyclingFactsGenerator(Context context)
    {
        facts = context.getResources().getStringArray(R.array.facts);
    }

    public String generateFact(){
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(facts.length);
        String fact= facts[randomNumber];
        return fact;
    }



}
