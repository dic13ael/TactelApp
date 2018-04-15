package com.example.amandaeliasson.tactelapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView headerText = findViewById(R.id.header);
        TextView bodyText = findViewById(R.id.body);
        TextView linkText = findViewById(R.id.link);
        Intent intent = getIntent();
        final String link = intent.getStringExtra(NewsListItem.ARG_LINK);
        headerText.setText(intent.getStringExtra(NewsListItem.ARG_HEADER));
        bodyText.setText(intent.getStringExtra(NewsListItem.ARG_BODY));
        linkText.setText(link);
        linkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link));
                startActivity(i);
            }
        });

    }

}
