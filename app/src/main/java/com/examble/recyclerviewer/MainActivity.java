package com.examble.recyclerviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final List<Mobile> mobileList = new ArrayList<>();


        Mobile mobile2 = new Mobile();
        mobile2.setMobileName("Nexus 5X");
        mobile2.setMobileManufacture("LG");
        mobile2.setMobileImage(R.drawable.ic_launcher_foreground);

        Mobile mobile3 = new Mobile();
        mobile3.setMobileName("Nexus 6");
        mobile3.setMobileManufacture("Motorola");
        mobile3.setMobileImage(R.drawable.selection_band_overlay);

        Mobile mobile4 = new Mobile();
        mobile4.setMobileName("Nexus 5");
        mobile4.setMobileManufacture("LG");
        mobile4.setMobileImage(R.drawable.ic_launcher_foreground);


        Mobile mobile5 = new Mobile();
        mobile5.setMobileName("Nexus 4");
        mobile5.setMobileManufacture("LG");
        mobile5.setMobileImage(R.drawable.ic_launcher_background);

        Mobile mobile6 = new Mobile();
        mobile6.setMobileName("Galaxy Nexus");
        mobile6.setMobileManufacture("Samsung");
        mobile6.setMobileImage(R.drawable.ic_launcher_foreground);


        Mobile mobile7 = new Mobile();
        mobile7.setMobileName("Nexus S");
        mobile7.setMobileManufacture("Samsung");
        mobile7.setMobileImage(R.drawable.selection_band_overlay);

        Mobile mobile8 = new Mobile();
        mobile8.setMobileName("Nexus One");
        mobile8.setMobileManufacture("HTC");
        mobile8.setMobileImage(R.drawable.selection_band_overlay);

        mobileList.add(mobile2);
        mobileList.add(mobile3);
        mobileList.add(mobile4);
        mobileList.add(mobile5);
        mobileList.add(mobile6);
        mobileList.add(mobile7);
        mobileList.add(mobile8);


        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        final MobileAdabter adapter = new MobileAdabter(mobileList, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);


        //SearchView searchView = (SearchView) findViewById(R.id.search_view);

        //searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          //  @Override
            //public boolean onQueryTextSubmit(String query) {
            //    return false;
            }

        //    @Override
           // public boolean onQueryTextChange(String newText) {
          //      if (!newText.isEmpty()){
             //       List<Mobile> mobileSearchList = searchResult(mobileList,newText);
               //     MobileAdabter adapter1 = new MobileAdabter(mobileSearchList,MainActivity.this);
                 //   adapter1.notifyDataSetChanged();
                   // recyclerView.setAdapter(adapter1);
                //}
                //else {
                  //  recyclerView.setAdapter(adapter);
                //}
               // return false;
            //}
        //});


   // }

    //private List<Mobile> searchResult(List<Mobile> mobileList, String query) {
        //List<Mobile> tempList = new ArrayList<>();
        //for (int i = 0; i < mobileList.size(); i++) {
            //String mobileName = mobileList.get(i).getMobileName();
            //if (mobileName.contains(query))
           //     tempList.add(mobileList.get(i));
      //  }//
       // return tempList;
    //}
}
