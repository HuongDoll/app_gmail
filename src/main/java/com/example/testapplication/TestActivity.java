package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    List<TestModel> itemps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        itemps =new ArrayList<TestModel>();

        itemps.add(new TestModel("Hương.HTT", "Sometimes people are beautiful.Not in looks.Not in what they say.Just in what they are.", "11/09/1999", R.drawable.round1));
        itemps.add(new TestModel("Hung.TM", "When someone loves you, the way they talk about you is different. You feel safe and comfortable.", "27/11/1999", R.drawable.round3 ));
        itemps.add(new TestModel("Anh.HV", "Be who you are and say what you mean, because those who mind don’t matter and those who matter don’t mind. ", "17/01/1999", R.drawable.round4 ));
        itemps.add(new TestModel("Lan.NT", "You never know what worse luck your bad luck has saved you from" , "27/08/1999", R.drawable.round5 ));
        itemps.add(new TestModel("Lam.lt", "If you want to go fast, go alone. If you want to go far, go together.", "14/01/1999", R.drawable.round6 ));
        itemps.add(new TestModel("Phuong.PTT", "Don’t cry because it’s over, smile because it happened.", "16/12/1999", R.drawable.round1 ));
        itemps.add(new TestModel("Bella Swan", "You only live once, but if you do it right, once is enough.", "11/09/1999", R.drawable.round2 ));
        itemps.add(new TestModel("Edward Currend", "To live is the rarest thing in the world. Most people exist, that is all.", "11/09/1999", R.drawable.round4 ));
        itemps.add(new TestModel("Te Mac", "Insanity is doing the same thing, over and over again, but expecting different results. ― Narcotics Anonymous", "11/09/1999", R.drawable.round3 ));
        itemps.add(new TestModel("Moc Ly Tam", " It does not do to dwell on dreams and forget to live.", "11/09/1999", R.drawable.round5 ));
        itemps.add(new TestModel("Ninh Tich", "Good friends, good books, and a sleepy conscience: this is the ideal life.", "11/09/1999", R.drawable.round6 ));
        itemps.add(new TestModel("Luc Dinh Kieu", "Life is what happens to us while we are making other plans", "11/09/1999", R.drawable.round ));
        itemps.add(new TestModel("Senh Ca", "Everything you can imagine is real.", "11/09/1999", R.drawable.round2 ));
        itemps.add(new TestModel("Phuong Tu", "Sometimes the questions are complicated and the answers are simple", "11/09/1999", R.drawable.round5 ));
        itemps.add(new TestModel("Luc Bac Than", "I’m not afraid of death", "11/09/1999", R.drawable.round4 ));
        itemps.add(new TestModel("Duong Lam Hang", "I just don’t want to be there when it happens.", "11/09/1999", R.drawable.round1 ));


        TestAdapter adapter=new TestAdapter(itemps);
        ListView listView=findViewById(R.id.text_test);
        listView.setAdapter(adapter);

    }
}
