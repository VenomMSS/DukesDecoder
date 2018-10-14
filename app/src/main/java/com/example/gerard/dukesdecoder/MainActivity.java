package com.example.gerard.dukesdecoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String a = "this is mine";
    CypherSymbol c = CypherSymbol.BLANK;

    // com.example.gerard.dukesdecoder.MainActivity.CypherSymbol cs = com.example.gerard.dukesdecoder.MainActivity.CypherSymbol.LONG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static enum CypherSymbol {
        /* This Enum does not has to be changed.
         * A com.example.gerard.dukesdecoder.MainActivity.CypherSymbol may be short, long or a break (blank).
         * A MorseCharacter consists of a combination of CypherSymbols.
         */
        SHORT,
        LONG,
        BLANK
    }
}
