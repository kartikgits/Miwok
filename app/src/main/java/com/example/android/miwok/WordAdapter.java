package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kartikeya on 4/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mbackgroundColorId;

    public WordAdapter(@NonNull Activity context, @NonNull ArrayList<Word> words, int backgroundColorId) {
        super(context, 0, words);
        mbackgroundColorId = backgroundColorId;
    }

    @NonNull
    @Override
    //getView gets called when the list view is trying to display a list of items at a given position
    //list view will pass in a potential view that could be reused. Here it's called convertView
    //ViewGroup parent here refers to the parent view group for all list items which is the ListView itself.
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Set the background of the activity to the passed color ID.
        listItemView.setBackgroundResource(mbackgroundColorId);

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);

        // Get the miwok_number from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslationion());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_word);

        // Get the english_number from the current Word object and
        // set this text on the name TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.content_image);
        //Check if there is an imageView associated with the Word object
        if (currentWord.getImageFlag() == 1) {
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);
        //Get the image from the current Word object and
        //set this image on the imageview
        imageView.setImageResource(currentWord.getmImageResourceId());

        return listItemView;
    }
}
