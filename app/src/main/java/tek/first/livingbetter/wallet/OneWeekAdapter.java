package tek.first.livingbetter.wallet;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import tek.first.livingbetter.R;
import tek.first.livingbetter.wallet.model.ItemModel;

/**
 * Created by Administrator on 2015/8/27.
 */
public class OneWeekAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ItemModel> itemOneWeek;
    private static LayoutInflater inflater = null;
    public OneWeekAdapter(Fragment Fragment, ArrayList<ItemModel> res) {
        context = Fragment.getActivity();
        itemOneWeek = res;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemOneWeek.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_history, null);
        holder.tv1 = (TextView) rowView.findViewById(R.id.num_tv_list);
        holder.tv2 = (TextView) rowView.findViewById(R.id.date_tv_list);
        holder.tv3 = (TextView) rowView.findViewById(R.id.cate_tv_list);
        holder.tv4 = (TextView) rowView.findViewById(R.id.expense_tv_list);
        holder.tv1.setText(String.valueOf(position + 1) + "." + itemOneWeek.get(position).getTitle());
        holder.tv2.setText(itemOneWeek.get(position).getDate().substring(0, 8));
        holder.tv3.setText(itemOneWeek.get(position).getCate());
        holder.tv4.setText(itemOneWeek.get(position).getExpense());
        return rowView;
    }
}

