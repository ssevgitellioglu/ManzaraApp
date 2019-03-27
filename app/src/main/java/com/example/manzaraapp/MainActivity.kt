package com.example.manzaraapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
var tumManzaralar=ArrayList<Manzara>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verikaynaginiDoldur()
        var myAdapter=ManzaraAdapter(tumManzaralar)
        recyclerView.adapter=myAdapter

        var linearLayoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager=linearLayoutManager
    }

    fun verikaynaginiDoldur():ArrayList<Manzara>
    {
var tumResimler= arrayOf(R.drawable.paris_eyfel,
    R.drawable.kl,R.drawable.manzara_5,R.drawable.gmy)

        for(i in 0.. tumResimler.size-1)
        {
            var eklenecekManzara=Manzara("Manzara"+i,"Açıklama " + i,tumResimler[i])
            tumManzaralar.add(eklenecekManzara)
        }
        return tumManzaralar
    }



}
