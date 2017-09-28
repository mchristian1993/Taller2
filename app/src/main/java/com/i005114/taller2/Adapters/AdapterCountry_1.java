package com.i005114.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i005114.taller2.Models.Country;
import com.i005114.taller2.Models.Country_1;
import com.i005114.taller2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 27/09/2017.
 */

public class AdapterCountry_1 extends RecyclerView.Adapter<AdapterCountry_1.ViewHolder> {
    List<Country_1> countryList = new ArrayList<>();
    Context context;

    public AdapterCountry_1(List<Country_1> countryList, Context context) {

        this.countryList = countryList;
        this.context = context;
    }

    @Override
    public AdapterCountry_1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewName.setText(countryList.get(position).getName());
        holder.textViewCapital.setText(countryList.get(position).getCapital());
        holder.textViewAlphs.setText(countryList.get(position).getAlphacode());
        holder.region.setText(countryList.get(position).getRegion());
        holder.poblacion.setText(countryList.get(position).getPoblacion());
        holder.idioma.setText(countryList.get(position).getIdioma());
    }



    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewAlphs;

        TextView region;
        TextView poblacion;
        TextView idioma;


        public ViewHolder(View item) {
            super(item);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) item.findViewById(R.id.id_tv_item_nameabbreviation);
            region=(TextView) item.findViewById(R.id.id_tv_item_region);
            poblacion=(TextView) item.findViewById(R.id.id_tv_item_poblacion);
            idioma=(TextView) item.findViewById(R.id.id_tv_item_idioma);

        }
    }
}
