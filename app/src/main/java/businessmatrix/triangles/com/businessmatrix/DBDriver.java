package businessmatrix.triangles.com.businessmatrix;

/**
 * Created by laxman on 19/6/15.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class DBDriver {
    private SQLiteDatabase database;
    private SQLiteHelper dbHelper;


    public DBDriver(Context context) {
        dbHelper = new SQLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void deleteRecord(Model model) {

        database.delete(model.TABLE_NAME, model.ID + " = " + model.id, null);
    }

    public List<Object> getAllResults(Model model) {
        String query = model
        Cursor cursor = database.query( );
    }
}
