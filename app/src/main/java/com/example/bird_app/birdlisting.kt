package com.example.bird_app

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import recycleview.application.bird
import recycleview.application.birdadapter



 class birdlisting :  AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var  Birdlist: ArrayList<bird>
    private lateinit var   Birdadapter: birdadapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birdlisting)


        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager= LinearLayoutManager(this)
        Birdlist= ArrayList()



        Birdlist.add(bird  (R.drawable.birdy1, "parrot 1"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 2"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 3"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 4"))

        Birdlist.add(bird  (R.drawable.birdy1, "parrot 1"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 2"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 3"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 4"))

        Birdlist.add(bird  (R.drawable.birdy1, "parrot 1"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 2"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 3"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 4"))

        Birdlist.add(bird  (R.drawable.birdy1, "parrot 1"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 2"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 3"))
        Birdlist.add(bird  (R.drawable.birdy1, "parrot 4"))


        Birdadapter= birdadapter(Birdlist)
        recyclerView.adapter = Birdadapter

        Birdadapter.onItemClick= {
        val intent = Intent(this, birdshare::class.java)
      intent.putExtra("bird", it)
        startActivity(intent)
         }









    }









}