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

public class Floor5Activity extends Activity {

    ImageButton back;

    Button roomOfFloor5[] = new Button[7];
    //509,511,514,515,517,522,523
    Button roomOfFloor4[] = new Button[3];
    //513,519,524
    Button roomOfFloor2;
    //525

    Button btnClosePopup, btnClosePopup2, btnClosePopup5;

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        back = (ImageButton)findViewById(R.id.back1);

        roomOfFloor5[0] = (Button)findViewById(R.id.room509);
        roomOfFloor5[1] = (Button)findViewById(R.id.room511);
        roomOfFloor5[2] = (Button)findViewById(R.id.room514);
        roomOfFloor5[3] = (Button)findViewById(R.id.room515);
        roomOfFloor5[4] = (Button)findViewById(R.id.room517);
        roomOfFloor5[5] = (Button)findViewById(R.id.room522);
        roomOfFloor5[6] = (Button)findViewById(R.id.room523);

        roomOfFloor4[0] = (Button)findViewById(R.id.room513);
        roomOfFloor4[1] = (Button)findViewById(R.id.room519);
        roomOfFloor4[2] = (Button)findViewById(R.id.room524);

        roomOfFloor2 = (Button)findViewById(R.id.room525);

        for (int i = 0;i<7;i++){
            final int finalI = i;
            roomOfFloor5[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFive(finalI);
                }
            });
        }
        for (int i = 0;i<3;i++){
            final int finalI = i;
            roomOfFloor4[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFour(finalI);
                }
            });
        }

        roomOfFloor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForTwo();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Floor5Activity.this,FllorActivity.class));
            }
        });
    }


    public void informationForFive(int id){
        try {
            LayoutInflater inflater = (LayoutInflater) Floor5Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforfive,
                    (ViewGroup) findViewById(R.id.popup_element2));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 509");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r509name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r509dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r509ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r509blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r509contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r509name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r509dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r509ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r509blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r509contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r509name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r509dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r509ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r509blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r509contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r509name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r509dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r509ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r509blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r509contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r509name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r509dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r509ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r509blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r509contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 511");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r511name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r511dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r511ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r511blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r511contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r511name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r511dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r511ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r511blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r511contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r511name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r511dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r511ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r511blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r511contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r511name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r511dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r511ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r511blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r511contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r511name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r511dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r511ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r511blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r511contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 514");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r514name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r514dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r514ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r514blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r514contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r514name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r514dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r514ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r514blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r514contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r514name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r514dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r514ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r514blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r514contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r514name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r514dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r514ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r514blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r514contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r514name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r514dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r514ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r514blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r514contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 515");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r515name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r515dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r515ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r515blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r515contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r515name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r515dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r515ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r515blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r515contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r515name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r515dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r515ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r515blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r515contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r515name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r515dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r515ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r515blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r515contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r515name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r515dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r515ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r515blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r515contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 517");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r517name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r517dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r517ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r517blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r517contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r517name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r517dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r517ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r517blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r517contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r517name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r517dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r517ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r517blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r517contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r517name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r517dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r517ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r517blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r517contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r517name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r517dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r517ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r517blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r517contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 522");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r522name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r522dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r522ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r522blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r522contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r522name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r522dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r522ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r522blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r522contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r522name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r522dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r522ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r522blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r522contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r522name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r522dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r522ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r522blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r522contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r522name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r522dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r522ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r522blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r522contact5);

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
                case 6:
                    id = 6;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 523");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r523name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r523dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r523ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r523blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r523contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r523name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r523dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r523ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r523blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r523contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r523name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r523dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r523ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r523blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r523contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r523name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r523dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r523ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r523blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r523contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r523name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r523dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r523ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r523blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r523contact5);

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

    public void informationForFour(int id){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor5Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.information,
                    (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 513");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r513name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r513dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r513ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r513blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r513contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r513name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r513dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r513ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r513blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r513contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r513name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r513dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r513ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r513blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r513contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r513name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r513dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r513ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r513blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r513contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 1:
                    id = 1;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 519");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r519name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r519dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r519ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r519blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r519contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r519name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r519dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r519ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r519blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r519contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r519name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r519dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r519ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r519blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r519contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r519name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r519dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r519ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r519blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r519contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    id = 2;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 524");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r524name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r524dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r524ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r524blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r524contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r524name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r524dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r524ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r524blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r524contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r524name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r524dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r524ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r524blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r524contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r524name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r524dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r524ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r524blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r524contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
            }


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

    public void informationForTwo(){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor5Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationfortwo,
                    (ViewGroup) findViewById(R.id.popup_element5));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 525");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r525name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r525dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r525ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r525blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r525contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r525name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r525dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r525ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r525blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r525contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup5 = (Button) layout.findViewById(R.id.btn_close_popup5);
            btnClosePopup5.setOnClickListener(new View.OnClickListener() {
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
