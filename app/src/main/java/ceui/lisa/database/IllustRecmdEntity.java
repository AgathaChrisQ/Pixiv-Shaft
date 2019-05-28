package ceui.lisa.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "illust_recmd_table")
public final class IllustRecmdEntity {

    @PrimaryKey()
    private int illustID;
    private String illustJson;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private long time;

    public int getIllustID() {
        return illustID;
    }

    public void setIllustID(int illustID) {
        this.illustID = illustID;
    }

    public String getIllustJson() {
        return illustJson;
    }

    public void setIllustJson(String illustJson) {
        this.illustJson = illustJson;
    }

    @Override
    public String toString() {
        return "IllustHistoryEntity{" +
                "illustID=" + illustID +
                ", illustJson='" + illustJson + '\'' +
                ", time=" + time +
                '}';
    }
}
