package smartdev.rebooks.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import smartdev.rebooks.Model.Books;
import smartdev.rebooks.R;

/**
 * Created by jih00d on 1/9/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{

    private ArrayList<Books> datalist;

    public Adapter(ArrayList<Books> arrayList) {
        datalist = arrayList;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_activity, parent,false);

        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.version.append(datalist.get(position).getVer());
        holder.name.append(datalist.get(position).getName());
        holder.api.append(datalist.get(position).getApi());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView version, name, api;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            version = (TextView) itemView.findViewById(R.id.txt_version);
            name = (TextView) itemView.findViewById(R.id.txt_name);
            api = (TextView) itemView.findViewById(R.id.txt_api);
        }
    }
}
