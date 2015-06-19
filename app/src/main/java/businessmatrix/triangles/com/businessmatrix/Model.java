package businessmatrix.triangles.com.businessmatrix;

import android.database.Cursor;

/**
 * Created by laxman on 20/6/15.
 */
public abstract class Model {

    public static String TABLE_NAME;
    public static String ID;
    public int id;

    public static   String getCreateQuery()
    {
        return null;
    }
    public abstract boolean insertRecord();
    public abstract boolean deleteRecord();
    public abstract void initializeConstants();
    public abstract void cursorToObject(Cursor cursor);
    //public abstract Model getRecord(int id);
    //public abstract Model getAllRecords()


}
