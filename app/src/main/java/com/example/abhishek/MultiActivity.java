package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MultiActivity extends AppCompatActivity {


    Button b_play;
    Button b_play2;
    TextView tv_score;
    ImageView iv_player1choice, iv_player2choice;

    int player1Score, player2Score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        b_play = (Button) findViewById(R.id.b_play);
        b_play2 = (Button) findViewById(R.id.b_play2);

        iv_player1choice = (ImageView) findViewById(R.id.iv_player1Choice);
        iv_player2choice = (ImageView) findViewById(R.id.iv_player2Choice);

        tv_score = (TextView) findViewById(R.id.tv_score);


        b_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String player1Choice = "";
                Random r = new Random();


                int player1Choice_number = r.nextInt(3) + 1;
                if (player1Choice_number == 1) {
                    player1Choice = "rock";
                } else if (player1Choice_number == 2) {
                    player1Choice = "scissor";
                } else if (player1Choice_number == 3) {
                    player1Choice = "paper";
                }

                if (player1Choice == "rock") {
                    iv_player1choice.setImageResource(R.drawable.rock);

                } else if (player1Choice == "scissor") {
                    iv_player1choice.setImageResource(R.drawable.scissor);

                } else if (player1Choice == "paper") {
                    iv_player1choice.setImageResource(R.drawable.paper);

                }

                String message = play_turn("paper", "rock", "scissor");
                Toast.makeText(MultiActivity.this, message, Toast.LENGTH_SHORT).show();
                tv_score.setText("SCORE PLAYER1: " +Integer.toString(player1Score) +" || PLAYER2: "+Integer.toString(player2Score));


            }



        });


        b_play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String player2Choice = "";
                Random r = new Random();


                int player2Choice_number = r.nextInt(3) + 1;
                if (player2Choice_number == 1) {
                    player2Choice = "rock";
                } else if (player2Choice_number == 2) {
                    player2Choice = "scissor";
                } else if (player2Choice_number == 3) {
                    player2Choice = "paper";
                }

                if (player2Choice == "rock") {
                    iv_player2choice.setImageResource(R.drawable.rock);

                } else if (player2Choice == "scissor") {
                    iv_player2choice.setImageResource(R.drawable.scissor);

                } else if (player2Choice == "paper") {
                    iv_player2choice.setImageResource(R.drawable.paper);

                }

                String message = play_turn("paper", "rock", "scissor");
                Toast.makeText(MultiActivity.this, message, Toast.LENGTH_SHORT).show();
                tv_score.setText("SCORE PLAYER1: " +Integer.toString(player1Score) +" || PLAYER2: "+Integer.toString(player2Score));



            }
        });


    }

    private String play_turn(String paper, String rock, String scissor) {



        String player1choice="";

        String player2choice = "";
        if (player1choice == player2choice) {
            return "a better player wins the game";
        }
          else if (player1choice == "scissor" && player2choice == "paper") {
            player1Score++;
            return "Scissor cuts Paper. You Win!!!";

        } else if (player1choice == "rock" && player2choice == "scissor") {
            player1Score++;
            return "Rock crushes scissors. You Win!!!";

        } else if (player1choice == "rock" && player2choice == "paper") {
            player2Score++;
            return "Paper covers Rock . Computer Wins!!!";

        } else if (player1choice == "paper" && player2choice == "rock") {
            player1Score++;
            return "Paper covers Rock. You Win!!!";

        } else if (player1choice == "paper" && player2choice == "scissor") {
            player2Score++;
            return "Scissor cuts Paper. Computer Wins!!!";

        } else return "don't know";
    }

}




















