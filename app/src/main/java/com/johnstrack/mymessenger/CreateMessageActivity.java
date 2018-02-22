package com.johnstrack.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class CreateMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onMessage() when the button is clicked
    public void onSendMessage (View view) {
        EditText messageView = findViewById(R.id.message);
        String messageText = messageView.getText().toString();
//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, messageText);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
//        startActivity(intent);
        startActivity(chosenIntent);
    }
}
