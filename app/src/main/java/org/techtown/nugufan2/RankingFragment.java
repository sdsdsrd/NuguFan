package org.techtown.nugufan2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RankingFragment extends Fragment {
    //ListView listView;
    //RankingAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_ranking, container, false);

        /*
        listView = (ListView) view.findViewById(R.id.listView);
        adapter = new RankingAdapter();
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        adapter.addItem(new RankingItem(R.drawable.p2, "2위", "chizu03", "164,631p"));
        listView.setAdapter(adapter);
        */

        return view;
    }

    /*
    class RankingAdapter extends BaseAdapter {
        ArrayList<RankingItem> items = new ArrayList<RankingItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(RankingItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            RankingItemView view = null;
            if(convertView == null) {
                view = new RankingItemView(getContext());
            } else {
                view = (RankingItemView) convertView;
            }
            RankingItem item = items.get(position);
            view.setProfile(item.getResId());
            view.setRank(item.getRank());
            view.setNickname(item.getNickname());
            view.setPoint(item.getPoint());
            return view;
        }
    }
    */
}
