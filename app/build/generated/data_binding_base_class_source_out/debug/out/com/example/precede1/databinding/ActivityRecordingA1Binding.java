// Generated by view binder compiler. Do not edit!
package com.example.precede1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityRecordingA1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button10;

  @NonNull
  public final Button button9;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final TextView textView42;

  private ActivityRecordingA1Binding(@NonNull ConstraintLayout rootView, @NonNull Button button10,
      @NonNull Button button9, @NonNull TextView textView13, @NonNull TextView textView16,
      @NonNull TextView textView41, @NonNull TextView textView42) {
    this.rootView = rootView;
    this.button10 = button10;
    this.button9 = button9;
    this.textView13 = textView13;
    this.textView16 = textView16;
    this.textView41 = textView41;
    this.textView42 = textView42;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecordingA1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecordingA1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recording_a1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecordingA1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button10;
      Button button10 = ViewBindings.findChildViewById(rootView, id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView41;
      TextView textView41 = ViewBindings.findChildViewById(rootView, id);
      if (textView41 == null) {
        break missingId;
      }

      id = R.id.textView42;
      TextView textView42 = ViewBindings.findChildViewById(rootView, id);
      if (textView42 == null) {
        break missingId;
      }

      return new ActivityRecordingA1Binding((ConstraintLayout) rootView, button10, button9,
          textView13, textView16, textView41, textView42);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
