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

public class Floor2Activity extends Activity {

    ImageButton back;
    Button btnClosePopup, btnClosePopup2, btnClosePopup4, btnClosePopup5;

    Button roomOfSecondFloor5[] = new Button[12];
    Button roomOfSecondFloor4;
    Button roomOfSecondFloor3[] = new Button[2];
    Button roomOfSecondFloor1;

    private PopupWindow popupWindow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        back = (ImageButton)findViewById(R.id.back1);

        roomOfSecondFloor5[0] = (Button)findViewById(R.id.room201);
        roomOfSecondFloor5[1] = (Button)findViewById(R.id.room202);
        roomOfSecondFloor5[2] = (Button)findViewById(R.id.room203);
        roomOfSecondFloor5[3] = (Button)findViewById(R.id.room205);
        roomOfSecondFloor5[4] = (Button)findViewById(R.id.room207);
        roomOfSecondFloor5[5] = (Button)findViewById(R.id.room208);
        roomOfSecondFloor5[6] = (Button)findViewById(R.id.room210);
        roomOfSecondFloor5[7] = (Button)findViewById(R.id.room211);
        roomOfSecondFloor5[8] = (Button)findViewById(R.id.room215);
        roomOfSecondFloor5[9] = (Button)findViewById(R.id.room219);
        roomOfSecondFloor5[10] = (Button)findViewById(R.id.room220);
        roomOfSecondFloor5[11] = (Button)findViewById(R.id.room221);

        roomOfSecondFloor4 = (Button)findViewById(R.id.room217);

        roomOfSecondFloor3[0] = (Button)findViewById(R.id.room223);
        roomOfSecondFloor3[1] = (Button)findViewById(R.id.room225);

        roomOfSecondFloor1 = (Button)findViewById(R.id.room224);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Floor2Activity.this,FllorActivity.class));
            }
        });

        for(int i = 0; i<12; i++){
            final int finalI = i;
            roomOfSecondFloor5[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFive(finalI);
                }
            });
        }
        for(int i = 0;i<2;i++){
            final int finalI = i;
            roomOfSecondFloor3[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForThree(finalI);
                }
            });
        }
        roomOfSecondFloor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForFour();
            }
        });
        roomOfSecondFloor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForOne();
            }
        });

    }

    public void informationForFive(int id){

        try {

            LayoutInflater inflater = (LayoutInflater) Floor2Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforfive,
                    (ViewGroup) findViewById(R.id.popup_element2));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);


            switch (id){

                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 201");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r201name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r201dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r201ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r201blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r201contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r201name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r201dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r201ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r201blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r201contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r201name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r201dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r201ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r201blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r201contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r201name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r201dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r201ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r201blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r201contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r201name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r201dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r201ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r201blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r201contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 202");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r202name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r202dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r202ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r202blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r202contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r202name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r202dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r202ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r202blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r202contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r202name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r202dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r202ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r202blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r202contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r202name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r202dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r202ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r202blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r202contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r202name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r202dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r202ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r202blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r202contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 203");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r203name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r203dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r203ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r203blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r203contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r203name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r203dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r203ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r203blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r203contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r203name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r203dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r203ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r203blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r203contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r203name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r203dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r203ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r203blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r203contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r203name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r203dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r203ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r203blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r203contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 205");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r205name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r205dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r205ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r205blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r205contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r205name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r205dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r205ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r205blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r205contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r205name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r205dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r205ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r205blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r205contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r205name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r205dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r205ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r205blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r205contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r205name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r205dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r205ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r205blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r205contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 201");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r207name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r207dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r207ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r207blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r207contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r207name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r207dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r207ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r207blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r207contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r207name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r207dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r207ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r207blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r207contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r207name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r207dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r207ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r207blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r207contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r207name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r207dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r207ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r207blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r207contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 208");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r208name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r208dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r208ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r208blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r208contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r208name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r208dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r208ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r208blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r208contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r208name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r208dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r208ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r208blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r208contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r208name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r208dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r208ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r208blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r208contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r208name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r208dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r208ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r208blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r208contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 210");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r210name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r210dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r210ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r210blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r210contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r210name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r210dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r210ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r210blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r210contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r210name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r210dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r210ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r210blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r210contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r210name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r210dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r210ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r210blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r210contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r210name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r210dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r210ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r210blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r210contact5);

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
                case 7:
                    id = 7;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 211");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r211name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r211dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r211ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r211blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r211contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r211name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r211dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r211ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r211blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r211contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r211name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r211dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r211ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r211blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r211contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r211name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r211dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r211ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r211blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r211contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r211name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r211dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r211ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r211blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r211contact5);

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
                case 8:
                    id = 8;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 215");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r215name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r215dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r215ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r215blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r215contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r215name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r215dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r215ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r215blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r215contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r215name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r215dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r215ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r215blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r215contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r215name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r215dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r215ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r215blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r215contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r215name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r215dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r215ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r215blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r215contact5);

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
                case 9:
                    id = 9;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 219");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r219name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r219dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r219ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r219blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r219contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r219name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r219dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r219ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r219blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r219contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r219name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r219dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r219ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r219blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r219contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r219name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r219dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r219ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r219blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r219contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r219name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r219dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r219ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r219blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r219contact5);

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
                case 10:
                    id = 10;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 220");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r220name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r220dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r220ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r220blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r220contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r220name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r220dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r220ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r220blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r220contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r220name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r220dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r220ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r220blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r220contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r220name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r220dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r220ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r220blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r220contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r220name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r220dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r220ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r220blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r220contact5);

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
                case 11:
                    id = 11;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 221");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r221name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r221dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r221ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r221blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r221contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r221name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r221dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r221ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r221blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r221contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r221name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r221dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r221ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r221blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r221contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r221name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r221dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r221ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r221blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r221contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r221name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r221dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r221ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r221blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r221contact5);

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

            LayoutInflater inflater = (LayoutInflater) Floor2Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.information,
                    (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 217");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r217name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r217dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r217ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r217blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r217contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r217name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r217dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r217ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r217blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r217contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r217name3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r217dep3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r217ses3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r217blood3);
            ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r217contact3);

            (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r217name4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r217dep4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r217ses4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r217blood4);
            ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r217contact4);

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

    public void informationForThree(int id){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor2Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforthree,
                    (ViewGroup) findViewById(R.id.popup_element4));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 223");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r223name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r223dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r223ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r223blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r223contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r223name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r223dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r223ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r223blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r223contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r223name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r223dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r223ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r223blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r223contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 1:
                    id = 1;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 225");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r225name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r225dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r225ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r225blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r225contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r225name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r225dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r225ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r225blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r225contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r225name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r225dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r225ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r225blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r225contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
            }

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

    public void informationForOne(){

        try {

            LayoutInflater inflater = (LayoutInflater) Floor2Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforone,
                    (ViewGroup) findViewById(R.id.popup_element5));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 224");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r224name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r224dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r224ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r224blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r224contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
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
