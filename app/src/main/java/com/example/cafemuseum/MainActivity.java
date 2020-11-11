
package com.example.cafemuseum;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.toast);
        b.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Thanks for ordering!!You will receive your order soon!",Toast.LENGTH_SHORT).show();
    }



    /**
     * This method is called when the order button is clicked.
     */

      int numberOfCoffees=2;
    public void submitOrder(View view) {
            displayPrice(numberOfCoffees*30);

    }
    public void morecoffees(View view){
        numberOfCoffees=numberOfCoffees+1;
        display(numberOfCoffees);
    }
    public void lesscoffees(View view){
        if(numberOfCoffees>2){
                numberOfCoffees=numberOfCoffees-1;}
        display(numberOfCoffees);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.priceValue);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityValue);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.priceValue);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }



}