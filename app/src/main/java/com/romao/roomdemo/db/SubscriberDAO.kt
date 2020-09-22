package com.romao.roomdemo.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDAO {

    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber):Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber):Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber):Int

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll():Int

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers():LiveData<List<Subscriber>>



/*
    @Insert
    fun insertSubscriber2(subscriber: Subscriber):Long

    @Insert
    fun insertSubscribers(subscriber1: Subscriber, subscriber2:Subscriber, subscriber3:Subscriber):List<Long>

    @Insert
    fun insertSubscribers(subscribers:List<Subscriber>):List<Long>

    @Insert
    fun insertSubscriber2(subscriber:Subscriber, subscribers:List<Subscriber>):List<Long>
*/
}