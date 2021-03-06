package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Button b_rock, b_scissor, b_paper;
    TextView tv_score;
    ImageView iv_ComputerChoice, iv_HumanChoice;

    int HumanScore,ComputerScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissor = (Button) findViewById(R.id.b_scissor);
        b_rock = (Button) findViewById(R.id.b_rock);

        iv_ComputerChoice = (ImageView) findViewById(R.id.iv_ComputerChoice);
        iv_HumanChoice = (ImageView) findViewById(R.id.iv_HumanChoice);

        tv_score = (TextView) findViewById(R.id.tv_score);

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.paper);
                String message = play_turn("paper");
                Toast.makeText(GameActivity.this, message, Toast.LENGTH_SHORT).show();
                tv_score.setText("SCORE HUMAN : " +Integer.toString(HumanScore) +" || COMPUTER : "+Integer.toString(ComputerScore));

            }


        });

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.rock);
                String message = play_turn("rock");
                Toast.makeText(GameActivity.this, message, Toast.LENGTH_SHORT).show();
                tv_score.setText("SCORE HUMAN : " +Integer.toString(HumanScore) +" || COMPUTER : "+Integer.toString(ComputerScore));




            }


        });

        b_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.scissor);
                String message = play_turn("scissor");
                Toast.makeText(GameActivity.this, message, Toast.LENGTH_SHORT).show();
                tv_score.setText("SCORE HUMAN : " +Integer.toString(HumanScore) +" || COMPUTER : "+Integer.toString(ComputerScore));

            }


        });


    }

    public String play_turn( String player_choice ){

        String computer_choice="";
        Random r=new Random();


        int computer_choice_number = r.nextInt(3)+1;
        if (computer_choice_number==1){
            computer_choice="rock";
        }else

        if (computer_choice_number==2) {
            computer_choice="scissor";
        }else

        if (computer_choice_number==3) {
            computer_choice="paper";
        }

        if (computer_choice=="rock") {
            iv_ComputerChoice.setImageResource(R.drawable.rock);

        } else

        if (computer_choice=="scissor") {
            iv_ComputerChoice.setImageResource(R.drawable.scissor);

        } else

        if (computer_choice=="paper") {
            iv_ComputerChoice.setImageResource(R.drawable.paper);

        }




        if(computer_choice== player_choice) {
            return " It's a TIE " ;
        }
        else if (player_choice =="scissor" && computer_choice == "rock") {
            ComputerScore++;
            return "Rock crushes scissors. Computer Wins!!!";

        }
        else if (player_choice =="scissor" && computer_choice == "paper") {
            HumanScore++;
            return "Scissor cuts Paper. You Win!!!";

        }

        else if (player_choice =="rock" && computer_choice == "scissor") {
            HumanScore++;
            return "Rock crushes scissors. You Win!!!";

        }

        else if (player_choice =="rock" && computer_choice == "paper") {
            ComputerScore++;
            return "Paper covers Rock . Computer Wins!!!";

        }
        else if (player_choice =="paper" && computer_choice == "rock") {
            HumanScore++;
            return "Paper covers Rock. You Win!!!";

        }
        else if (player_choice =="paper" && computer_choice == "scissor") {
            ComputerScore++;
            return "Scissor cuts Paper. Computer Wins!!!";

        }
        else return "don't know";
    }

}






