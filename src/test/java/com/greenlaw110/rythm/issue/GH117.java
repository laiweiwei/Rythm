/* 
 * Copyright (C) 2013 The Rythm Engine project
 * Gelin Luo <greenlaw110(at)gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.greenlaw110.rythm.issue;

import com.greenlaw110.rythm.TestBase;
import com.greenlaw110.rythm.extension.ILang;
import org.junit.Test;

/**
 * Verify https://github.com/greenlaw110/Rythm/issues/117
 */
public class GH117 extends TestBase {
    @Test
    public void test() {
        System.getProperties().put("default.template_lang.impl", ILang.DefImpl.CSV);
        t = "@for(\"FirstName,LastName,Email\"){@__sep}";
        s = r(t);
        eq("FirstName,LastName,Email");
    }
}