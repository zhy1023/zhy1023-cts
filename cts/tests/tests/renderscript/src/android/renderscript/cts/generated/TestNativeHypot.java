/*
 * Copyright (C) 2016 The Android Open Source Project
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

// Don't edit this file!  It is auto-generated by frameworks/rs/api/generate.sh.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;
import android.renderscript.cts.Target;

import java.util.Arrays;

public class TestNativeHypot extends RSBaseCompute {

    private ScriptC_TestNativeHypot script;
    private ScriptC_TestNativeHypotRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestNativeHypot(mRS);
        scriptRelaxed = new ScriptC_TestNativeHypotRelaxed(mRS);
    }

    @Override
    protected void tearDown() throws Exception {
        script.destroy();
        scriptRelaxed.destroy();
        super.tearDown();
    }

    public class ArgumentsFloatFloatFloat {
        public float inA;
        public float inB;
        public Target.Floaty out;
    }

    private void checkNativeHypotFloatFloatFloat() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3d61f129bdf66001l, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3d61f129bdf66002l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotFloatFloatFloat(inA, out);
            verifyResultsNativeHypotFloatFloatFloat(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotFloatFloatFloat(inA, out);
            verifyResultsNativeHypotFloatFloatFloat(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloatFloatFloat: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotFloatFloatFloat(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        float[] arrayInA = new float[INPUTSIZE * 1];
        Arrays.fill(arrayInA, (float) 42);
        inA.copyTo(arrayInA);
        float[] arrayInB = new float[INPUTSIZE * 1];
        Arrays.fill(arrayInB, (float) 42);
        inB.copyTo(arrayInB);
        float[] arrayOut = new float[INPUTSIZE * 1];
        Arrays.fill(arrayOut, (float) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inA = arrayInA[i];
                args.inB = arrayInB[i];
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.FLOAT, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 1 + j]);
                        if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotFloatFloatFloat" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotFloat2Float2Float2() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x92a8064760a50e4dl, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x92a8064760a50e4el, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotFloat2Float2Float2(inA, out);
            verifyResultsNativeHypotFloat2Float2Float2(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotFloat2Float2Float2(inA, out);
            verifyResultsNativeHypotFloat2Float2Float2(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat2Float2Float2: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotFloat2Float2Float2(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        float[] arrayInA = new float[INPUTSIZE * 2];
        Arrays.fill(arrayInA, (float) 42);
        inA.copyTo(arrayInA);
        float[] arrayInB = new float[INPUTSIZE * 2];
        Arrays.fill(arrayInB, (float) 42);
        inB.copyTo(arrayInB);
        float[] arrayOut = new float[INPUTSIZE * 2];
        Arrays.fill(arrayOut, (float) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inA = arrayInA[i * 2 + j];
                args.inB = arrayInB[i * 2 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.FLOAT, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 2 + j]);
                        if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotFloat2Float2Float2" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotFloat3Float3Float3() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xe70ce46762830feel, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xe70ce46762830fefl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotFloat3Float3Float3(inA, out);
            verifyResultsNativeHypotFloat3Float3Float3(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat3Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotFloat3Float3Float3(inA, out);
            verifyResultsNativeHypotFloat3Float3Float3(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat3Float3Float3: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotFloat3Float3Float3(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        float[] arrayInA = new float[INPUTSIZE * 4];
        Arrays.fill(arrayInA, (float) 42);
        inA.copyTo(arrayInA);
        float[] arrayInB = new float[INPUTSIZE * 4];
        Arrays.fill(arrayInB, (float) 42);
        inB.copyTo(arrayInB);
        float[] arrayOut = new float[INPUTSIZE * 4];
        Arrays.fill(arrayOut, (float) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inA = arrayInA[i * 4 + j];
                args.inB = arrayInB[i * 4 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.FLOAT, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 4 + j]);
                        if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotFloat3Float3Float3" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotFloat4Float4Float4() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x3b71c2876461118fl, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x3b71c28764611190l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotFloat4Float4Float4(inA, out);
            verifyResultsNativeHypotFloat4Float4Float4(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat4Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotFloat4Float4Float4(inA, out);
            verifyResultsNativeHypotFloat4Float4Float4(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotFloat4Float4Float4: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotFloat4Float4Float4(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        float[] arrayInA = new float[INPUTSIZE * 4];
        Arrays.fill(arrayInA, (float) 42);
        inA.copyTo(arrayInA);
        float[] arrayInB = new float[INPUTSIZE * 4];
        Arrays.fill(arrayInB, (float) 42);
        inB.copyTo(arrayInB);
        float[] arrayOut = new float[INPUTSIZE * 4];
        Arrays.fill(arrayOut, (float) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inA = arrayInA[i * 4 + j];
                args.inB = arrayInB[i * 4 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.FLOAT, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 4 + j]);
                        if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotFloat4Float4Float4" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    public class ArgumentsHalfHalfHalf {
        public short inA;
        public double inADouble;
        public short inB;
        public double inBDouble;
        public Target.Floaty out;
    }

    private void checkNativeHypotHalfHalfHalf() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 1, 0x7b9a708c93522f56l, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 1, 0x7b9a708c93522f57l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 1), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotHalfHalfHalf(inA, out);
            verifyResultsNativeHypotHalfHalfHalf(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalfHalfHalf: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotHalfHalfHalf(inA, out);
            verifyResultsNativeHypotHalfHalfHalf(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalfHalfHalf: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotHalfHalfHalf(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        short[] arrayInA = new short[INPUTSIZE * 1];
        Arrays.fill(arrayInA, (short) 42);
        inA.copyTo(arrayInA);
        short[] arrayInB = new short[INPUTSIZE * 1];
        Arrays.fill(arrayInB, (short) 42);
        inB.copyTo(arrayInB);
        short[] arrayOut = new short[INPUTSIZE * 1];
        Arrays.fill(arrayOut, (short) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsHalfHalfHalf args = new ArgumentsHalfHalfHalf();
                args.inA = arrayInA[i];
                args.inADouble = Float16Utils.convertFloat16ToDouble(args.inA);
                args.inB = arrayInB[i];
                args.inBDouble = Float16Utils.convertFloat16ToDouble(args.inB);
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.HALF, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 1 + j]))) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 1 + j]);
                        message.append("\n");
                        message.append("Actual   output out (in double): ");
                        appendVariableToMessage(message, Float16Utils.convertFloat16ToDouble(arrayOut[i * 1 + j]));
                        if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 1 + j]))) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotHalfHalfHalf" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotHalf2Half2Half2() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 2, 0xcd23346f4dca3f6l, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 2, 0xcd23346f4dca3f7l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 2), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotHalf2Half2Half2(inA, out);
            verifyResultsNativeHypotHalf2Half2Half2(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf2Half2Half2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotHalf2Half2Half2(inA, out);
            verifyResultsNativeHypotHalf2Half2Half2(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf2Half2Half2: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotHalf2Half2Half2(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        short[] arrayInA = new short[INPUTSIZE * 2];
        Arrays.fill(arrayInA, (short) 42);
        inA.copyTo(arrayInA);
        short[] arrayInB = new short[INPUTSIZE * 2];
        Arrays.fill(arrayInB, (short) 42);
        inB.copyTo(arrayInB);
        short[] arrayOut = new short[INPUTSIZE * 2];
        Arrays.fill(arrayOut, (short) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsHalfHalfHalf args = new ArgumentsHalfHalfHalf();
                args.inA = arrayInA[i * 2 + j];
                args.inADouble = Float16Utils.convertFloat16ToDouble(args.inA);
                args.inB = arrayInB[i * 2 + j];
                args.inBDouble = Float16Utils.convertFloat16ToDouble(args.inB);
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.HALF, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 2 + j]))) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 2 + j]);
                        message.append("\n");
                        message.append("Actual   output out (in double): ");
                        appendVariableToMessage(message, Float16Utils.convertFloat16ToDouble(arrayOut[i * 2 + j]));
                        if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 2 + j]))) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotHalf2Half2Half2" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotHalf3Half3Half3() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 3, 0x3286b330537bb4c5l, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 3, 0x3286b330537bb4c6l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 3), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotHalf3Half3Half3(inA, out);
            verifyResultsNativeHypotHalf3Half3Half3(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf3Half3Half3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotHalf3Half3Half3(inA, out);
            verifyResultsNativeHypotHalf3Half3Half3(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf3Half3Half3: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotHalf3Half3Half3(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        short[] arrayInA = new short[INPUTSIZE * 4];
        Arrays.fill(arrayInA, (short) 42);
        inA.copyTo(arrayInA);
        short[] arrayInB = new short[INPUTSIZE * 4];
        Arrays.fill(arrayInB, (short) 42);
        inB.copyTo(arrayInB);
        short[] arrayOut = new short[INPUTSIZE * 4];
        Arrays.fill(arrayOut, (short) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsHalfHalfHalf args = new ArgumentsHalfHalfHalf();
                args.inA = arrayInA[i * 4 + j];
                args.inADouble = Float16Utils.convertFloat16ToDouble(args.inA);
                args.inB = arrayInB[i * 4 + j];
                args.inBDouble = Float16Utils.convertFloat16ToDouble(args.inB);
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.HALF, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]))) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 4 + j]);
                        message.append("\n");
                        message.append("Actual   output out (in double): ");
                        appendVariableToMessage(message, Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]));
                        if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]))) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotHalf3Half3Half3" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    private void checkNativeHypotHalf4Half4Half4() {
        Allocation inA = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 4, 0x583b3319b21ac594l, false);
        Allocation inB = createRandomAllocation(mRS, Element.DataType.FLOAT_16, 4, 0x583b3319b21ac595l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 4), INPUTSIZE);
            script.set_gAllocInB(inB);
            script.forEach_testNativeHypotHalf4Half4Half4(inA, out);
            verifyResultsNativeHypotHalf4Half4Half4(inA, inB, out, false);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf4Half4Half4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_16, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInB(inB);
            scriptRelaxed.forEach_testNativeHypotHalf4Half4Half4(inA, out);
            verifyResultsNativeHypotHalf4Half4Half4(inA, inB, out, true);
            out.destroy();
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeHypotHalf4Half4Half4: " + e.toString());
        }
        inA.destroy();
        inB.destroy();
    }

    private void verifyResultsNativeHypotHalf4Half4Half4(Allocation inA, Allocation inB, Allocation out, boolean relaxed) {
        short[] arrayInA = new short[INPUTSIZE * 4];
        Arrays.fill(arrayInA, (short) 42);
        inA.copyTo(arrayInA);
        short[] arrayInB = new short[INPUTSIZE * 4];
        Arrays.fill(arrayInB, (short) 42);
        inB.copyTo(arrayInB);
        short[] arrayOut = new short[INPUTSIZE * 4];
        Arrays.fill(arrayOut, (short) 42);
        out.copyTo(arrayOut);
        StringBuilder message = new StringBuilder();
        boolean errorFound = false;
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsHalfHalfHalf args = new ArgumentsHalfHalfHalf();
                args.inA = arrayInA[i * 4 + j];
                args.inADouble = Float16Utils.convertFloat16ToDouble(args.inA);
                args.inB = arrayInB[i * 4 + j];
                args.inBDouble = Float16Utils.convertFloat16ToDouble(args.inB);
                // Figure out what the outputs should have been.
                Target target = new Target(Target.FunctionType.NATIVE, Target.ReturnType.HALF, relaxed);
                CoreMathVerifier.computeNativeHypot(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]))) {
                    valid = false;
                }
                if (!valid) {
                    if (!errorFound) {
                        errorFound = true;
                        message.append("Input inA: ");
                        appendVariableToMessage(message, args.inA);
                        message.append("\n");
                        message.append("Input inB: ");
                        appendVariableToMessage(message, args.inB);
                        message.append("\n");
                        message.append("Expected output out: ");
                        appendVariableToMessage(message, args.out);
                        message.append("\n");
                        message.append("Actual   output out: ");
                        appendVariableToMessage(message, arrayOut[i * 4 + j]);
                        message.append("\n");
                        message.append("Actual   output out (in double): ");
                        appendVariableToMessage(message, Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]));
                        if (!args.out.couldBe(Float16Utils.convertFloat16ToDouble(arrayOut[i * 4 + j]))) {
                            message.append(" FAIL");
                        }
                        message.append("\n");
                        message.append("Errors at");
                    }
                    message.append(" [");
                    message.append(Integer.toString(i));
                    message.append(", ");
                    message.append(Integer.toString(j));
                    message.append("]");
                }
            }
        }
        assertFalse("Incorrect output for checkNativeHypotHalf4Half4Half4" +
                (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), errorFound);
    }

    public void testNativeHypot() {
        checkNativeHypotFloatFloatFloat();
        checkNativeHypotFloat2Float2Float2();
        checkNativeHypotFloat3Float3Float3();
        checkNativeHypotFloat4Float4Float4();
        checkNativeHypotHalfHalfHalf();
        checkNativeHypotHalf2Half2Half2();
        checkNativeHypotHalf3Half3Half3();
        checkNativeHypotHalf4Half4Half4();
    }
}