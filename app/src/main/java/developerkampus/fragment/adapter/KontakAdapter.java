package developerkampus.fragment.adapter;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import developerkampus.fragment.R;

/**
 * Created by Wambakun on 01/02/2017.
 */

public class KontakAdapter extends ArrayAdapter<String> {
    private final Activity activity;
    private final String[] telp;
    private final String[] name;
    private final Integer[] image;

    public KontakAdapter(Activity activity,String[] name,String[] telp,Integer[] image){
        super(activity, R.layout.kontak_list,name);
        this.activity=activity;
        this.name=name;
        this.image=image;
        this.telp=telp;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.kontak_list,null,true);
        TextView tvNama = (TextView)rowView.findViewById(R.id.tv_nama);
        TextView tvNomor=(TextView)rowView.findViewById(R.id.tv_nomor);
        ImageView Image=(ImageView)rowView.findViewById(R.id.img);

        tvNama.setText(name[position]);
        tvNomor.setText(telp[position]);
        Image.setImageResource(image[position]);
        return rowView;
    }
}
