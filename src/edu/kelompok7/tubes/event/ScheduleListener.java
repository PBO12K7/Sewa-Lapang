/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.event;

import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.model.ScheduleModel;

/**
 *
 * @author Flow
 */
public interface ScheduleListener {
    public void onInsert(Schedules jadwal);

    public void onChange(ScheduleModel model);

    public void onDelete();

    public void onUpdate(Schedules jadwal);
}
