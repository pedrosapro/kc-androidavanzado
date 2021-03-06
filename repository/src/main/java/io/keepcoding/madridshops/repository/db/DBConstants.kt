package io.keepcoding.madridshops.repository.db

internal object DBConstants {
    val TABLE_SHOP = "SHOP"

    // Table field constants
    val KEY_SHOP_DATABASE_ID = "_id"
    val KEY_SHOP_ID_JSON = "ID_JSON"
    val KEY_ELEMENT_TYPE = "ELEMENT_TYPE"
    val KEY_SHOP_NAME = "NAME"
    val KEY_SHOP_IMAGE_URL = "IMAGE_URL"
    val KEY_SHOP_LOGO_IMAGE_URL = "LOGO_IMAGE_URL"

    val KEY_SHOP_ADDRESS = "ADDRESS"
    val KEY_SHOP_URL = "URL"
    val KEY_SHOP_DESCRIPTION = "DESCRIPTION"

    val KEY_SHOP_LATITUDE = "LATITUDE"
    val KEY_SHOP_LONGITUDE = "LONGITUDE"
    val KEY_SHOP_OPENING_HOURS = "OPENING_HOURS"

    val ALL_COLUMNS = arrayOf(KEY_SHOP_DATABASE_ID,
            KEY_SHOP_ID_JSON,
            KEY_ELEMENT_TYPE,
            KEY_SHOP_NAME,
            KEY_SHOP_IMAGE_URL,
            KEY_SHOP_LOGO_IMAGE_URL,
            KEY_SHOP_ADDRESS,
            KEY_SHOP_URL,
            KEY_SHOP_DESCRIPTION,
            KEY_SHOP_LATITUDE,
            KEY_SHOP_LONGITUDE,
            KEY_SHOP_OPENING_HOURS)

    val SQL_SCRIPT_CREATE_SHOP_TABLE = (
            "create table " + TABLE_SHOP
                    + "( "
                    + KEY_SHOP_DATABASE_ID + " integer primary key autoincrement, "
                    + KEY_SHOP_ID_JSON + " integer, "
                    + KEY_ELEMENT_TYPE + " integer, "
                    + KEY_SHOP_NAME + " text not null,"
                    + KEY_SHOP_IMAGE_URL + " text, "
                    + KEY_SHOP_LOGO_IMAGE_URL + " text, "
                    + KEY_SHOP_ADDRESS + " text,"
                    + KEY_SHOP_URL + " text,"
                    + KEY_SHOP_LATITUDE + " real,"
                    + KEY_SHOP_LONGITUDE + " real, "
                    + KEY_SHOP_DESCRIPTION + " text, "
                    + KEY_SHOP_OPENING_HOURS + " text "
                    + ");")

    val DROP_DATABASE_SCRIPTS = ""

    val CREATE_DATABASE_SCRIPTS = arrayOf(SQL_SCRIPT_CREATE_SHOP_TABLE)

}