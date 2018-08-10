/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/abhijeet/git/POCs/achitecture components pocs/WorkManagerSample/app/src/main/rs/grayscale.rs
 */

package com.example.background;

import android.support.v8.renderscript.*;
import com.example.background.grayscaleBitCode;

/**
 * @hide
 */
public class ScriptC_grayscale extends ScriptC {
    private static final String __rs_resource_name = "grayscale";
    // Constructor
    public  ScriptC_grayscale(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              grayscaleBitCode.getBitCode32(),
              grayscaleBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __SCRIPT = Element.SCRIPT(rs);
        __U32 = Element.U32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __SCRIPT;
    private Element __U32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_SCRIPT;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_in = 0;
    private Allocation mExportVar_in;
    public synchronized void set_in(Allocation v) {
        setVar(mExportVarIdx_in, v);
        mExportVar_in = v;
    }

    public Allocation get_in() {
        return mExportVar_in;
    }

    public Script.FieldID getFieldID_in() {
        return createFieldID(mExportVarIdx_in, null);
    }

    private final static int mExportVarIdx_out = 1;
    private Allocation mExportVar_out;
    public synchronized void set_out(Allocation v) {
        setVar(mExportVarIdx_out, v);
        mExportVar_out = v;
    }

    public Allocation get_out() {
        return mExportVar_out;
    }

    public Script.FieldID getFieldID_out() {
        return createFieldID(mExportVarIdx_out, null);
    }

    private final static int mExportVarIdx_script = 2;
    private Script mExportVar_script;
    public synchronized void set_script(Script v) {
        setVar(mExportVarIdx_script, v);
        mExportVar_script = v;
    }

    public Script get_script() {
        return mExportVar_script;
    }

    public Script.FieldID getFieldID_script() {
        return createFieldID(mExportVarIdx_script, null);
    }

    private final static int mExportVarIdx_width = 3;
    private long mExportVar_width;
    public synchronized void set_width(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_width, __rs_fp_U32);
        mExportVar_width = v;
    }

    public long get_width() {
        return mExportVar_width;
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(mExportVarIdx_width, null);
    }

    private final static int mExportVarIdx_height = 4;
    private long mExportVar_height;
    public synchronized void set_height(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_height, __rs_fp_U32);
        mExportVar_height = v;
    }

    public long get_height() {
        return mExportVar_height;
    }

    public Script.FieldID getFieldID_height() {
        return createFieldID(mExportVarIdx_height, null);
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 31, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_filter = 0;
    public void invoke_filter() {
        invoke(mExportFuncIdx_filter);
    }

}

