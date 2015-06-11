package pl.gpm.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        String msg = getResources().getString(R.string.msg);
        try
        {
            toast.getView().isShown();     // true if visible
            toast.setText(msg + " " + buttonText);  // update text
        }
        catch (Exception e)  // invisible if exception
        {
            toast = Toast.makeText(this, msg + " " + buttonText, Toast.LENGTH_SHORT); // create toast
        }
        toast.show();  //display toast
    }

}
