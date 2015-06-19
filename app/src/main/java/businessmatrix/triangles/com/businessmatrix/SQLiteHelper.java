package businessmatrix.triangles.com.businessmatrix;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by laxman on 19/6/15.
 */
public class SQLiteHelper extends SQLiteOpenHelper {


    public static final String TABLE_RESULT = "results";
    public static final String RESULT_ID = "result_id";
    public static final String RESULT_TITLE = "result_title";
    public static final String LINE_VOLTAGE = "line_voltage";
    public static final String TRANSFORMER_KVA = "transformer_kva";
    public static final String EQUIPMENT_TYPE = "equipment_type";
    public static final String TRANSFORMER_Z = "transformer_z";
    public static final String FAULT_TOLERANCE_TIME = "fault_tolerance_time";
    public static final String GROUNDING = "grounding";
    public static final String INCIDENT_ENERGY = "incident_energy";
    public static final String EA18 = "ea_18";
    public static final String EA12 = "ea12";

    private static final String DATABASE_NAME = "BusinessMatrix.db";
    private static final int DATABASE_VERSION = 2;

    private static final String CREATE_DATABASE = "create table " + TABLE_RESULT + "(" + RESULT_ID + " integer primary key autoincrement, " + RESULT_TITLE + " TEXT not null, " + LINE_VOLTAGE + " REAL not null, " + TRANSFORMER_KVA + " REAL not null, " + EQUIPMENT_TYPE + " NUM not null, " + TRANSFORMER_Z + " REAL not null, " + FAULT_TOLERANCE_TIME + " REAL not null, " + GROUNDING + " NUM not null, " + INCIDENT_ENERGY + " REAL not null, " + EA18 + " REAL not null, " + EA12 + " REAL not null);";

    private static final String CREATE_ACCOUNT_TABLE = "Create table ACCOUNT ( )";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DBDriver.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESULT);
        onCreate(db);

    }



}


