/*******************************************************************************
 * Copyright (c) 2017-2018 Aion foundation.
 *
 *     This file is part of the aion network project.
 *
 *     The aion network project is free software: you can redistribute it
 *     and/or modify it under the terms of the GNU General Public License
 *     as published by the Free Software Foundation, either version 3 of
 *     the License, or any later version.
 *
 *     The aion network project is distributed in the hope that it will
 *     be useful, but WITHOUT ANY WARRANTY; without even the implied
 *     warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *     See the GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with the aion network project source files.
 *     If not, see <https://www.gnu.org/licenses/>.
 *
 * Contributors to the aion source files in decreasing order of code volume:
 * 
 *     Aion foundation.
 *     
 ******************************************************************************/

package org.aion.p2p.a0.msg;

import org.aion.p2p.CTRL;
import org.aion.p2p.IMsg;
import org.aion.p2p.MsgBase;
import org.aion.p2p.P2pVer;
/**
 * 
 * @author chris
 *
 */
public final class ReqActiveNodes extends MsgBase {

    private final static byte ctrl = CTRL.NET0;
    
    private final static byte act = ACT.REQ_ACTIVE_NODES;
    
    public short getVer() {
        return P2pVer.VER0;
    }
    
    @Override
    public byte[] encode() {
        return null;
    }

    @Override
    public byte getCtrl() {
        return ctrl;
    }

    @Override
    public byte getAct() {
        return act;
    }
    
}
