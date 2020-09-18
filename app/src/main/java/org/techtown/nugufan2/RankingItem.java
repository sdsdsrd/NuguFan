package org.techtown.nugufan2;

public class RankingItem {
    int resId;
    String rank;
    String nickname;
    String point;

    public RankingItem(int resId, String rank, String nickname, String point) {
        this.resId = resId;
        this.rank = rank;
        this.nickname = nickname;
        this.point = point;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}
