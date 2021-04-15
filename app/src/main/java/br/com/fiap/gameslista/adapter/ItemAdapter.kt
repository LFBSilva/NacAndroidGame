package br.com.fiap.gameslista.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.gameslista.R
import br.com.fiap.gameslista.model.Game


class ItemAdapter(val context: Context, val dataset: List<Game>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.logolista)
        val nome: TextView = view.findViewById(R.id.jogolista)
        val plataforma: TextView = view.findViewById(R.id.plataformalista)
        val nota: TextView = view.findViewById(R.id.notalista)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(
                    R.layout.item_lista,
                    parent,
                    false
            )

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.ImageResourceId)
        holder.nome.text = context.resources.getString(item.NomeRid)
        holder.plataforma.text = context.resources.getString(item.PlataformaRid)
        holder.nota.text = context.resources.getString(item.NotaRid)
    }
}