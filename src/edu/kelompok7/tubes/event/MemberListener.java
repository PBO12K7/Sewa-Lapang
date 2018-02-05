/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.event;

import edu.kelompok7.tubes.entity.Members;
import edu.kelompok7.tubes.model.MemberModel;

/**
 *
 * @author Flow
 */
public interface MemberListener {
    public void onInsert(Members member);

    public void onChange(MemberModel model);

    public void onDelete();

    public void onUpdate(Members member);
}
