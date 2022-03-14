package com.example.dsa_taller01

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class misqLitehelper (context: Context) : SQLiteOpenHelper (
    context, "users.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        val ordenCreate = "CREATE TABLE users" + "(id INTEGER PRIMARY KEY AUTOINCREMENT," + "nombre TEXT, pwd TEXT)"
        p0!!.execSQL(ordenCreate)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        val ordenBorrado = "DROP TABLE IF EXISTS users"
        p0!!.execSQL(ordenBorrado)
        onCreate(p0)
    }

    fun addData(name: String, pwd: String){
        val datos  = ContentValues()
        datos.put("nombre", name)
        datos.put("pwd", pwd)

        val db = this.writableDatabase
        db.insert("users", null, datos)
        db.close()
    }
}