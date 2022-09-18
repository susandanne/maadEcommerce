package com.example.maadecoommerce

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Productscart::class],
                   version= 1,
)
abstract class CartDatabse : RoomDatabase() {

    abstract fun getcartdao():CartDaos

    companion object{

        fun getdatabase(context: Context):CartDatabse {
            var instance:CartDatabse?=null
           return if (instance==null){
                instance=Room.databaseBuilder(context,CartDatabse::class.java,"cartDB")
                    .build()
                     instance
            }

           else{
            return instance

            }

        }

        }
    }

