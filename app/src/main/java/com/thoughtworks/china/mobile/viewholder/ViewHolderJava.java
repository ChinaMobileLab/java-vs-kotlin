package com.thoughtworks.china.mobile.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtworks.china.mobile.R;

class ViewHolderJava extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView textView;
    private CheckBox checkbox;
    private EditText editText;
    private Button button;

    public ViewHolderJava(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
        textView = (TextView) itemView.findViewById(R.id.textView);
        checkbox = (CheckBox) itemView.findViewById(R.id.checkbox);
        editText = (EditText) itemView.findViewById(R.id.editText);
        button = (Button) itemView.findViewById(R.id.button);
    }

    public void populate() {
        image.setImageDrawable(null);
        textView.setText("");
        checkbox.setChecked(false);
        editText.setHint("");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}


