package businessmatrix.triangles.com.businessmatrix;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by laxman on 19/6/15.
 */
public class AccountModel extends Model {

    //Table Name
    public static final String TABLE_NAME = "ACCOUNT";
    //Columns
    public static final String ACCOUNT_ID = "ACCOUNT_ID";
    public static final String ACCOUNT_NAME = "ACCOUNT_NAME";
    public static final String PHONE_NUMBER= "PHONE_NUMBER";

    public Account account;
    //Create table Query
    public static final String CREATE_ACCOUNT_MODEL = "create table "+ TABLE_NAME + " ( "+ACCOUNT_ID+" , "+ACCOUNT_NAME+ " );";

    public void insertAccount(Account account)
    {
        ContentValues values = new ContentValues();
        values.put(ACCOUNT_ID, account.accountId);
        values.put(ACCOUNT_NAME, account.accountName);
        values.put(PHONE_NUMBER, account.phoneNumber);
    }


    public static String getCreateQuery()
    {
        return "CREATE TABLE "+TABLE_NAME+"("+ACCOUNT_ID+", "+ACCOUNT_NAME+", "+PHONE_NUMBER+"); ";
    }



    @Override
    public boolean insertRecord() {
        ContentValues values = new ContentValues();
        values.put(ACCOUNT_ID, account.accountId);
        values.put(ACCOUNT_NAME, account.accountName);
        values.put(PHONE_NUMBER, account.phoneNumber);
        return false;
    }
    public boolean insertRecord(Account account) {
        this.account = account;
        return false;
    }

    @Override
    public boolean deleteRecord() {
        return false;
    }

    @Override
    public void initializeConstants() {

    }

    @Override
    public void cursorToObject(Cursor cursor) {

    }


}
