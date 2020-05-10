package com.example.csc322project;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ProfilePageActivity extends AppCompatActivity {
    Spinner spinner, spinner2;
    FloatingActionButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_profile_page);
        spinner2 = findViewById(R.id.spinner2);
        spinner2.setVisibility(View.GONE);
        btn = findViewById(R.id.change);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopUpActivity.class);
                startActivity(intent);
            }
        });
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 1:
                        openBrowseActivity();
                        break;
                    case 2:
                        openInviteActivity();
                        break;
                    case 3:
                        break;
                    case 4:
                        openGroupActivity();
                        break;
                    case 5:
                        openScheduleActivity();
                        break;
                    case 6:
                        openVoteActivity();
                        break;
                    case 7:
                        openTodoActivity();
                        break;
                    case 8:
                        openHomeActivity();
                        break;
                    case 9:
                        openLogoutActivity();
                        break;
                    default:
                        return;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void openTodoActivity() {
        Intent intent = new Intent(this,todoActivity.class);
        startActivity(intent);
    }

    private void openLogoutActivity () {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

        private void openHomeActivity () {
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
        }
        private void openBrowseActivity () {
            Intent intent = new Intent(this, BrowseActivity.class);
            startActivity(intent);
        }
        private void openInviteActivity () {
            Intent intent = new Intent(this, InviteActivity.class);
            startActivity(intent);
        }
        private void openComplainActivity () {
            Intent intent = new Intent(this, ComplainActivity.class);
            startActivity(intent);
        }
        private void openGroupActivity () {
            Intent intent = new Intent(this, GroupActivity.class);
            startActivity(intent);
        }
        private void openScheduleActivity () {
            Intent intent = new Intent(this, Schedule.class);
            startActivity(intent);
        }
        private void openVoteActivity () {
            Intent intent = new Intent(this, VoteActivity.class);
            startActivity(intent);
        }
    }

