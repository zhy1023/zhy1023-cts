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

#pragma version(1)
#pragma rs java_package_name(android.renderscript.cts)

rs_allocation gAllocInTarget;

float __attribute__((kernel)) testNextafterFloatFloatFloat(float inV, unsigned int x) {
    float inTarget = rsGetElementAt_float(gAllocInTarget, x);
    return nextafter(inV, inTarget);
}

float2 __attribute__((kernel)) testNextafterFloat2Float2Float2(float2 inV, unsigned int x) {
    float2 inTarget = rsGetElementAt_float2(gAllocInTarget, x);
    return nextafter(inV, inTarget);
}

float3 __attribute__((kernel)) testNextafterFloat3Float3Float3(float3 inV, unsigned int x) {
    float3 inTarget = rsGetElementAt_float3(gAllocInTarget, x);
    return nextafter(inV, inTarget);
}

float4 __attribute__((kernel)) testNextafterFloat4Float4Float4(float4 inV, unsigned int x) {
    float4 inTarget = rsGetElementAt_float4(gAllocInTarget, x);
    return nextafter(inV, inTarget);
}