/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.service;

import edu.kelompok7.tubes.entity.Members;
import edu.kelompok7.tubes.error.ScheduleException;
import java.util.List;

/**
 *
 * @author Flow
 */
public interface MemberDao {
     public void insertMember(Members member) throws ScheduleException;

    public void updateMember(Members member) throws ScheduleException;

    public void deleteMember(Integer memberId) throws ScheduleException;

    public Members getMember(Integer memberId) throws ScheduleException;

    public List<Members> selectAllMember() throws ScheduleException;

}
