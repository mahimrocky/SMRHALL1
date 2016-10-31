package com.msttech.smrhall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Floor1Activity extends Activity {

    Button roomOfFirstFloor4[] = new Button[3];
    Button roomOfFirstFloor5[] = new Button[4];
    Button roomOfFirstFloor6[] = new Button[3];
    ImageButton back;
    Button btnClosePopup, btnClosePopup2, btnClosePopup3;
    TextView testText;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_floor1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        back = (ImageButton) findViewById(R.id.back1);

        //Four person
        roomOfFirstFloor4[0] = (Button) findViewById(R.id.room102);
        roomOfFirstFloor4[1] = (Button) findViewById(R.id.room103);
        roomOfFirstFloor4[2] = (Button) findViewById(R.id.room104);

        //five person
        roomOfFirstFloor5[0] = (Button) findViewById(R.id.room109);
        roomOfFirstFloor5[1] = (Button) findViewById(R.id.room110);
        roomOfFirstFloor5[2] = (Button) findViewById(R.id.room115);
        roomOfFirstFloor5[3] = (Button) findViewById(R.id.room118);

        //six person
        roomOfFirstFloor6[0] = (Button) findViewById(R.id.room114);
        roomOfFirstFloor6[1] = (Button) findViewById(R.id.room116);
        roomOfFirstFloor6[2] = (Button) findViewById(R.id.room117);



        for(int i = 0; i<3;i++) {
            final int finalI = i;
            roomOfFirstFloor4[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    information(finalI);
                }
            });
        }
        for(int i = 0; i<4 ;i++){
            final int finalI = i;
            roomOfFirstFloor5[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    information2(finalI);
                }
            });
        }
        for(int i = 0; i<3 ;i++){
            final int finalI = i;
            roomOfFirstFloor6[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    information3(finalI);
                }
            });
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Floor1Activity.this,FllorActivity.class);
                startActivity(i);
            }
        });

    }

    public void information(int id){
        try{

            LayoutInflater inflater = (LayoutInflater) Floor1Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.information,
                    (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 102");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r102name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r102dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r102ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r102blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r102contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r102name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r102dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r102ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r102blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r102contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r102name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r102dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r102ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r102blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r102contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r102name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r102dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r102ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r102blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r102contact4);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 103");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r103name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r103dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r103ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r103blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r103contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r103name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r103dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r103ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r103blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r103contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r103name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r103dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r104ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r103blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r103contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r103name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r103dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r103ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r103blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r103contact4);

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
                    id=2;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 104");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r104name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r104dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r104ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r104blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r104contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r104name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r104dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r104ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r104blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r104contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r104name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r104dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r104ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r104blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r104contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r104name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r104dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r104ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r104blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r104contact4);

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


        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    public void information2(int id){
        try{

            LayoutInflater inflater = (LayoutInflater) Floor1Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforfive,
                    (ViewGroup) findViewById(R.id.popup_element2));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 109");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r109name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r109dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r109ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r109blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r109contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r109name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r109dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r109ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r109blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r109contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r109name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r109dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r109ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r109blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r109contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r109name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r109dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r109ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r109blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r109contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r109name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r109dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r109ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r109blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r109contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 110");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r110name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r110dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r110ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r110blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r110contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r110name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r110dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r110ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r110blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r110contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r110name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r110dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r110ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r110blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r110contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r110name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r110dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r110ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r110blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r110contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r110name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r110dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r110ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r110blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r110contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 115");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r115name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r115dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r115ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r115blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r115contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r115name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r115dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r115ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r115blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r115contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r115name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r115dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r115ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r115blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r115contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r115name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r115dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r115ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r115blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r115contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r115name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r115dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r115ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r115blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r115contact5);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 118");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r118name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r118dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r118ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r118blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r118contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r118name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r118dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r118ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r118blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r118contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r118name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r118dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r118ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r118blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r118contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r118name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r118dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r118ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r118blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r118contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r118name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r118dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r118ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r118blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r118contact5);

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
            btnClosePopup2.setOnClickListener(cancel_button_click_listener);
    }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void information3(int id){
        try {

            LayoutInflater inflater = (LayoutInflater) Floor1Activity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.informationforsix,
                    (ViewGroup) findViewById(R.id.popup_element3));

            popupWindow = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

            switch (id){
                case 0:
                    id = 0;
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 114");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r114name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r114dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r114ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r114blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r114contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r114name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r114dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r114ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r114blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r114contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r114name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r114dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r114ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r114blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r114contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r114name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r114dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r114ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r114blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r114contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r114name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r114dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r114ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r114blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r114contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r114name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r114dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r114ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r114blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r114contact6);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 116");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r116name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r116dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r116ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r116blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r116contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r116name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r116dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r116ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r116blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r116contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r116name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r116dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r116ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r116blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r116contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r116name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r116dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r116ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r116blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r116contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r116name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r116dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r116ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r116blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r116contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r116name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r116dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r116ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r116blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r116contact6);

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
                    ((TextView)popupWindow.getContentView().findViewById(R.id.roomNo)).setText("Room 117");
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonName)).setText(R.string.r117name1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonDepartment)).setText(R.string.r117dep1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonSession)).setText(R.string.r117ses1);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.firstPersonBloodGroup)).setText(R.string.r117blood1);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setText(R.string.r117contact1);

                    (popupWindow.getContentView().findViewById(R.id.firstPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:" + ((TextView) popupWindow.getContentView().findViewById(R.id.firstPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });

                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonName)).setText(R.string.r117name2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonDepartment)).setText(R.string.r117dep2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonSession)).setText(R.string.r117ses2);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.secondPersonBloodGroup)).setText(R.string.r117blood2);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setText(R.string.r117contact2);

                    (popupWindow.getContentView().findViewById(R.id.secondPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.secondPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonName)).setText(R.string.r117name3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonDepartment)).setText(R.string.r117dep3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonSession)).setText(R.string.r117ses3);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.thirdPersonBloodGroup)).setText(R.string.r117blood3);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setText(R.string.r117contact3);

                    (popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.thirdPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonName)).setText(R.string.r117name4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonDepartment)).setText(R.string.r117dep4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonSession)).setText(R.string.r117ses4);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fourthPersonBloodGroup)).setText(R.string.r117blood4);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setText(R.string.r117contact4);

                    (popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fourthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonName)).setText(R.string.r117name5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonDepartment)).setText(R.string.r117dep5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonSession)).setText(R.string.r117ses5);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.fifthPersonBloodGroup)).setText(R.string.r117blood5);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setText(R.string.r117contact5);

                    (popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String uri = "tel:"+ ((TextView) popupWindow.getContentView().findViewById(R.id.fifthPersonContact)).getText().toString().trim();
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        }
                    });
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonName)).setText(R.string.r117name6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonDepartment)).setText(R.string.r117dep6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonSession)).setText(R.string.r117ses6);
                    ((TextView)popupWindow.getContentView().findViewById(R.id.sixthPersonBloodGroup)).setText(R.string.r117blood6);
                    ((TextView) popupWindow.getContentView().findViewById(R.id.sixthPersonContact)).setText(R.string.r117contact6);

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



    private View.OnClickListener cancel_button_click_listener = new View.OnClickListener() {
        public void onClick(View v) {
            popupWindow.dismiss();

        }
    };

}
