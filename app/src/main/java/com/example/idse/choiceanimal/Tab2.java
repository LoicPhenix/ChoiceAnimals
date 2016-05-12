package com.example.idse.choiceanimal;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab2 extends Fragment {

    private ImageView imgView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.tab2, container, false);
        imgView=(ImageView)view.findViewById(R.id.imgView);
		return view;
	}

    public void changeData(String data)
    {
        int resId = getResources().getIdentifier(data.toLowerCase(), "drawable", getContext().getPackageName());
        imgView.setImageResource(resId);
    }

}
