// Generated by view binder compiler. Do not edit!
package com.example.precede1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.precede1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIdpwactivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final EditText editTextTextPersonName14;

  @NonNull
  public final EditText editTextTextPersonName15;

  @NonNull
  public final EditText editTextTextPersonName16;

  @NonNull
  public final EditText editTextTextPersonName17;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final RadioButton radioButton10;

  @NonNull
  public final RadioButton radioButton9;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  private ActivityIdpwactivityBinding(@NonNull ConstraintLayout rootView, @NonNull Button button5,
      @NonNull EditText editTextTextPersonName14, @NonNull EditText editTextTextPersonName15,
      @NonNull EditText editTextTextPersonName16, @NonNull EditText editTextTextPersonName17,
      @NonNull ImageView imageView10, @NonNull RadioButton radioButton10,
      @NonNull RadioButton radioButton9, @NonNull TextView textView17, @NonNull TextView textView18,
      @NonNull TextView textView19, @NonNull TextView textView22, @NonNull TextView textView23) {
    this.rootView = rootView;
    this.button5 = button5;
    this.editTextTextPersonName14 = editTextTextPersonName14;
    this.editTextTextPersonName15 = editTextTextPersonName15;
    this.editTextTextPersonName16 = editTextTextPersonName16;
    this.editTextTextPersonName17 = editTextTextPersonName17;
    this.imageView10 = imageView10;
    this.radioButton10 = radioButton10;
    this.radioButton9 = radioButton9;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView22 = textView22;
    this.textView23 = textView23;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIdpwactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIdpwactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_idpwactivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIdpwactivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName14;
      EditText editTextTextPersonName14 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName14 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName15;
      EditText editTextTextPersonName15 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName15 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName16;
      EditText editTextTextPersonName16 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName16 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName17;
      EditText editTextTextPersonName17 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName17 == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.radioButton10;
      RadioButton radioButton10 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton10 == null) {
        break missingId;
      }

      id = R.id.radioButton9;
      RadioButton radioButton9 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton9 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      return new ActivityIdpwactivityBinding((ConstraintLayout) rootView, button5,
          editTextTextPersonName14, editTextTextPersonName15, editTextTextPersonName16,
          editTextTextPersonName17, imageView10, radioButton10, radioButton9, textView17,
          textView18, textView19, textView22, textView23);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}