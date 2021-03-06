package com.asktroapp.myapplication.Fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

<<<<<<< HEAD
import com.asktroapp.myapplication.CircleTransform;
=======
>>>>>>> origin/master
import com.asktroapp.myapplication.MainActivity;
import com.asktroapp.myapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by mobiltek26 on 9/7/16.
 */
public class RecAddedBooksDialogFragment extends android.support.v4.app.DialogFragment {
    TextView name,Author;
    Button sendRequest;
    Button Cancel;
    ImageView imageView;

    @NonNull
    @Override

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        View view = getActivity().getLayoutInflater().inflate(R.layout.rec_added_books_dialog_fragment, null);
        builder.setView(view);

        Bundle mArgs1 = getArguments();
        String myValue = (String) mArgs1.get("key1");
        String author =(String)   mArgs1.get("key2");
        int ImageId = (int) mArgs1.get("key3");

        name = (TextView) view.findViewById(R.id.TextViewBookName);

        name.setText(myValue);

        Author = (TextView) view.findViewById(R.id.TextViewAuthorName);

        Author.setText(author);

        imageView = (ImageView) view.findViewById(R.id.RecImageView);

        imageView.setImageResource(ImageId);

        Cancel = (Button) view.findViewById(R.id.ButtonCancel);

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        sendRequest = (Button) view.findViewById(R.id.sendRequest);

        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(getContext())
                        .setTitle("Kitap İsteği")
                        .setMessage("Kitap isteğiniz alınmıştır")
                        .setNeutralButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();


            }
        });



        return builder.create();


    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState){
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
