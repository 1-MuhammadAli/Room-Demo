package com.example.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import java.net.IDN


@Dao
interface EmployeeDao {

    @Insert
     fun insert(employeeEntity: EmployeeEntity)

    @Update
     fun update(employeeEntity: EmployeeEntity)

    @Delete
     fun delete(employeeEntity: EmployeeEntity)

    @Query("SELECT * FROM `employee-table`")
    fun fetchAllEmployees():Flow<List<EmployeeEntity>>

    @Query("SELECT * FROM `employee-table` where id=:id")
    fun fetchEmployeeById(id: Int):Flow<EmployeeEntity>


}