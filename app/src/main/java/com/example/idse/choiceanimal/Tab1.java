package com.example.idse.choiceanimal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

public class Tab1 extends Fragment{

	private String[] animals  ={"Chien", "Chat", "Poisson", "Lapin"};
    private DataTransmit dataTransmit;

    public interface DataTransmit{
        public void transmit(String data);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        final View view=inflater.inflate(R.layout.tab1, container, false);
        final NumberPicker nbrPicker = (NumberPicker)view.findViewById(R.id.nbrPicker);
        nbrPicker.setMinValue(0);
        nbrPicker.setMaxValue(animals.length - 1);
        nbrPicker.setDisplayedValues(animals);
        nbrPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                dataTransmit = (DataTransmit)getActivity();
                dataTransmit.transmit(animals[nbrPicker.getValue()]);
            }
        });
		return view;
	}

}
