package com.msttech.smrhall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Floor4Activity extends Activity {

    ImageButton back;

    Button roomOfFloor6[] = new Button[3];
    //410,412,413
    Button roomOfFloor5[] = new Button[6];
    //407,408,415,418,422,424
    Button roomOfFloor4;
    //419
    Button roomOfFloor3;
    //425

    Button btnClosePopup, btnClosePopup2, btnClosePopup3,btnClosePopup4;

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        back = (ImageButton)findViewById(R.id.back1);

        roomOfFloor6[0] = (Button)findViewById(R.id.room410);
        roomOfFloor6[1] = (Button)findViewById(R.id.room412);
        roomOfFloor6[2] = (Button)findViewById(R.id.room413);

        roomOfFloor5[0] = (Button)findViewById(R.id.room407);
        roomOfFloor5[1] = (Button)findViewById(R.id.room408);
        roomOfFloor5[2] = (Button)findViewById(R.id.room415);
        roomOfFloor5[3] = (Button)findViewById(R.id.room418);
        roomOfFloor5[4] = (Button)findViewById(R.id.room422);
        roomOfFloor5[5] = (Button)findViewById(R.id.room424);

        roomOfFloor4 = (Button)findViewById(R.id.room419);

        roomOfFloor3 = (Button)findViewById(R.id.room425);

        for (int i=0;i<3;i++){
            final int finalI = i;
            roomOfFloor6[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForSix(finalI);
                }
            });
        }
        for (int i=0;i<6;i++){
            final int finalI = i;
            roomOfFloor5[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFive(finalI);
                }
            });
        }
        roomOfFloor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForFour();
            }

            });
        roomOfFloor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForThree();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Floor4Activity.this,FllorActivity.class));
            }
        });

    }


    public void informationForSix(int id){
        try {
            LayoutInflater inflater = (LayoutInflater) Floor4Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforsix,
                    (ViewGroup) findViewById(R.id.popup_element3));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 410");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r410name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r410dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r410ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r410blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r410contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r410name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r410dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r410ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r410blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r410contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r410name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r410dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r410ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r410blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r410contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r410name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r410dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r410ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r410blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r410contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r410name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r410dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r410ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r410blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r410contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r410name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r410dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r410ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r410blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r410contact6);

                    (popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 1:
                    id = 1;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 412");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r412name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r412dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r412ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r412blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r412contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r412name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r412dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r412ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r412blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r412contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r412name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r412dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r412ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r412blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r412contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r412name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r412dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r412ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r412blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r412contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r412name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r412dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r412ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r412blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r412contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r412name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r412dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r412ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r412blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r412contact6);

                    (popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    id = 2;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 413");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r413name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r413dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r413ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r413blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r413contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r413name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r413dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r413ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r413blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r413contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r413name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r413dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r413ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r413blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r413contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r413name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r413dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r413ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r413blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r413contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r413name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r413dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r413ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r413blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r413contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r413name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r413dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r413ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r413blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r413contact6);

                    (popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
            }

            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup3 = (Button) layout.findViewById(R.id.btn_close_popup3);
            btnClosePopup3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public void informationForFive(int id){
        try {
            LayoutInflater inflater = (LayoutInflater) Floor4Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforfive,
                    (ViewGroup) findViewById(R.id.popup_element2));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){

                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 407");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r407name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r407dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r407ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r407blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r407contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r407name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r407dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r407ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r407blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r407contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r407name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r407dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r407ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r407blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r407contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r407name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r407dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r407ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r407blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r407contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r407name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r407dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r407ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r407blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r407contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 1:
                    id = 1;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 408");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r408name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r408dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r408ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r408blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r408contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r408name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r408dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r408ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r408blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r408contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r408name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r408dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r408ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r408blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r408contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r408name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r408dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r408ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r408blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r408contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r408name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r408dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r408ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r408blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r408contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    id = 2;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 415");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r415name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r415dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r415ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r415blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r415contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r415name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r415dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r415ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r415blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r415contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r415name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r415dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r415ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r415blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r415contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r415name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r415dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r415ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r415blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r415contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r415name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r415dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r415ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r415blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r415contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 3:
                    id = 3;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 418");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r418name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r418dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r418ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r418blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r418contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r418name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r418dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r418ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r418blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r418contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r418name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r418dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r418ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r418blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r418contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r418name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r418dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r418ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r418blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r418contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r418name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r418dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r418ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r418blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r418contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 4:
                    id = 4;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 422");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r422name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r422dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r422ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r422blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r422contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r422name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r422dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r422ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r422blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r422contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r422name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r422dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r422ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r422blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r422contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r422name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r422dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r422ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r422blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r422contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r422name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r422dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r422ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r422blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r422contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 5:
                    id = 5;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 424");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r424name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r424dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r424ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r424blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r424contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r424name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r424dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r424ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r424blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r424contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r424name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r424dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r424ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r424blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r424contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r424name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r424dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r424ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r424blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r424contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r424name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r424dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r424ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r424blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r424contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
            }

            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup2 = (Button) layout.findViewById(R.id.btn_close_popup2);
            btnClosePopup2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public void informationForFour(){

        try {

            LayoutInflater inflater = (LayoutInflater) Floor4Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.information,
                    (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 419");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r419name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r419dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r419ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r419blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r419contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r419name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r419dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r419ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r419blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r419contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r419name3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r419dep3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r419ses3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r419blood3);
            ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r419contact3);

            (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r419name4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r419dep4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r419ses4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r419blood4);
            ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r419contact4);

            (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup = (Button) layout.findViewById(R.id.btn_close_popup);
            btnClosePopup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public void informationForThree(){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor4Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforthree,
                    (ViewGroup) findViewById(R.id.popup_element4));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 425");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r425name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r425dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r425ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r425blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r425contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r425name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r425dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r425ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r425blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r425contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r425name3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r425dep3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r425ses3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r425blood3);
            ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r425contact3);

            (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup4 = (Button) layout.findViewById(R.id.btn_close_popup4);
            btnClosePopup4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
        }catch (Exception e){
            e.getStackTrace();
        }
    }

}
