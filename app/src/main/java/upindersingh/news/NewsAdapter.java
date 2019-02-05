package upindersingh.news;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by USB on 25-07-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Activity context, ArrayList<News> news){
        super(context,0,news);
    }
    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews  = getItem(position);

        TextView titleTextView=(TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentNews.getTitle());

        TextView descriptionTextView =(TextView)listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentNews.getDescription());

        ImageView titleImageView = (ImageView)listItemView.findViewById(R.id.title_image);
        //titleImageView.setImageBitmap(currentNews.getImage());

        Picasso.with(getContext()).load(currentNews.getImage()).placeholder(R.drawable.loading).into(titleImageView);
        return listItemView;

    }
}
