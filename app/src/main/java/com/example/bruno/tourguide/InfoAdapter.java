package com.example.bruno.tourguide;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class InfoAdapter extends ArrayAdapter<Info> {
    private int mBackgroundColorId;
    public InfoAdapter(Context context, ArrayList<Info> info, int backgroundColorId) {
        super(context, 0, info);
        mBackgroundColorId = backgroundColorId;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Info currentInfo = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        nameTextView.setText(currentInfo.getName());
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentInfo.getAddress());
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        infoTextView.setText(currentInfo.getInfo());
        TextView moreInfoTextView = (TextView) listItemView.findViewById(R.id.more_info_text_view);
        moreInfoTextView.setText(currentInfo.getMoreInfo());
        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(mBackgroundColorId);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentInfo.hasImage()) {
            imageView.setImageResource(currentInfo.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
