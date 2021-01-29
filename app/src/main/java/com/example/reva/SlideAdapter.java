package com.example.reva;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8,
            R.drawable.image9, R.drawable.image10, R.drawable.image12, R.drawable.image13,
            R.drawable.image14, R.drawable.image16, R.drawable.athithimain,
            R.drawable.reception1,
            R.drawable.reception2,
            R.drawable.recption3,
            R.drawable.lobby2,
            R.drawable.stairs,
            R.drawable.stairs2,
            R.drawable.bed2,
            R.drawable.bedroom,
            R.drawable.doublebed,
            R.drawable.dining1,
            R.drawable.diniig2,
            R.drawable.dining3,
            R.drawable.dining4,
            R.drawable.sport1,
            R.drawable.sport2,
            R.drawable.sport3,
            R.drawable.sport4,
            R.drawable.sport5,
            R.drawable.yoga1,
            R.drawable.yoga2,
            R.drawable.yoga3,
            R.drawable.yoga4,
            R.drawable.yoga5,
            R.drawable.yoga6,
    };
    public String[] lst_description = {
           "3 Sharing Room",
            "4 Sharing Room",
            "Karnataka Bank and ATM In Campus",
            "Reva Health Center",
            "",
            "Upper View of REVA Hostel",
            "Boys GYM",
            "Full View of REVA Hostel",
            "Night View of Hostel ",
            "Mess",
            "3 Sharing Room for Girls",
            "Food Court",
            "",
            "Girls 4 Sharing Room",
            "Atithi Entrance",
            "Atithi Reception",
            "",
            "",
            "Atithi Lobby",
            "",
            "",
            "AC Room",
            "",
            "Non-AC Room",
            "Dining Area ",
            "",
            "",
            "",
            "Sports",
            "",
            "",
            "",
            "",
            "Yoga",
            "",
            "",
            "",
            "",
            "",

    };


    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        imgslide.setImageResource(lst_images[position]);
      description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}