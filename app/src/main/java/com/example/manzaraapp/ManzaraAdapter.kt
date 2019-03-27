package com.example.manzaraapp

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tek_manzara.view.*

class ManzaraAdapter(tumManzaralar : ArrayList<Manzara>): RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var manzaralar=tumManzaralar
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ManzaraViewHolder {
        var inflater=LayoutInflater.from(p0.context)
       var tek_manzara= inflater.inflate(R.layout.tek_manzara,p0,false)
        return ManzaraViewHolder(tek_manzara)

    }

    override fun getItemCount(): Int {
return manzaralar.size
    }

    override fun onBindViewHolder(p0: ManzaraViewHolder, p1: Int) {
        p0.manzaraAciklama.text=manzaralar.get(p1).aciklama
        p0.manzaraBaslik.text=manzaralar.get(p1).baslik
        p0.manzaraResim.setImageResource(manzaralar.get(p1).resim)

    }

    class ManzaraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
var tekSatirManzara=itemView as CardView
        var manzaraBaslik=tekSatirManzara.txtBaslik
        var manzaraAciklama=tekSatirManzara.txtAciklama
        var manzaraResim=tekSatirManzara.imgManzara
    }
}