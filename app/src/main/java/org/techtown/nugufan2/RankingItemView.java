package org.techtown.nugufan2;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RankingItemView extends LinearLayout {
    ImageView profile;
    TextView rank;
    TextView nickname;
    TextView point;
    public RankingItemView(Context context) {
        super(context);
             init(context);
        }
        public RankingItemView(Context context, AttributeSet attrs) {
           super(context, attrs);
            init(context);
        }
        private void init(Context context) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.ranking_item, this,true);
            profile = (ImageView) findViewById(R.id.profile);
            rank = (TextView) findViewById(R.id.myrank);
            nickname = (TextView) findViewById(R.id.nickname);
            point = (TextView) findViewById(R.id.point);
        }

    public void setProfile(int resId) {
        profile.setImageResource(resId);
    }

    public void setRank(String s) {
        rank.setText(s);
    }

    public void setNickname(String s) {
        nickname.setText(s);
    }

    public void setPoint(String s) {
        point.setText(s);
    }
}

