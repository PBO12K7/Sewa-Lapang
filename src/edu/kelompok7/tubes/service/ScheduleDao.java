/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.service;

import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.error.ScheduleException;
import java.util.List;

/**
 *
 * @author Flow
 */
public interface ScheduleDao {

    public void insertSchedule(Schedules jadwal) throws ScheduleException;
    
    public void updateSchedule (Schedules jadwal) throws  ScheduleException;
    
    public void deleteSchedule(Integer sewaId) throws  ScheduleException;
    
    public Schedules getSchedule (Integer sewaId) throws  ScheduleException;
    
    public List<Schedules> selectAllSchedules() throws ScheduleException;
            
}
