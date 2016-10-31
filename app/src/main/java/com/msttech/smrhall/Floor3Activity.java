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

public class Floor3Activity extends Activity {

    ImageButton back;

    Button roomOfFloor6;
    //304
    Button roomOfFloor5[] = new Button[4];
    //303,308,320,322
    Button roomOfFloor4[] = new Button[5];
    //305,311,312,313,323
    Button roomOfFloor3;
    //325
    Button btnClosePopup, btnClosePopup2, btnClosePopup3,btnClosePopup4;

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        back = (ImageButton)findViewById(R.id.back1);

        roomOfFloor6 = (Button)findViewById(R.id.room304);

        roomOfFloor5[0] = (Button)findViewById(R.id.room303);
        roomOfFloor5[1] = (Button)findViewById(R.id.room308);
        roomOfFloor5[2] = (Button)findViewById(R.id.room320);
        roomOfFloor5[3] = (Button)findViewById(R.id.room322);

        roomOfFloor4[0] = (Button)findViewById(R.id.room305);
        roomOfFloor4[1] = (Button)findViewById(R.id.room311);
        roomOfFloor4[2] = (Button)findViewById(R.id.room312);
        roomOfFloor4[3] = (Button)findViewById(R.id.room313);
        roomOfFloor4[4] = (Button)findViewById(R.id.room323);

        roomOfFloor3 = (Button)findViewById(R.id.room325);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Floor3Activity.this, FllorActivity.class));
            }
        });

        roomOfFloor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForSix();
            }
        });
        for(int i=0;i<4;i++){
            final int finalI = i;
            roomOfFloor5[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFive(finalI);
                }
            });
        }
        for (int i = 0;i<5;i++){
            final int finalI = i;
            roomOfFloor4[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informationForFour(finalI);
                }
            });
        }
        roomOfFloor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationForThree();
            }
        });

    }


    public void informationForSix(){

        try {

            LayoutInflater inflater = (LayoutInflater) Floor3Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforsix,
                    (ViewGroup) findViewById(R.id.popup_element3));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 304");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r304name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r304dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r304ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r304blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r304contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r304name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r304dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r304ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r304blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r304contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r304name3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r304dep3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r304ses3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r304blood3);
            ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r304contact3);

            (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r304name4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r304dep4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r304ses4);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r304blood4);
            ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r304contact4);

            (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r304name5);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r304dep5);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r304ses5);
            ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r304blood5);
            ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r304contact5);

            (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r304name6);
            ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r304dep6);
            ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r304ses6);
            ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r304blood6);
            ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r304contact6);

            (popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

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

            LayoutInflater inflater = (LayoutInflater) Floor3Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforfive,
                    (ViewGroup) findViewById(R.id.popup_element2));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 303");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r303name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r303dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r303ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r303blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r303contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r303name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r303dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r303ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r303blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r303contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r303name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r303dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r303ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r303blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r303contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r303name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r303dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r303ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r303blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r303contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r303name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r303dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r303ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r303blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r303contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 308");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r308name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r308dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r308ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r308blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r308contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r308name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r308dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r308ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r308blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r308contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r308name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r308dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r308ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r308blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r308contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r308name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r308dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r308ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r308blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r308contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r308name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r308dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r308ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r308blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r308contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 320");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r320name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r320dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r320ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r320blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r320contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r320name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r320dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r320ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r320blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r320contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r320name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r320dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r320ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r320blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r320contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r320name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r320dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r320ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r320blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r320contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r320name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r320dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r320ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r320blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r320contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 322");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r322name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r322dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r322ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r322blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r322contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r322name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r322dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r322ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r322blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r322contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r322name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r322dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r322ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r322blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r322contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r322name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r322dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r322ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r322blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r322contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r322name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r322dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r322ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r322blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r322contact5);

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

            LayoutInflater inflater = (LayoutInflater) Floor3Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.information,
                    (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 305");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r305name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r305dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r305ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r305blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r305contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r305name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r305dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r305ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r305blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r305contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r305name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r305dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r305ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r305blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r305contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r305name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r305dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r305ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r305blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r305contact4);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 311");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r311name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r311dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r311ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r311blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r311contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r311name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r311dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r311ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r311blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r311contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r311name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r311dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r311ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r311blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r311contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r311name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r311dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r311ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r311blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r311contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    id = 2;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 312");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r312name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r312dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r312ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r312blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r312contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r312name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r312dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r312ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r312blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r312contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r312name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r312dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r312ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r312blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r312contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r312name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r312dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r312ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r312blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r312contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 3:
                    id = 3;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 313");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r313name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r313dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r313ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r313blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r313contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r313name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r313dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r313ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r313blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r313contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r313name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r313dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r313ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r313blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r313contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r313name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r313dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r313ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r313blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r313contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    break;
                case 4:
                    id = 4;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 323");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r323name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r323dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r323ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r323blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r323contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r323name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r323dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r323ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r323blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r323contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r323name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r323dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r323ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r323blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r323contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r323name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r323dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r323ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r323blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r323contact4);

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

    public void informationForThree(){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor3Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforthree,
                    (ViewGroup) findViewById(R.id.popup_element4));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 325");
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r325name1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r325dep1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r325ses1);
            ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r325blood1);
            ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r325contact1);

            (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });

            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r325name2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r325dep2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r325ses2);
            ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r325blood2);
            ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r325contact2);

            (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }
            });
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r325name3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r325dep3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r325ses3);
            ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r325blood3);
            ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r325contact3);

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
